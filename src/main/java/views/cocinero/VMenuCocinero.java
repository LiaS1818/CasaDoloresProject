/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.cocinero;

import com.mycompany.casadoloresproject.CListas;
import entities.CCocinero;
import views.VLogin;

/**
 *
 * @author DELL
 */
public class VMenuCocinero extends javax.swing.JFrame {

    /**
     * Creates new form VMenuCocinero
     */
    CListas listas;
    int index;
    CCocinero cocinero;
    VCPlatillos interEntradas;
    VCPlatillos interPrincipales;
    VCPlatillos interPostres;
    VCPlatillos interExtras;
    
    public VMenuCocinero(CListas listas, int index) {
        initComponents();
        this.listas = listas;
        this.setLocationRelativeTo(null);
        this.index = index;
        this.cocinero = listas.cocineroList.get(index);
        
        interEntradas = new VCPlatillos(listas,index,"Entrada");
        deskPaneCocinero.add(interEntradas);
        
        interPrincipales = new VCPlatillos(listas, index,"Principal");
        deskPaneCocinero.add(interPrincipales);
        
        interPostres = new VCPlatillos(listas, index,"Postre");
        deskPaneCocinero.add(interPostres);
        
        interExtras = new VCPlatillos(listas, index, "Extras");
        deskPaneCocinero.add(interExtras);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deskPaneCocinero = new javax.swing.JDesktopPane();
        btnPrincipales1 = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        btnExtras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 96, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Cocina");

        javax.swing.GroupLayout deskPaneCocineroLayout = new javax.swing.GroupLayout(deskPaneCocinero);
        deskPaneCocinero.setLayout(deskPaneCocineroLayout);
        deskPaneCocineroLayout.setHorizontalGroup(
            deskPaneCocineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        deskPaneCocineroLayout.setVerticalGroup(
            deskPaneCocineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        btnPrincipales1.setBackground(new java.awt.Color(204, 204, 204));
        btnPrincipales1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPrincipales1.setForeground(new java.awt.Color(0, 0, 0));
        btnPrincipales1.setText("Principales");
        btnPrincipales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipales1ActionPerformed(evt);
            }
        });

        btnEntradas.setBackground(new java.awt.Color(204, 204, 204));
        btnEntradas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEntradas.setForeground(new java.awt.Color(0, 0, 0));
        btnEntradas.setText("Entradas");
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });

        btnPostres.setBackground(new java.awt.Color(204, 204, 204));
        btnPostres.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPostres.setForeground(new java.awt.Color(0, 0, 0));
        btnPostres.setText("Postres");
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });

        btnExtras.setBackground(new java.awt.Color(204, 204, 204));
        btnExtras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnExtras.setForeground(new java.awt.Color(0, 0, 0));
        btnExtras.setText("Extras");
        btnExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtrasActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPostres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExtras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrincipales1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(deskPaneCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(679, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(deskPaneCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnPrincipales1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(464, 464, 464)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        setStateInternalFrames(false, true, false, false,false);
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new VLogin(listas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        setStateInternalFrames(false, false, true, false,false);
    }//GEN-LAST:event_btnPostresActionPerformed

    private void btnExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtrasActionPerformed
        // TODO add your handling code here:
        setStateInternalFrames(false, false, false, true,false);
    }//GEN-LAST:event_btnExtrasActionPerformed

    private void btnPrincipales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipales1ActionPerformed
        // TODO add your handling code here:
        setStateInternalFrames(true, false, false, false,false);
    }//GEN-LAST:event_btnPrincipales1ActionPerformed

    private void setStateInternalFrames(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5){
        interPrincipales.setVisible(b1);
        interPrincipales.setEnabled(b1);
        
        interEntradas.setVisible(b2);
        interEntradas.setEnabled(b2);
        
        interPostres.setVisible(b3);
        interPostres.setEnabled(b3);
        
        interExtras.setVisible(b4);
        interExtras.setEnabled(b4);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnExtras;
    private javax.swing.JButton btnPostres;
    private javax.swing.JButton btnPrincipales1;
    private javax.swing.JDesktopPane deskPaneCocinero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
