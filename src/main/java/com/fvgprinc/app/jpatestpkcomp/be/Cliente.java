
package com.fvgprinc.app.jpatestpkcomp.be;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author garfi
 */
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idClienteN;

    public int getIdClienteN() {
        return idClienteN;
    }

    public void setIdClienteN(int idClienteN) {
        this.idClienteN = idClienteN;
    }

    private String nomCliente;

    /**
     * Get the value of nomCliente
     *
     * @return the value of nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * Set the value of nomCliente
     *
     * @param nomCliente new value of nomCliente
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    @OneToMany(mappedBy = "cliente")
    private List<Cuenta> cuentas;

    /**
     * Get the value of cuentas
     *
     * @return the value of cuentas
     */
    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * Set the value of cuentas
     *
     * @param cuentas new value of cuentas
     */
    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Cliente() {
    }

    public Cliente(int idClienteN, String nomCliente, List<Cuenta> cuentas) {
        this.idClienteN = idClienteN;
        this.nomCliente = nomCliente;
        this.cuentas = cuentas;
    }

    

}
