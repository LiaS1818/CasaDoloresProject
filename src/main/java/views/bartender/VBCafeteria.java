/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.bartender;

import com.mycompany.casadoloresproject.CListas;
import entities.CBartender;
import entities.CBebida;
import entities.CPlatillo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author DELL
 */
public class VBCafeteria extends javax.swing.JInternalFrame {

    /**
     * Creates new form VCPrincipales
     */
    CListas listas;
    int index;
    CBartender bartender;
    String bebidaType = "Categoria";

    public VBCafeteria(CListas listas, int index) {
        initComponents();
        this.listas = listas;
        this.index = index;
        crearFilas();
        //this.cocinero = listas.cocineroList.get(index);
        addCheckBox(1, jTable1);
        mostrarPrincipales();
    }

    private void crearFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
        Object nuevo[] = {temp.getRowCount() + 1, "", ""};
        int size = listas.getBebidaSize(bebidaType);
        for (int i = 0; i < size; i++) {
            temp.addRow(nuevo);
        }

    }

    private void mostrarPrincipales() {
        int i = 0;
        for (CBebida bebida : listas.bebidaList) {
            if (bebida.getsCategoria().equals(bebidaType)) {
                jTable1.setValueAt(bebida.getsNombre(), i, 0);
                jTable1.setValueAt(bebida.isIsStock(), i, 1);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        boolean isSelected;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            //System.out.println(jTable1.getValueAt(i, 1).toString());
            //listas.setIsStockPlatillo(i, platilloType, IsSelected(i, 1, jTable1));
            
            isSelected = IsSelected(i, 1, jTable1);
            listas.setIsStockBebida(i, bebidaType, isSelected);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
