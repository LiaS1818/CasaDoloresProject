/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mesero;

import com.mycompany.casadoloresproject.CListas;
import entities.CComanda;
import entities.CMesero;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class VMesasComedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form VMapaMesas
     */
    CListas listas;
    CMesero mesero;
    int index;
    VMenuMesero menu;

    public VMesasComedor(CListas listas, int index, VMenuMesero menu) {
        initComponents();
        this.listas = listas;
        mesero = listas.meseroList.get(index);
        cargarImagenMesas();
        this.index = index;
        this.menu = menu;

        enableTables();
    }

    private void cargarImagenMesas() {

        ImageIcon imagenSubtraction1 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen1 = imagenSubtraction1.getImage();
        Image imagenEscalada1 = imagen1.getScaledInstance(134, 134, java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction1 = new ImageIcon(imagenEscalada1);
        btnMesa1.setIcon(imagenSubtraction1);

        ImageIcon imagenSubtraction2 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen2 = imagenSubtraction2.getImage();
        Image imagenEscalada2 = imagen2.getScaledInstance(134, 134, java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction2 = new ImageIcon(imagenEscalada2);
        btnMesa2.setIcon(imagenSubtraction2);

        ImageIcon imagenSubtraction3 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen3 = imagenSubtraction3.getImage();
        Image imagenEscalada3 = imagen3.getScaledInstance(134, 134, java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction3 = new ImageIcon(imagenEscalada3);
        btnMesa3.setIcon(imagenSubtraction3);

        ImageIcon imagenSubtraction4 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen4 = imagenSubtraction4.getImage();
        Image imagenEscalada4 = imagen4.getScaledInstance(134, 134, java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction4 = new ImageIcon(imagenEscalada4);
        btnMesa4.setIcon(imagenSubtraction4);

        ImageIcon imagenSubtraction5 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen5 = imagenSubtraction5.getImage();
        Image imagenEscalada5 = imagen5.getScaledInstance(134, 134, java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction5 = new ImageIcon(imagenEscalada5);
        btnMesa5.setIcon(imagenSubtraction5);

        ImageIcon imagenSubtraction6 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen6 = imagenSubtraction6.getImage();
        Image imagenEscalada6 = imagen6.getScaledInstance(134, 134, java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction6 = new ImageIcon(imagenEscalada6);
        btnMesa6.setIcon(imagenSubtraction6);

        ImageIcon imagenSubtraction7 = new ImageIcon("src/main/java/img/desk.png");
        Image imagen7 = imagenSubtraction7.getImage();
        Image imagenEscalada7 = imagen7.getScaledInstance(134, 134, java.awt.Image.SCALE_SMOOTH);
        imagenSubtraction7 = new ImageIcon(imagenEscalada7);
        btnMesa7.setIcon(imagenSubtraction7);
    }

    private void enableTables() {
        for (CMesero meseroLocal : listas.meseroList) {
            if (meseroLocal.getiID() != mesero.getiID()) {
                for (CComanda comanda : meseroLocal.getComandas()) {
                    switch (comanda.getMesaID()) {
                        case 1: {
                            btnMesa1.setVisible(false);
                            btnMesa1.setEnabled(false);
                            break;
                        }
                        case 2: {
                            btnMesa2.setVisible(false);
                            btnMesa2.setEnabled(false);
                            break;
                        }
                        case 3: {
                            btnMesa3.setVisible(false);
                            btnMesa3.setEnabled(false);
                            break;
                        }
                        case 4: {
                            btnMesa4.setVisible(false);
                            btnMesa4.setEnabled(false);
                            break;
                        }
                        case 5: {
                            btnMesa5.setVisible(false);
                            btnMesa5.setEnabled(false);
                            break;
                        }
                        case 6: {
                            btnMesa6.setVisible(false);
                            btnMesa6.setEnabled(false);
                            break;
                        }
                        case 7: {
                            btnMesa7.setVisible(false);
                            btnMesa7.setEnabled(false);
                            break;
                        }
                    }
                }
            }

        }
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
        lbMesa11 = new javax.swing.JLabel();
        lbMesa5 = new javax.swing.JLabel();
        btnMesa1 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa7 = new javax.swing.JButton();
        lbMesa10 = new javax.swing.JLabel();
        btnMesa2 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        lbMesa8 = new javax.swing.JLabel();
        lbMesa7 = new javax.swing.JLabel();
        lbMesa6 = new javax.swing.JLabel();
        btnMesa4 = new javax.swing.JButton();
        lbMesa9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMesa11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa11.setText("3");
        jPanel1.add(lbMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 10, -1));

        lbMesa5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa5.setText("5");
        jPanel1.add(lbMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 10, -1));

        btnMesa1.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa1.setBorderPainted(false);
        btnMesa1.setContentAreaFilled(false);
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 126, 95));

        btnMesa6.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa6.setBorderPainted(false);
        btnMesa6.setContentAreaFilled(false);
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 126, 95));

        btnMesa7.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa7.setBorderPainted(false);
        btnMesa7.setContentAreaFilled(false);
        btnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 126, 95));

        lbMesa10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa10.setText("4");
        jPanel1.add(lbMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 10, -1));

        btnMesa2.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa2.setBorderPainted(false);
        btnMesa2.setContentAreaFilled(false);
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 126, 95));

        btnMesa5.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa5.setBorderPainted(false);
        btnMesa5.setContentAreaFilled(false);
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 126, 95));

        btnMesa3.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa3.setBorderPainted(false);
        btnMesa3.setContentAreaFilled(false);
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 126, 95));

        lbMesa8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa8.setText("1");
        jPanel1.add(lbMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lbMesa7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa7.setText("7");
        jPanel1.add(lbMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 10, -1));

        lbMesa6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa6.setText("6");
        jPanel1.add(lbMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 10, -1));

        btnMesa4.setBackground(new java.awt.Color(204, 204, 204));
        btnMesa4.setBorderPainted(false);
        btnMesa4.setContentAreaFilled(false);
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 126, 95));

        lbMesa9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbMesa9.setText("2");
        jPanel1.add(lbMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 10, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        createComanda(1);
    }//GEN-LAST:event_btnMesa1ActionPerformed

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        // TODO add your handling code here:
        createComanda(4);
    }//GEN-LAST:event_btnMesa4ActionPerformed

    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        // TODO add your handling code here:
        createComanda(2);
    }//GEN-LAST:event_btnMesa2ActionPerformed

    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        // TODO add your handling code here:
        createComanda(3);
    }//GEN-LAST:event_btnMesa3ActionPerformed

    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa5ActionPerformed
        // TODO add your handling code here:
        createComanda(5);
    }//GEN-LAST:event_btnMesa5ActionPerformed

    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa6ActionPerformed
        // TODO add your handling code here:
        createComanda(6);
    }//GEN-LAST:event_btnMesa6ActionPerformed

    private void btnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa7ActionPerformed
        // TODO add your handling code here:
        createComanda(7);
    }//GEN-LAST:event_btnMesa7ActionPerformed

    private void createComanda(int mesaID) {
        boolean isActive = listas.isTableActive(mesero, mesaID);
        if (!isActive) {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            Date date = new Date();
            mesero.setComanda(new CComanda(dateFormat.format(date), mesaID));
        }
        new VMenuCreateComanda(listas, index, mesaID).setVisible(true);
        menu.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnMesa7;
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
