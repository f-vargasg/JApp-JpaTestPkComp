package com.fvgprinc.app.jpatestpkcomp.dl;

import com.fvgprinc.app.jpatestpkcomp.be.Cliente;
import com.fvgprinc.app.jpatestpkcomp.dl.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author garfi
 */
public class ClienteDl {

    ClienteJpaController clienteJpa = new ClienteJpaController();

    public ClienteDl() {
    }

    public void crear(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public Cliente buscarPorId(int i) {
        return clienteJpa.findCliente(i);
    }

    public Cliente leerDatosPorId(int i) {
        return clienteJpa.findCliente(i);
    }

    public void modificar(Cliente cliente) {
        try {
            clienteJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cliente> leerDatos() {
        List<Cliente> lstClte = clienteJpa.findClienteEntities();
        return new ArrayList<>(lstClte);
    }

    public void eliminar(int idUsuario) {
        try {
            clienteJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ClienteDl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
