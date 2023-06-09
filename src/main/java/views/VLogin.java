/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.mycompany.casadoloresproject.CListas;
import com.mycompany.casadoloresproject.CasaDoloresProject;
import entities.CAdministrador;
import entities.CBartender;
import entities.CBebida;
import entities.CCocinero;
import entities.CMesero;
import entities.CPlatillo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import org.xml.sax.Attributes;

/**
 *
 * @author DELL
 */
// TODO
// Crear el usurio mesero, bartender y cocinero y validar su ingreso
public class VLogin extends javax.swing.JFrame {
    // Listas de usuarios

    CListas listas = null;

    public VLogin(CListas listas) {
        initComponents();
        this.listas = listas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUserName = new javax.swing.JTextField();
        tfUserPass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 62, 89, -1));

        tfUserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserPassActionPerformed(evt);
            }
        });
        getContentPane().add(tfUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 113, 89, -1));

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 161, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed

    }//GEN-LAST:event_tfUserNameActionPerformed

    private void tfUserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserPassActionPerformed

    }//GEN-LAST:event_tfUserPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = tfUserName.getText();
        String password = tfUserPass.getText();
        int index = 0;
        switch (username.substring(0, 1)) {
            case "1" -> {
                new vMenuAdministrador(listas).setVisible(true);
            }
            case "2" -> {
                index = listas.BuscarIdBartender(Integer.parseInt(username));
                new vMenuAdministrador(listas).setVisible(true);
            }
            case "3" -> {
                index = listas.BuscarIdMesero(Integer.parseInt(username));
                new VMesasComedor(listas, index).setVisible(true);
                
                // Para Lia
            }
            case "4" -> {
                index = listas.BuscarIdCocinero(Integer.parseInt(username));
                new VMenuCocinero(listas).setVisible(true);
            }
            default -> {
                JOptionPane.showMessageDialog(this, "No se encontró al usuario", "Inicio de Sesión", 1);
            }
        }
        this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField tfUserName;
    private javax.swing.JTextField tfUserPass;
    // End of variables declaration//GEN-END:variables
}
