/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.mycompany.casadoloresproject.CListas;
import entities.CCocinero;

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
    VCEntradas interEntradas;
    VCPrincipales interPrincipales;
    VCPostres interPostres;
    VCExtras interExtras;
    
    public VMenuCocinero(CListas listas, int index) {
        initComponents();
        this.listas = listas;
        this.setLocationRelativeTo(null);
        this.index = index;
        this.cocinero = listas.cocineroList.get(index);
        
        interEntradas = new VCEntradas(listas,index);
        deskPaneCocinero.add(interEntradas);
        
        interPrincipales = new VCPrincipales(listas, index);
        deskPaneCocinero.add(interPrincipales);
        
        interPostres = new VCPostres(listas, index);
        deskPaneCocinero.add(interPostres);
        
        interExtras = new VCExtras(listas, index);
        deskPaneCocinero.add(interExtras);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEntradas = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        btnPrincipales = new javax.swing.JButton();
        btnExtras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deskPaneCocinero = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Cocina");

        btnEntradas.setText("Entradas");
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });

        btnPostres.setText("Postres");
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });

        btnPrincipales.setText("Principales");
        btnPrincipales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalesActionPerformed(evt);
            }
        });

        btnExtras.setText("Extras");
        btnExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtrasActionPerformed(evt);
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        deskPaneCocineroLayout.setVerticalGroup(
            deskPaneCocineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPostres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrincipales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExtras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskPaneCocinero)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrincipales, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deskPaneCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalesActionPerformed
       setStateInternalFrames(true, false, false, false);
  
    }//GEN-LAST:event_btnPrincipalesActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        setStateInternalFrames(false, true, false, false);
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new VLogin(listas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        setStateInternalFrames(false, false, true, false);
    }//GEN-LAST:event_btnPostresActionPerformed

    private void btnExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtrasActionPerformed
        // TODO add your handling code here:
        setStateInternalFrames(false, false, false, true);
    }//GEN-LAST:event_btnExtrasActionPerformed

    private void setStateInternalFrames(boolean b1, boolean b2, boolean b3, boolean b4){
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
    private javax.swing.JButton btnPrincipales;
    private javax.swing.JDesktopPane deskPaneCocinero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
