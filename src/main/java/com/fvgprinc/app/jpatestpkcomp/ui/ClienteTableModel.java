/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvgprinc.app.jpatestpkcomp.ui;

import com.fvgprinc.app.jpatestpkcomp.be.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author garfi
 */
public class ClienteTableModel extends AbstractTableModel{
    private final String[] columnNames = {"Cod.Cliente","Nom.Cliente"};


    public ClienteTableModel(ArrayList<Cliente> lstCliente) {
        this.lstCliente = lstCliente;
    }

    private List<Cliente> lstCliente;
    
    public List<Cliente> getLstCliente() {
        return lstCliente;
    }

    public void setLstCliente(List<Cliente> lstCliente) {
        this.lstCliente = lstCliente;
        fireTableDataChanged();
    }

    public void setCliente(Cliente pCliente) {
        lstCliente.add(pCliente);
        fireTableRowsInserted(lstCliente.size() - 1, lstCliente.size() - 1);
    }

    @Override
    public int getRowCount() {
        return lstCliente.size();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Cliente cliente = lstCliente.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return cliente.getIdClienteN();
            }

            case 1 -> {
                return cliente.getNomCliente();
            }

            default -> {
            }
        }
        return null;
    }
}
