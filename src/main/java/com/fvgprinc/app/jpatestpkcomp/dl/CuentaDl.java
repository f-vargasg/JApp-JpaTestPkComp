
package com.fvgprinc.app.jpatestpkcomp.dl;

import com.fvgprinc.app.jpatestpkcomp.be.Cuenta;
import com.fvgprinc.app.jpatestpkcomp.be.CuentaId;
import com.fvgprinc.app.jpatestpkcomp.dl.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author garfi
 */
public class CuentaDl {

    CuentaJpaController cuentaJpa = new CuentaJpaController();

    public CuentaDl() {
    }

    public void crear(Cuenta cuenta) {
        try {
            if (cuenta.getId().getIdCuentaN() <= 0 ) {
                // int nvaCta = cuentaJpa.findMaxCuentaIdByClienteId(cuenta.getId().getIdClienteN()) + 1;
                int nvaCta = obtenerProxIdCta(cuenta.getId().getIdClienteN());
                cuenta.getId().setIdCuentaN(nvaCta);
            }
            cuentaJpa.create(cuenta);
        } catch (Exception ex) {
            Logger.getLogger(CuentaDl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public int obtenerProxIdCta(int i) {
        return cuentaJpa.findMaxCuentaIdByClienteId(i) + 1;
    }

    public Cuenta leerDatosPorId(CuentaId cuentaId) {
        return cuentaJpa.findCuenta(cuentaId);
    }

    public void modificar(Cuenta cuenta) {
        try {
            cuentaJpa.edit(cuenta);
        } catch (Exception ex) {
            Logger.getLogger(CuentaDl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cuenta> leerDatosPorId() {
        List<Cuenta> lstCta = cuentaJpa.findCuentaEntities();
        return new ArrayList<>(lstCta);
               
    }

    public void eliminar(CuentaId cuentaId) {
        try {
            cuentaJpa.destroy(cuentaId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CuentaDl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
