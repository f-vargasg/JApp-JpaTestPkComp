/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvgprinc.app.jpatestpkcomp.bl;

import com.fvgprinc.app.jpatestpkcomp.be.Cuenta;
import com.fvgprinc.app.jpatestpkcomp.be.CuentaId;
import com.fvgprinc.app.jpatestpkcomp.dl.CuentaDl;
import java.util.ArrayList;

/**
 *
 * @author garfi
 */
public class CuentaBl {

    private CuentaDl cuentaDl = new CuentaDl();

    public CuentaBl() {
    }

    public void crear(Cuenta cuenta) {
        cuentaDl.crear(cuenta);
    }

    public Cuenta leerDatosPorId(CuentaId cuentaId) {
        return cuentaDl.leerDatosPorId(cuentaId);
    }

    public void modifcar(Cuenta cuenta) {
        cuentaDl.modificar(cuenta);
    }

    public ArrayList<Cuenta> leerDatos() {
        return cuentaDl.leerDatosPorId();
    }

    public void eliminar(CuentaId cuentaId) {
        cuentaDl.eliminar (cuentaId);
    }

    


}
