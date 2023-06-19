package views.mesero;

import com.mycompany.casadoloresproject.CListas;
import entities.CMesero;
import views.VLogin;

public class VMenuMesero extends javax.swing.JFrame {

    CListas listas = null;
    CMesero mesero;
    VMesasComedor interMesasComedor;
    VMesasTerraza interMesasTerraza;
    int index;

    public VMenuMesero(CListas listas, int index) {
        initComponents();

        interMesasComedor = new VMesasComedor(listas, index, this);
        deskPaneMesero.add(interMesasComedor);

        interMesasTerraza = new VMesasTerraza(listas, index, this);
        deskPaneMesero.add(interMesasTerraza);

        this.listas = listas;
        this.mesero = listas.meseroList.get(index);
        this.index = index;
        cargarEtiquetas();

        setVisibleView(true, false, false);
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
        btnComandas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        deskPaneMesero = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        lbNombre.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lbNombre.setText("Nombre");

        labelNombre.setText("nombre");

        lbID.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lbID.setText("Id");

        labelID.setText("id");

        lbArea.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lbArea.setText("Area");

        cbMapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedor", "Terraza" }));
        cbMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMapaActionPerformed(evt);
            }
        });

        btnComandas.setText("Comandas");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID)
                    .addComponent(lbID))
                .addGap(798, 798, 798))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lbArea))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(lbNombre)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir))))
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
                .addGap(41, 41, 41)
                .addComponent(btnComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout deskPaneMeseroLayout = new javax.swing.GroupLayout(deskPaneMesero);
        deskPaneMesero.setLayout(deskPaneMeseroLayout);
        deskPaneMeseroLayout.setHorizontalGroup(
            deskPaneMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        deskPaneMeseroLayout.setVerticalGroup(
            deskPaneMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(deskPaneMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMapaActionPerformed
        if (cbMapa.getSelectedItem().equals("Comedor")) {
            setVisibleView(true, false, false);
        }else {
            setVisibleView(false, true, false);
        }
    }//GEN-LAST:event_cbMapaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        new VLogin(listas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cargarEtiquetas() {
        labelNombre.setText(mesero.getsUsername());
        labelID.setText(String.valueOf(mesero.getiID()));
    }

    private void setVisibleView(boolean b1, boolean b2, boolean b3) {
        interMesasComedor.setVisible(b1);
        interMesasComedor.setEnabled(b1);
        
        interMesasTerraza.setVisible(b2);
        interMesasTerraza.setEnabled(b2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComandas;
    private javax.swing.JButton btnSalir;
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
