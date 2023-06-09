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
    private String cadenaNumeros = "";

    public VLogin(CListas listas) {
        initComponents();
        this.listas = listas;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tfUserName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(215, 115, 17));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfUserName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });
        jPanel3.add(tfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 180, -1));

        jPanel1.setLayout(new java.awt.GridLayout(4, 3));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar);

        btnBackspace.setText("Borrar");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackspace);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 106, 190, 260));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 283, 473));

        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\CasaDoloresProject\\src\\main\\java\\img\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 473));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed

    }//GEN-LAST:event_tfUserNameActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String username = tfUserName.getText();
        //String password = tfUserPass.getText();
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
                System.out.println("entro");
                // Para Lia
            }
            case "4" -> {
                index = listas.BuscarIdCocinero(Integer.parseInt(username));
                new VCPrincipales(listas,index).setVisible(true);
            }
            default -> {
                JOptionPane.showMessageDialog(this, "No se encontró al usuario", "Inicio de Sesión", 1);
            }
        }
        this.dispose();


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        String bt;

        if (tfUserName.getText().length() > 0) {
            StringBuilder st = new StringBuilder(tfUserName.getText());
            st.deleteCharAt(tfUserName.getText().length() - 1);
            bt = st.toString();
            tfUserName.setText(bt);
        }
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (tfUserName.getText().isEmpty()) {
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }

        tfUserName.setText(cadenaNumeros);
    }//GEN-LAST:event_btn0ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
