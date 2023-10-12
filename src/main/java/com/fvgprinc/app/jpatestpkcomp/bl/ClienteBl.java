
package com.fvgprinc.app.jpatestpkcomp.bl;

import com.fvgprinc.app.jpatestpkcomp.be.Cliente;
import com.fvgprinc.app.jpatestpkcomp.dl.ClienteDl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garfi
 */
public class ClienteBl {

    private ClienteDl clienteDl = new ClienteDl();

    public ClienteBl() {
    }

    public void crear(Cliente cliente) {
        clienteDl.crear(cliente);
    }

    public Cliente buscarPorId(int i) {
        return clienteDl.buscarPorId(i);
    }

    public Cliente leerDatosPorId(int i) {
        return clienteDl.leerDatosPorId(i);
    }

    public void modificar(Cliente cliente) {
        clienteDl.modificar(cliente) ;
    }

    public ArrayList<Cliente> leerDatos() {
        return clienteDl.leerDatos();
    }

    
}
