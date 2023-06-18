/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.mycompany.casadoloresproject.CListas;
import entities.CMesero;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public final class VMesasComedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form VMapaMesas
     */
    
    CListas listas;
    CMesero mesero;
    int index;
    
    public VMesasComedor(CListas listas, int index) {
        initComponents();
        this.listas = listas;
        mesero = this.listas.meseroList.get(index);
        cargarImagenMesas();
        this.index = index;
    }
    private void cargarImagenMesas(){
        
        ImageIcon imagenSubtraction1 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen1 = imagenSubtraction1.getImage();
        Image imagenEscalada1 = imagen1.getScaledInstance(134, 134,java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction1 = new ImageIcon(imagenEscalada1);
        btnMesa1.setIcon(imagenSubtraction1);
        
        ImageIcon imagenSubtraction2 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen2 = imagenSubtraction2.getImage();
        Image imagenEscalada2 = imagen2.getScaledInstance(134, 134,java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction2 = new ImageIcon(imagenEscalada2);
        btnMesa2.setIcon(imagenSubtraction2);
        
        ImageIcon imagenSubtraction3 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen3 = imagenSubtraction3.getImage();
        Image imagenEscalada3 = imagen3.getScaledInstance(134, 134,java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction3 = new ImageIcon(imagenEscalada3);
        btnMesa3.setIcon(imagenSubtraction3);
        
        ImageIcon imagenSubtraction4 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen4 = imagenSubtraction4.getImage();
        Image imagenEscalada4 = imagen4.getScaledInstance(134, 134,java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction4 = new ImageIcon(imagenEscalada4);
        btnMesa4.setIcon(imagenSubtraction4);
        
        ImageIcon imagenSubtraction5 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen5 = imagenSubtraction5.getImage();
        Image imagenEscalada5 = imagen5.getScaledInstance(134, 134,java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction5 = new ImageIcon(imagenEscalada5);
        btnMesa5.setIcon(imagenSubtraction5);
        
        ImageIcon imagenSubtraction6 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen6 = imagenSubtraction6.getImage();
        Image imagenEscalada6 = imagen6.getScaledInstance(134, 134,java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction6 = new ImageIcon(imagenEscalada6);
        btnMesa6.setIcon(imagenSubtraction6);
        
        ImageIcon imagenSubtraction7 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen7 = imagenSubtraction7.getImage();
        Image imagenEscalada7 = imagen7.getScaledInstance(134, 134,java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction7 = new ImageIcon(imagenEscalada7);
        btnMesa7.setIcon(imagenSubtraction7);
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
        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnMesa1 = new javax.swing.JButton();
        lbMesa8 = new javax.swing.JLabel();
        lbMesa11 = new javax.swing.JLabel();
        btnMesa3 = new javax.swing.JButton();
        lbMesa5 = new javax.swing.JLabel();
        btnMesa5 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        lbMesa6 = new javax.swing.JLabel();
        btnMesa7 = new javax.swing.JButton();
        lbMesa7 = new javax.swing.JLabel();
        lbMesa10 = new javax.swing.JLabel();
        btnMesa4 = new javax.swing.JButton();
        btnMesa2 = new javax.swing.JButton();
        lbMesa9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMesa1.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa1.setBorderPainted(false);
        btnMesa1.setContentAreaFilled(false);
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 126, 95));

        lbMesa8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa8.setText("1");
        jInternalFrame1.getContentPane().add(lbMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lbMesa11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa11.setText("3");
        jInternalFrame1.getContentPane().add(lbMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 10, -1));

        btnMesa3.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa3.setBorderPainted(false);
        btnMesa3.setContentAreaFilled(false);
        jInternalFrame1.getContentPane().add(btnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 126, 95));

        lbMesa5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa5.setText("5");
        jInternalFrame1.getContentPane().add(lbMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 10, -1));

        btnMesa5.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa5.setBorderPainted(false);
        btnMesa5.setContentAreaFilled(false);
        jInternalFrame1.getContentPane().add(btnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 126, 95));

        btnMesa6.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa6.setBorderPainted(false);
        btnMesa6.setContentAreaFilled(false);
        jInternalFrame1.getContentPane().add(btnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 126, 95));

        lbMesa6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa6.setText("6");
        jInternalFrame1.getContentPane().add(lbMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 10, -1));

        btnMesa7.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa7.setBorderPainted(false);
        btnMesa7.setContentAreaFilled(false);
        jInternalFrame1.getContentPane().add(btnMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 126, 95));

        lbMesa7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa7.setText("7");
        jInternalFrame1.getContentPane().add(lbMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 10, -1));

        lbMesa10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa10.setText("4");
        jInternalFrame1.getContentPane().add(lbMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 10, -1));

        btnMesa4.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa4.setBorderPainted(false);
        btnMesa4.setContentAreaFilled(false);
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 126, 95));

        btnMesa2.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa2.setBorderPainted(false);
        btnMesa2.setContentAreaFilled(false);
        jInternalFrame1.getContentPane().add(btnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 126, 95));

        lbMesa9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa9.setText("2");
        jInternalFrame1.getContentPane().add(lbMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 10, -1));

        jPanel1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 786, 491));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        JOptionPane.showMessageDialog(null, "Hola Rangel");
    }//GEN-LAST:event_btnMesa1ActionPerformed

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMesa4ActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnMesa7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMesa10;
    private javax.swing.JLabel lbMesa11;
    private javax.swing.JLabel lbMesa5;
    private javax.swing.JLabel lbMesa6;
    private javax.swing.JLabel lbMesa7;
    private javax.swing.JLabel lbMesa8;
    private javax.swing.JLabel lbMesa9;
    // End of variables declaration//GEN-END:variables
}
