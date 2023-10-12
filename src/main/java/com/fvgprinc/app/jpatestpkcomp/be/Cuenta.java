
package com.fvgprinc.app.jpatestpkcomp.be;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author garfi
 */
@Entity
public class Cuenta implements Serializable {

    @EmbeddedId
    private CuentaId id;

    public CuentaId getId() {
        return id;
    }

    public void setId(CuentaId id) {
        this.id = id;
    }

    private String nomCuenta;

    /**
     * Get the value of nomCuenta
     *
     * @return the value of nomCuenta
     */
    public String getNomCuenta() {
        return nomCuenta;
    }

    /**
     * Set the value of nomCuenta
     *
     * @param nomCuenta new value of nomCuenta
     */
    public void setNomCuenta(String nomCuenta) {
        this.nomCuenta = nomCuenta;
    }

    @ManyToOne
    @JoinColumn(name = "idClienteN", insertable = false, updatable = false)
    private Cliente cliente;

    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cuenta() {
    }

    public Cuenta(CuentaId id, String nomCuenta, Cliente cliente) {
        this.id = id;
        this.nomCuenta = nomCuenta;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "(" + Integer.toString( this.getId().getIdClienteN() ) +  ", " +
                          Integer.toString(this.getId().getIdCuentaN()) + ", " + 
                          this.getNomCuenta() + ")";
                
    }

    

    

}
