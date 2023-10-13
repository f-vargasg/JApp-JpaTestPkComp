package com.fvgprinc.app.jpatestpkcomp.ui;

import com.fvgprinc.app.jpatestpkcomp.be.Cliente;
import com.fvgprinc.app.jpatestpkcomp.bl.ClienteBl;
import com.fvgprinc.app.jpatestpkcomp.bl.CuentaBl;
import com.fvgprinc.app.jpatestpkcomp.be.Cuenta;
import com.fvgprinc.app.jpatestpkcomp.be.CuentaId;
import com.fvgprinc.tools.utilities.MySwingUtil;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author garfi
 */
public class JfrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JfrmPrincipal
     */
    ClienteBl clienteBl;
    CuentaBl cuentaBl;

    public JfrmPrincipal() {
        initComponents();
        initMyComponents();
    }

    private void initMyComponents() {
        this.clienteBl = new ClienteBl();
        this.cuentaBl = new CuentaBl();
        llenarTablaClientes();
        llenarTablaCuentas();

    }

    private void llenarTablaClientes() {
        ArrayList<Cliente> lst = clienteBl.leerDatos();
        ClienteTableModel modeloCliente = new ClienteTableModel(lst);
        jTblCliente.setModel(modeloCliente);
    }

    private void llenarTablaCuentas() {
        ArrayList<Cuenta> lst = cuentaBl.leerDatos();
        CuentaTableModel modeloCuenta = new CuentaTableModel(lst);
        jTblCuenta.setModel(modeloCuenta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnExit = new javax.swing.JButton();
        jTabPnlEntities = new javax.swing.JTabbedPane();
        jPnlCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCliente = new javax.swing.JTable();
        jBtnEditarCliente = new javax.swing.JButton();
        jBtnDelCliente = new javax.swing.JButton();
        jBtnCrearCliente = new javax.swing.JButton();
        jBtnRefreshCliente = new javax.swing.JButton();
        jPnlCuenta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblCuenta = new javax.swing.JTable();
        jBtnRefreshCuenta = new javax.swing.JButton();
        jBtnCrearCta = new javax.swing.JButton();
        jBtnEditarCta = new javax.swing.JButton();
        jBtnDelCta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jBtnExit.setText("Salir");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnExit);

        jTabPnlEntities.setPreferredSize(new java.awt.Dimension(106, 23));

        jTblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTblCliente);

        jBtnEditarCliente.setText("Editar Cliente");
        jBtnEditarCliente.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarClienteActionPerformed(evt);
            }
        });

        jBtnDelCliente.setText("Borrar Cliente");
        jBtnDelCliente.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelClienteActionPerformed(evt);
            }
        });

        jBtnCrearCliente.setText("Crear Cliente");
        jBtnCrearCliente.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearClienteActionPerformed(evt);
            }
        });

        jBtnRefreshCliente.setText("Refrescar");
        jBtnRefreshCliente.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnRefreshCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRefreshClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlClienteLayout = new javax.swing.GroupLayout(jPnlCliente);
        jPnlCliente.setLayout(jPnlClienteLayout);
        jPnlClienteLayout.setHorizontalGroup(
            jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jBtnRefreshCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnDelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlClienteLayout.setVerticalGroup(
            jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRefreshCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
        );

        jTabPnlEntities.addTab("Cliente", jPnlCliente);

        jTblCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTblCuenta);

        jBtnRefreshCuenta.setText("Refrescar");
        jBtnRefreshCuenta.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnRefreshCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRefreshCuentaActionPerformed(evt);
            }
        });

        jBtnCrearCta.setText("Crear Cuenta");
        jBtnCrearCta.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnCrearCta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearCtaActionPerformed(evt);
            }
        });

        jBtnEditarCta.setText("Editar Cuenta");
        jBtnEditarCta.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnEditarCta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarCtaActionPerformed(evt);
            }
        });

        jBtnDelCta.setText("Borrar Cuenta");
        jBtnDelCta.setPreferredSize(new java.awt.Dimension(106, 23));
        jBtnDelCta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelCtaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlCuentaLayout = new javax.swing.GroupLayout(jPnlCuenta);
        jPnlCuenta.setLayout(jPnlCuentaLayout);
        jPnlCuentaLayout.setHorizontalGroup(
            jPnlCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCuentaLayout.createSequentialGroup()
                .addGroup(jPnlCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlCuentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                    .addGroup(jPnlCuentaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jBtnRefreshCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCrearCta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnEditarCta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDelCta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnlCuentaLayout.setVerticalGroup(
            jPnlCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCrearCta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditarCta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDelCta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRefreshCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
        );

        jTabPnlEntities.addTab("Cuenta", jPnlCuenta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabPnlEntities, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabPnlEntities, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearClienteActionPerformed
        Cliente cliente = null;
        JfrmDlgClienteMnt jdcm = new JfrmDlgClienteMnt(this, true, clienteBl, cliente,
                MySwingUtil.FrmStates.FRMINSERT);
        jdcm.setLocationRelativeTo(this);
        jdcm.setTitle("Crear Cliente");
        jdcm.setVisible(true);

    }//GEN-LAST:event_jBtnCrearClienteActionPerformed

    private void jBtnCrearCtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearCtaActionPerformed
        JfrmDlgCuentaMnt jdcm = new JfrmDlgCuentaMnt(this, true, clienteBl, cuentaBl, null,
                MySwingUtil.FrmStates.FRMINSERT);
        jdcm.setLocationRelativeTo(this);
        jdcm.setTitle("Crear cuenta");
        jdcm.setVisible(true);

    }//GEN-LAST:event_jBtnCrearCtaActionPerformed

    private void jBtnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarClienteActionPerformed
        if (jTblCliente.getRowCount() > 0) {
            // que se haya seleccionado un elemento
            if (jTblCliente.getSelectedRow() != -1) {
                // obtener el id del elemento a elminar
                int idUsuario = Integer.parseInt(String.valueOf(jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0)));
                Cliente cliente = clienteBl.leerDatosPorId(idUsuario);
                // Editar Registro  (Ventana de edición)
                JfrmDlgClienteMnt jfrmDlg = new JfrmDlgClienteMnt(this, true, clienteBl, cliente, MySwingUtil.FrmStates.FRMUPDATE);
                jfrmDlg.setLocationRelativeTo(this);
                jfrmDlg.setTitle("Editar Cliente");
                jfrmDlg.setVisible(true);

            } else {
                MySwingUtil.mostrarMensaje("No seleccionó ningún registro", MySwingUtil.TD_ERROR, "Edición");
            }
        } else {
            MySwingUtil.mostrarMensaje("La tabla está vacía", MySwingUtil.TD_ERROR, "Edición");
        }
    }//GEN-LAST:event_jBtnEditarClienteActionPerformed

    private void jBtnEditarCtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarCtaActionPerformed
        if (jTblCuenta.getRowCount() > 0) {
            // que se haya seleccionado un elemento
            if (jTblCuenta.getSelectedRow() != -1) {
                // obtener el id del elemento a elminar
                int idClienteN = Integer.parseInt(String.valueOf(jTblCuenta.getValueAt(jTblCuenta.getSelectedRow(), 0)));
                int idCuentaN = Integer.parseInt(String.valueOf(jTblCuenta.getValueAt(jTblCuenta.getSelectedRow(), 1)));
                CuentaId ctaId = new CuentaId(idClienteN, idCuentaN);
                Cuenta cuenta = cuentaBl.leerDatosPorId(ctaId);
                // Editar Registro  (Ventana de edición)
                JfrmDlgCuentaMnt jfrmDlg = new JfrmDlgCuentaMnt(this, true, clienteBl, cuentaBl, cuenta, MySwingUtil.FrmStates.FRMUPDATE);
                jfrmDlg.setLocationRelativeTo(this);
                jfrmDlg.setTitle("Editar Cuenta");
                jfrmDlg.setVisible(true);
            } else {
                MySwingUtil.mostrarMensaje("No seleccionó ningún registro", MySwingUtil.TD_ERROR, "Edición");
            }
        } else {
            MySwingUtil.mostrarMensaje("La tabla está vacía", MySwingUtil.TD_ERROR, "Edición");
        }

    }//GEN-LAST:event_jBtnEditarCtaActionPerformed

    private void jBtnDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelClienteActionPerformed
        if (jTblCliente.getRowCount() > 0) {
            // que se haya seleccionado un elemento
            if (jTblCliente.getSelectedRow() != -1) {
                // obtener el id del elemento a elminar
                int idUsuario = Integer.parseInt(String.valueOf(jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0)));
                // Editar Registro  (Ventana de edición)
                clienteBl.eliminar(idUsuario);
                MySwingUtil.mostrarMensaje("Registro eliminado correctamente", MySwingUtil.TD_ERROR, "Borrado");
            } else {
                MySwingUtil.mostrarMensaje("No seleccionó ningún registro", MySwingUtil.TD_ERROR, "Borrado");
            }
        } else {
            MySwingUtil.mostrarMensaje("La tabla está vacía", MySwingUtil.TD_ERROR, "Borrado");
        }
    }//GEN-LAST:event_jBtnDelClienteActionPerformed

    private void jBtnDelCtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelCtaActionPerformed
        if (jTblCliente.getRowCount() > 0) {
            JTable jTbl = jTblCuenta;
            // que se haya seleccionado un elemento
            if (jTbl.getSelectedRow() != -1) {
                // obtener el id del elemento a elminar
                int idClienteN = Integer.parseInt(String.valueOf(jTbl.getValueAt(jTbl.getSelectedRow(), 0)));
                int idCuentaN = Integer.parseInt(String.valueOf(jTbl.getValueAt(jTbl.getSelectedRow(), 1)));
                // Eliminar cuenta
                CuentaId cuentaId = new CuentaId(idClienteN, idCuentaN);
                cuentaBl.eliminar(cuentaId);
                MySwingUtil.mostrarMensaje("Registro eliminado correctamente", MySwingUtil.TD_ERROR, "Borrado");
            } else {
                MySwingUtil.mostrarMensaje("No seleccionó ningún registro", MySwingUtil.TD_ERROR, "Borrado");
            }
        } else {
            MySwingUtil.mostrarMensaje("La tabla está vacía", MySwingUtil.TD_ERROR, "Borrado");
        }
    }//GEN-LAST:event_jBtnDelCtaActionPerformed

    private void jBtnRefreshClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRefreshClienteActionPerformed
        llenarTablaClientes();
    }//GEN-LAST:event_jBtnRefreshClienteActionPerformed

    private void jBtnRefreshCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRefreshCuentaActionPerformed
        llenarTablaCuentas();
    }//GEN-LAST:event_jBtnRefreshCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCrearCliente;
    private javax.swing.JButton jBtnCrearCta;
    private javax.swing.JButton jBtnDelCliente;
    private javax.swing.JButton jBtnDelCta;
    private javax.swing.JButton jBtnEditarCliente;
    private javax.swing.JButton jBtnEditarCta;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnRefreshCliente;
    private javax.swing.JButton jBtnRefreshCuenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnlCliente;
    private javax.swing.JPanel jPnlCuenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabPnlEntities;
    private javax.swing.JTable jTblCliente;
    private javax.swing.JTable jTblCuenta;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
