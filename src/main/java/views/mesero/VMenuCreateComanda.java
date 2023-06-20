/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mesero;

import com.mycompany.casadoloresproject.CListas;
import entities.CComanda;
import entities.CMesero;
import entities.CPlatillo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1710
 */
public class VMenuCreateComanda extends javax.swing.JFrame {

    /**
     * Creates new form VMenuCreateComanda
     */
    CListas listas;
    int index;
    CMesero mesero;
    CComanda comanda;
    String selection = "platillo";
    int mesaID;

    int correctorErrorComboBox = 0;

    VMComandaPlatillo cmdPEntrada;
    VMComandaPlatillo cmdPPrincipal;
    VMComandaPlatillo cmdPPostre;
    VMComandaPlatillo cmdPExtras;

    VMComandaBebida cmdBTequila;
    VMComandaBebida cmdBNatural;
    VMComandaBebida cmdBRefresco;
    VMComandaBebida cmdBCafeteria;

    VMReviewComanda rwComanda;
    
    public VMenuCreateComanda(CListas listas, int index, int mesaID) {
        initComponents();
        this.listas = listas;
        this.index = index;
        this.mesaID = mesaID;
        mesero = listas.meseroList.get(index);
        for (CComanda comandaLocal : mesero.getComandas()) {
            if (comandaLocal.getMesaID() == mesaID) {
                this.comanda = comandaLocal;
            }
        }
        
        cbCategoria.setVisible(false);
        cbCategoria.setEnabled(false);
        
        cmdPEntrada = new VMComandaPlatillo(listas, index, "Entrada", this);
        cmdPPrincipal = new VMComandaPlatillo(listas, index, "Principal", this);
        cmdPPostre = new VMComandaPlatillo(listas, index, "Postre", this);
        cmdPExtras = new VMComandaPlatillo(listas, index, "Extras", this);

        cmdBTequila = new VMComandaBebida(listas, index, "Tequila", this);
        cmdBNatural = new VMComandaBebida(listas, index, "Natural", this);
        cmdBRefresco = new VMComandaBebida(listas, index, "Refresco", this);
        cmdBCafeteria = new VMComandaBebida(listas, index, "Cafeteria", this);

        //comanda = listas.getComandaMesa(mesaID);
        rwComanda = new VMReviewComanda(listas, mesero, comanda);

        deskPaneComanda.add(cmdBTequila);
        deskPaneComanda.add(cmdPPrincipal);
        deskPaneComanda.add(cmdPPostre);
        deskPaneComanda.add(cmdPExtras);

        deskPaneComanda.add(cmdPEntrada);
        deskPaneComanda.add(cmdBNatural);
        deskPaneComanda.add(cmdBRefresco);
        deskPaneComanda.add(cmdBCafeteria);

        deskPaneReview.add(rwComanda);
        rwComanda.setVisible(true);
        
        setVisibleViews(false, false, false, false, false, false, false, false);
    }

    public void putPlatilloComanda(int platilloIndex) {
        System.out.println(listas.platilloList.get(platilloIndex).getsNombre());
        String numPlatillos = JOptionPane.showInputDialog("Ingresa Numero de platillos");

        rwComanda.putPlatillo(platilloIndex, Integer.parseInt(numPlatillos));
    }

    public void putBebidaComanda(int platilloIndex) {
        System.out.println(listas.platilloList.get(platilloIndex).getsNombre());
        String numPlatillos = JOptionPane.showInputDialog("Ingresa Numero de platillos");

        rwComanda.putBebida(platilloIndex, Integer.parseInt(numPlatillos));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPlatillo = new javax.swing.JButton();
        btnBebida = new javax.swing.JButton();
        cbCategoria = new javax.swing.JComboBox<>();
        deskPaneComanda = new javax.swing.JDesktopPane();
        deskPaneReview = new javax.swing.JDesktopPane();
        btnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Comanda");

        btnPlatillo.setText("Platillo");
        btnPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatilloActionPerformed(evt);
            }
        });

        btnBebida.setText("Bebida");
        btnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidaActionPerformed(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Principal", "Postre", "Extras" }));
        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });
        cbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCategoriaMouseClicked(evt);
            }
        });
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });
        cbCategoria.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbCategoriaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout deskPaneComandaLayout = new javax.swing.GroupLayout(deskPaneComanda);
        deskPaneComanda.setLayout(deskPaneComandaLayout);
        deskPaneComandaLayout.setHorizontalGroup(
            deskPaneComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        deskPaneComandaLayout.setVerticalGroup(
            deskPaneComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout deskPaneReviewLayout = new javax.swing.GroupLayout(deskPaneReview);
        deskPaneReview.setLayout(deskPaneReviewLayout);
        deskPaneReviewLayout.setHorizontalGroup(
            deskPaneReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        deskPaneReviewLayout.setVerticalGroup(
            deskPaneReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deskPaneComanda, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 361, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskPaneReview))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlatillo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btnBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskPaneComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deskPaneReview)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidaActionPerformed
        // TODO add your handling code here:
        correctorErrorComboBox = 0;

        cbCategoria.removeAllItems();
        cbCategoria.setVisible(true);
        cbCategoria.setEnabled(true);
        correctorErrorComboBox = 1;
        cbCategoria.addItem("Tequila");
        cbCategoria.addItem("Natural");
        cbCategoria.addItem("Refresco");
        cbCategoria.addItem("Cafeteria");
        selection = "bebida";
    }//GEN-LAST:event_btnBebidaActionPerformed

    private void btnPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatilloActionPerformed
        // TODO add your handling code here:
        correctorErrorComboBox = 0;
        cbCategoria.removeAllItems();
        cbCategoria.setVisible(true);
        cbCategoria.setEnabled(true);
        correctorErrorComboBox = 1;
        cbCategoria.addItem("Entrada");
        cbCategoria.addItem("Principal");
        cbCategoria.addItem("Postre");
        cbCategoria.addItem("Extras");
        selection = "platillo";
    }//GEN-LAST:event_btnPlatilloActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
        if (correctorErrorComboBox == 1) {
            System.out.println(cbCategoria.getSelectedItem());
            System.out.println("************************************************");
            String option = "";
            option = (String) cbCategoria.getSelectedItem();
            System.out.println(option);
            System.out.println(selection);
            if (selection.equals("platillo")) {
                switch (option) {
                    case "Entrada": {
                        setVisibleViews(true, false, false, false, false, false, false, false);
                        break;
                    }
                    case "Principal": {
                        System.out.println("Comida Rica");
                        setVisibleViews(false, true, false, false, false, false, false, false);
                        break;
                    }
                    case "Postre": {
                        setVisibleViews(false, false, true, false, false, false, false, false);
                        break;
                    }
                    case "Extras": {
                        setVisibleViews(false, false, false, true, false, false, false, false);
                        break;
                    }
                }
            }
            if (selection.equals("bebida")) {
                System.out.println("Estoy aquí al 100");
                switch (option) {
                    case "Tequila": {
                        setVisibleViews(false, false, false, false, true, false, false, false);
                        break;
                    }
                    case "Natural": {
                        System.out.println("Comida Rica");
                        setVisibleViews(false, false, false, false, false, true, false, false);
                        break;
                    }
                    case "Refresco": {
                        setVisibleViews(false, false, false, false, false, false, true, false);
                        break;
                    }
                    case "Cafeteria": {
                        setVisibleViews(false, false, false, false, false, false, false, true);
                        break;
                    }
                }
            }
        }

    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCategoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaMouseClicked

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbCategoriaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbCategoriaPropertyChange
        // TODO add your handling code here:
        /**/
    }//GEN-LAST:event_cbCategoriaPropertyChange

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
        new VMenuMesero(listas, index).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void setVisibleViews(
            boolean b1,
            boolean b2,
            boolean b3,
            boolean b4,
            boolean b5,
            boolean b6,
            boolean b7,
            boolean b8) {
        cmdPEntrada.setVisible(b1);
        cmdPEntrada.setEnabled(b1);

        cmdPPrincipal.setVisible(b2);
        cmdPPrincipal.setEnabled(b2);

        cmdPPostre.setVisible(b3);
        cmdPPostre.setEnabled(b3);

        cmdPExtras.setVisible(b4);
        cmdPExtras.setEnabled(b4);

        cmdBTequila.setVisible(b5);
        cmdBTequila.setEnabled(b5);

        cmdBNatural.setVisible(b6);
        cmdBNatural.setEnabled(b6);

        cmdBRefresco.setVisible(b7);
        cmdBRefresco.setEnabled(b7);

        cmdBCafeteria.setVisible(b8);
        cmdBCafeteria.setEnabled(b8);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnPlatillo;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JDesktopPane deskPaneComanda;
    private javax.swing.JDesktopPane deskPaneReview;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
