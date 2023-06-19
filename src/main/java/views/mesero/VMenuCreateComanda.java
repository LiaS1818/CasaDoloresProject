/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mesero;

import com.mycompany.casadoloresproject.CListas;
import entities.CMesero;
import entities.CPlatillo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1710
 */
public class VMenuCreateComanda extends javax.swing.JFrame {

    /**
     * Creates new form VMenuCreateComanda
     */
    CListas listas;
    int index;
    CMesero mesero;
    
    public VMenuCreateComanda(CListas listas, int index) {
        initComponents();
        this.listas = listas;
        this.index = index;
        mesero = listas.meseroList.get(index);
        
        cbCategoria.setVisible(false);
        cbCategoria.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPlatillo = new javax.swing.JButton();
        btnBebida = new javax.swing.JButton();
        cbCategoria = new javax.swing.JComboBox<>();
        deskPaneComanda = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Comanda");

        btnPlatillo.setText("Platillo");
        btnPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatilloActionPerformed(evt);
            }
        });

        btnBebida.setText("Bebida");
        btnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidaActionPerformed(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout deskPaneComandaLayout = new javax.swing.GroupLayout(deskPaneComanda);
        deskPaneComanda.setLayout(deskPaneComandaLayout);
        deskPaneComandaLayout.setHorizontalGroup(
            deskPaneComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        deskPaneComandaLayout.setVerticalGroup(
            deskPaneComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deskPaneComanda)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlatillo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btnBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskPaneComanda))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidaActionPerformed
        // TODO add your handling code here:
        cbCategoria.setVisible(true);
        cbCategoria.setEnabled(true);
        
        cbCategoria.removeAllItems();
        cbCategoria.addItem("Tequila");
        cbCategoria.addItem("Natural");
        cbCategoria.addItem("Refresco");
        cbCategoria.addItem("Cafeteria");
    }//GEN-LAST:event_btnBebidaActionPerformed

    private void btnPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatilloActionPerformed
        // TODO add your handling code here:
        cbCategoria.setVisible(true);
        cbCategoria.setEnabled(true);
        
        cbCategoria.removeAllItems();
        cbCategoria.addItem("Entrada");
        cbCategoria.addItem("Principal");
        cbCategoria.addItem("Postre");
        cbCategoria.addItem("Extras");
    }//GEN-LAST:event_btnPlatilloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnPlatillo;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JDesktopPane deskPaneComanda;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
