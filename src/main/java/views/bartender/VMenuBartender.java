/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.bartender;

import com.mycompany.casadoloresproject.CListas;
import entities.CBartender;
import views.VLogin;

/**
 *
 * @author DELL
 */
public class VMenuBartender extends javax.swing.JFrame {

    /**
     * Creates new form VMenuCocinero
     */
    CListas listas;
    int index;
    CBartender barman;
    VBBebida interTequila;
    VBBebida interNatural;
    VBBebida interRefresco;
    VBBebida interCafeteria;
    
    public VMenuBartender(CListas listas, int index) {
        initComponents();
        this.listas = listas;
        this.setLocationRelativeTo(null);
        this.index = index;
        this.barman = listas.bartenderList.get(index);
        
        interTequila = new VBBebida(listas,index,"Tequila");
        deskPaneCocinero.add(interTequila);
        
        interNatural = new VBBebida(listas, index,"Natural");
        deskPaneCocinero.add(interNatural);
        
        interRefresco = new VBBebida(listas, index,"Refresco");
        deskPaneCocinero.add(interRefresco);
        
        interCafeteria = new VBBebida(listas, index, "Cafeteria");
        deskPaneCocinero.add(interCafeteria);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNatural = new javax.swing.JButton();
        btnRefresco = new javax.swing.JButton();
        btnComandas = new javax.swing.JButton();
        btnCafeteria = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deskPaneCocinero = new javax.swing.JDesktopPane();
        btnTequila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Barra de Bebidas");

        btnNatural.setText("Natural");
        btnNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaturalActionPerformed(evt);
            }
        });

        btnRefresco.setText("Refresco");
        btnRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescoActionPerformed(evt);
            }
        });

        btnComandas.setText("Comandas");
        btnComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComandasActionPerformed(evt);
            }
        });

        btnCafeteria.setText("Extras");
        btnCafeteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeteriaActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deskPaneCocineroLayout = new javax.swing.GroupLayout(deskPaneCocinero);
        deskPaneCocinero.setLayout(deskPaneCocineroLayout);
        deskPaneCocineroLayout.setHorizontalGroup(
            deskPaneCocineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        deskPaneCocineroLayout.setVerticalGroup(
            deskPaneCocineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        btnTequila.setText("Tequila");
        btnTequila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTequilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRefresco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNatural, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComandas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCafeteria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTequila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskPaneCocinero)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTequila, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deskPaneCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComandasActionPerformed
       setStateInternalFrames(false, false, false, false, true);
  
    }//GEN-LAST:event_btnComandasActionPerformed

    private void btnNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaturalActionPerformed
        setStateInternalFrames(false, true, false, false, false);
    }//GEN-LAST:event_btnNaturalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new VLogin(listas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRefrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescoActionPerformed
        setStateInternalFrames(false, false, true, false, false);
    }//GEN-LAST:event_btnRefrescoActionPerformed

    private void btnCafeteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeteriaActionPerformed
        // TODO add your handling code here:
        setStateInternalFrames(false, false, false, true, false);
    }//GEN-LAST:event_btnCafeteriaActionPerformed

    private void btnTequilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTequilaActionPerformed
        // TODO add your handling code here:
        setStateInternalFrames(true, false, false, false, false);
    }//GEN-LAST:event_btnTequilaActionPerformed

    private void setStateInternalFrames(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5){
        interNatural.setVisible(b1);
        interNatural.setEnabled(b1);
        
        interTequila.setVisible(b2);
        interTequila.setEnabled(b2);
        
        interRefresco.setVisible(b3);
        interRefresco.setEnabled(b3);
        
        interCafeteria.setVisible(b4);
        interCafeteria.setEnabled(b4);
        
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCafeteria;
    private javax.swing.JButton btnComandas;
    private javax.swing.JButton btnNatural;
    private javax.swing.JButton btnRefresco;
    private javax.swing.JButton btnTequila;
    private javax.swing.JDesktopPane deskPaneCocinero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
