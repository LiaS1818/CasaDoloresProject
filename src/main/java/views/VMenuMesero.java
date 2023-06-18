package views;

import com.mycompany.casadoloresproject.CListas;
import entities.CMesero;

public class VMenuMesero extends javax.swing.JFrame {

    CListas listas = null;
    CMesero mesero;
    VMesasComedor interMesasComedor;
    VMesasTerraza interMesasTerraza;
    int index;

    public VMenuMesero(CListas listas, int index) {
        initComponents();
        
         interMesasComedor = new VMesasComedor(listas, index);
        deskPaneMesero.add(interMesasComedor);

        interMesasTerraza = new VMesasTerraza(listas, index);
        deskPaneMesero.add(interMesasTerraza);
        
        this.listas = listas;
        this.mesero = listas.meseroList.get(index);
        this.index = index;
        cargarEtiquetas();

        interMesasComedor.setVisible(false);
        interMesasComedor.setEnabled(false);
        interMesasTerraza.setVisible(false);
        interMesasTerraza.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        lbArea = new javax.swing.JLabel();
        cbMapa = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        deskPaneMesero = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        lbNombre.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lbNombre.setText("Nombre");

        labelNombre.setText("nombre");

        lbID.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lbID.setText("Id");

        labelID.setText("id");

        lbArea.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lbArea.setText("Area");

        cbMapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terraza", "Comedor" }));
        cbMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelID)
                            .addComponent(lbID))
                        .addGap(41, 41, 41)))
                .addGap(70, 70, 70))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lbArea))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(lbNombre))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombre)
                .addGap(51, 51, 51)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelID)
                .addGap(80, 80, 80)
                .addComponent(lbArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deskPaneMesero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(deskPaneMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMapaActionPerformed

        if (cbMapa.getSelectedItem().equals("Comedor")) {
            interMesasComedor.setVisible(true);
            interMesasTerraza.setVisible(false);
            interMesasComedor.setEnabled(true);
            interMesasTerraza.setEnabled(false);
        }
        if(cbMapa.getSelectedItem().equals("Terraza")){
            interMesasComedor.setVisible(false);
            interMesasTerraza.setVisible(true);
            interMesasComedor.setEnabled(false);
            interMesasTerraza.setEnabled(true);
        }
    }//GEN-LAST:event_cbMapaActionPerformed

    private void cargarEtiquetas() {
        labelNombre.setText(mesero.getsUsername());
        labelID.setText(String.valueOf(mesero.getiID()));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMenuMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenuMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenuMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenuMesero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMapa;
    private javax.swing.JDesktopPane deskPaneMesero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables
}