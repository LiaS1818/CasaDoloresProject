/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.mycompany.casadoloresproject.CListas;
import entities.CCocinero;
import entities.CPlatillo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author DELL
 */
public class VCExtras extends javax.swing.JInternalFrame {

    /**
     * Creates new form VCPrincipales
     */
    CListas listas;
    int index;
    CCocinero cocinero;
    String platilloType = "Extras";

    public VCExtras(CListas listas, int index) {
        initComponents();
        this.listas = listas;
        this.index = index;
        crearFilas();
        addCheckBox(1, jTable1);

        //this.cocinero = listas.cocineroList.get(index);
        mostrarPrincipales();
    }

    private void crearFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
        Object nuevo[] = {temp.getRowCount() + 1, "", ""};
        int size = listas.getPlatilloSize(platilloType);
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            temp.addRow(nuevo);
        }
    }

    private void mostrarPrincipales() {
        int i = 0;

        for (CPlatillo platillo : listas.platilloList) {
            if (platillo.getsCategoria().equals(platilloType)) {
                jTable1.setValueAt(platillo.getsNombre(), i, 0);
                jTable1.setValueAt(platillo.isIsStock(), i, 1);
                i++;
            }
        }
    }

    private void addCheckBox(int column, JTable table) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Stock"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (IsSelected(i, 1, jTable1)) {
                listas.setIsStockPlatillo(i, platilloType, true);
                System.out.println(i);
            } else {
                listas.setIsStockPlatillo(i, platilloType, false);
                System.out.println("False: " + i);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int fila = jTable1.rowAtPoint(evt.getPoint());
        int columna = jTable1.columnAtPoint(evt.getPoint());
        if ((fila > -1) && (columna > -1)) {
            System.out.println("Estoy en la posición: " + fila + " y " + columna);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private boolean IsSelected(int row, int column, JTable table) {
        if (table.getValueAt(row, column) != null) {
            return table.getValueAt(row, column).toString() == "true";
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
