
package com.fvgprinc.app.jpatestpkcomp.dl;

import com.fvgprinc.app.jpatestpkcomp.be.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.fvgprinc.app.jpatestpkcomp.be.Cuenta;
import com.fvgprinc.app.jpatestpkcomp.dl.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author garfi
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public ClienteJpaController() {
        this.emf = Persistence.createEntityManagerFactory("ClientsPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getCuentas() == null) {
            cliente.setCuentas(new ArrayList<Cuenta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Cuenta> attachedCuentas = new ArrayList<Cuenta>();
            for (Cuenta cuentasCuentaToAttach : cliente.getCuentas()) {
                cuentasCuentaToAttach = em.getReference(cuentasCuentaToAttach.getClass(), cuentasCuentaToAttach.getId());
                attachedCuentas.add(cuentasCuentaToAttach);
            }
            cliente.setCuentas(attachedCuentas);
            em.persist(cliente);
            for (Cuenta cuentasCuenta : cliente.getCuentas()) {
                Cliente oldClienteOfCuentasCuenta = cuentasCuenta.getCliente();
                cuentasCuenta.setCliente(cliente);
                cuentasCuenta = em.merge(cuentasCuenta);
                if (oldClienteOfCuentasCuenta != null) {
                    oldClienteOfCuentasCuenta.getCuentas().remove(cuentasCuenta);
                    oldClienteOfCuentasCuenta = em.merge(oldClienteOfCuentasCuenta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getIdClienteN());
            List<Cuenta> cuentasOld = persistentCliente.getCuentas();
            List<Cuenta> cuentasNew = cliente.getCuentas();
            List<Cuenta> attachedCuentasNew = new ArrayList<Cuenta>();
            for (Cuenta cuentasNewCuentaToAttach : cuentasNew) {
                cuentasNewCuentaToAttach = em.getReference(cuentasNewCuentaToAttach.getClass(), cuentasNewCuentaToAttach.getId());
                attachedCuentasNew.add(cuentasNewCuentaToAttach);
            }
            cuentasNew = attachedCuentasNew;
            cliente.setCuentas(cuentasNew);
            cliente = em.merge(cliente);
            for (Cuenta cuentasOldCuenta : cuentasOld) {
                if (!cuentasNew.contains(cuentasOldCuenta)) {
                    cuentasOldCuenta.setCliente(null);
                    cuentasOldCuenta = em.merge(cuentasOldCuenta);
                }
            }
            for (Cuenta cuentasNewCuenta : cuentasNew) {
                if (!cuentasOld.contains(cuentasNewCuenta)) {
                    Cliente oldClienteOfCuentasNewCuenta = cuentasNewCuenta.getCliente();
                    cuentasNewCuenta.setCliente(cliente);
                    cuentasNewCuenta = em.merge(cuentasNewCuenta);
                    if (oldClienteOfCuentasNewCuenta != null && !oldClienteOfCuentasNewCuenta.equals(cliente)) {
                        oldClienteOfCuentasNewCuenta.getCuentas().remove(cuentasNewCuenta);
                        oldClienteOfCuentasNewCuenta = em.merge(oldClienteOfCuentasNewCuenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getIdClienteN();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getIdClienteN();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<Cuenta> cuentas = cliente.getCuentas();
            for (Cuenta cuentasCuenta : cuentas) {
                cuentasCuenta.setCliente(null);
                cuentasCuenta = em.merge(cuentasCuenta);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
