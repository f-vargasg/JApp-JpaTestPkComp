/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvgprinc.app.jpatestpkcomp.ui;

import com.fvgprinc.app.jpatestpkcomp.be.Cuenta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author garfi
 */
public class CuentaTableModel extends AbstractTableModel {
private final String[] columnNames = {"Cod.Cliente", "Cod.Cuenta", "Nombre Cuenta"};


    public CuentaTableModel(ArrayList<Cuenta> lugarList) {
        this.cuentaLst = lugarList;
    }

    // Propiedad Lista
    private List<Cuenta> cuentaLst;

    public List<Cuenta> getCuentaLst() {
        return cuentaLst;
    }

    public void setCuentaLst(List<Cuenta> cuentaLst) {
        this.cuentaLst = cuentaLst;
        fireTableDataChanged();
    }


    // añadir elementos a la lista

    public void setCuenta(Cuenta pCuenta) {
        cuentaLst.add(pCuenta);
        fireTableRowsInserted(cuentaLst.size() - 1, cuentaLst.size() - 1);
    }

    @Override
    public int getRowCount() {
        return cuentaLst.size();
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

        Cuenta cuenta = cuentaLst.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return cuenta.getId().getIdClienteN();
            }

            case 1 -> {
                return cuenta.getId().getIdCuentaN();
            }

            case 2 -> {
                return cuenta.getNomCuenta();
            }

        }
        return null;
    }    
}
