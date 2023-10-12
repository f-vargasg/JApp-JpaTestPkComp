
package com.fvgprinc.app.jpatestpkcomp.be;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;


/**
 *
 * @author garfi
 */

@Embeddable
public class CuentaId implements Serializable {

    private int idClienteN;

    /**
     * Get the value of idClienteN
     *
     * @return the value of idClienteN
     */
    public int getIdClienteN() {
        return idClienteN;
    }

    /**
     * Set the value of idClienteN
     *
     * @param idClienteN new value of idClienteN
     */
    public void setIdClienteN(int idClienteN) {
        this.idClienteN = idClienteN;
    }

    private int idCuentaN;

    /**
     * Get the value of idCuentaN
     *
     * @return the value of idCuentaN
     */
    public int getIdCuentaN() {
        return idCuentaN;
    }

    /**
     * Set the value of idCuentaN
     *
     * @param idCuentaN new value of idCuentaN
     */
    public void setIdCuentaN(int idCuentaN) {
        this.idCuentaN = idCuentaN;
    }

    public CuentaId() {
    }

    public CuentaId(int idClienteN, int idCuentaN) {
        this.idClienteN = idClienteN;
        this.idCuentaN = idCuentaN;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CuentaId)) {
            return false;
        }
        CuentaId clienteId = (CuentaId) obj;
        return Objects.equals(getIdClienteN(), clienteId.getIdClienteN())
                && Objects.equals(getIdCuentaN(), clienteId.getIdCuentaN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdClienteN(), getIdCuentaN());
    }

}
