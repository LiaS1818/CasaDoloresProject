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

        jPanel1 = new javax.swing.JPanel();
        btnTequila = new javax.swing.JButton();
        btnNatural = new javax.swing.JButton();
        btnRefresco = new javax.swing.JButton();
        btnCafeteria = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deskPaneCocinero = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(183, 119, 41));

        jPanel1.setBackground(new java.awt.Color(182, 96, 50));

        btnTequila.setBackground(new java.awt.Color(204, 204, 204));
        btnTequila.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnTequila.setForeground(new java.awt.Color(0, 0, 0));
        btnTequila.setText("Tequila");
        btnTequila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTequilaActionPerformed(evt);
            }
        });

        btnNatural.setBackground(new java.awt.Color(204, 204, 204));
        btnNatural.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNatural.setForeground(new java.awt.Color(0, 0, 0));
        btnNatural.setText("Natural");
        btnNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaturalActionPerformed(evt);
            }
        });

        btnRefresco.setBackground(new java.awt.Color(204, 204, 204));
        btnRefresco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRefresco.setForeground(new java.awt.Color(0, 0, 0));
        btnRefresco.setText("Refresco");
        btnRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescoActionPerformed(evt);
            }
        });

        btnCafeteria.setBackground(new java.awt.Color(204, 204, 204));
        btnCafeteria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCafeteria.setForeground(new java.awt.Color(0, 0, 0));
        btnCafeteria.setText("Extras");
        btnCafeteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeteriaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deskPaneCocineroLayout = new javax.swing.GroupLayout(deskPaneCocinero);
        deskPaneCocinero.setLayout(deskPaneCocineroLayout);
        deskPaneCocineroLayout.setHorizontalGroup(
            deskPaneCocineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        deskPaneCocineroLayout.setVerticalGroup(
            deskPaneCocineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Barra de Bebidas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRefresco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNatural, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCafeteria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTequila, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deskPaneCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(605, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(deskPaneCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnTequila, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(490, 490, 490)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btnNatural;
    private javax.swing.JButton btnRefresco;
    private javax.swing.JButton btnTequila;
    private javax.swing.JDesktopPane deskPaneCocinero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
