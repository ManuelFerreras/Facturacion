/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaciones;

/**
 *
 * @author manue
 */
public class AgregarDados extends javax.swing.JDialog {
    Dados dados = new Dados();
    public int status = 0;
    /**
     * Creates new form AgregarCartass
     */
    public AgregarDados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Dados getDados(){
        return this.dados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxMadera = new javax.swing.JCheckBox();
        jCheckBoxPlastico = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBoxConColor = new javax.swing.JCheckBox();
        jCheckBoxBlancoNegro = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Cartas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        ButtonExit.setBackground(new java.awt.Color(51, 51, 51));
        ButtonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        ButtonExit.setText("X");
        ButtonExit.setBorderPainted(false);
        ButtonExit.setContentAreaFilled(false);
        ButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonExit.setFocusPainted(false);
        ButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExit.setOpaque(true);
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Dados:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jCheckBoxMadera.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxMadera.setText("Madera");
        jCheckBoxMadera.setContentAreaFilled(false);
        jCheckBoxMadera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxMadera.setFocusPainted(false);
        jCheckBoxMadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMaderaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxMadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCheckBoxPlastico.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBoxPlastico.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPlastico.setText("Plastico");
        jCheckBoxPlastico.setContentAreaFilled(false);
        jCheckBoxPlastico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxPlastico.setFocusPainted(false);
        jCheckBoxPlastico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlasticoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPlastico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color de Dados:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jCheckBoxConColor.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxConColor.setText("Con Color");
        jCheckBoxConColor.setContentAreaFilled(false);
        jCheckBoxConColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxConColor.setFocusPainted(false);
        jCheckBoxConColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxConColorActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxConColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jCheckBoxBlancoNegro.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBoxBlancoNegro.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxBlancoNegro.setText("Blanco");
        jCheckBoxBlancoNegro.setContentAreaFilled(false);
        jCheckBoxBlancoNegro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxBlancoNegro.setFocusPainted(false);
        jCheckBoxBlancoNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBlancoNegroActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxBlancoNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir Dados a La Factura");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/appBackground.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 300));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void jCheckBoxMaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMaderaActionPerformed
        if(jCheckBoxPlastico.isSelected()) {
            jCheckBoxPlastico.setSelected(false);
        }
        jCheckBoxMadera.setSelected(true);
    }//GEN-LAST:event_jCheckBoxMaderaActionPerformed

    private void jCheckBoxConColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxConColorActionPerformed
        if(jCheckBoxBlancoNegro.isSelected()) {
            jCheckBoxBlancoNegro.setSelected(false);
        }
        jCheckBoxConColor.setSelected(true);
    }//GEN-LAST:event_jCheckBoxConColorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ((jCheckBoxBlancoNegro.isSelected() || jCheckBoxConColor.isSelected()) && (jCheckBoxPlastico.isSelected() || jCheckBoxMadera.isSelected())) {
            if(jCheckBoxBlancoNegro.isSelected()) {
                dados.instantiateSinColor();
            } else {
                dados.instantiateConColor();
            }
            
            if(jCheckBoxPlastico.isSelected()){
                dados.instantiatePlastico();
            } else {
                dados.instantiateMadera();
            }
            
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxPlasticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlasticoActionPerformed
        if(jCheckBoxMadera.isSelected()) {
            jCheckBoxMadera.setSelected(false);
        }
        jCheckBoxPlastico.setSelected(true);
    }//GEN-LAST:event_jCheckBoxPlasticoActionPerformed

    private void jCheckBoxBlancoNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBlancoNegroActionPerformed
        if(jCheckBoxConColor.isSelected()) {
            jCheckBoxConColor.setSelected(false);
        }
        jCheckBoxBlancoNegro.setSelected(true);
    }//GEN-LAST:event_jCheckBoxBlancoNegroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        status = 1;
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgregarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarDados dialog = new AgregarDados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxBlancoNegro;
    private javax.swing.JCheckBox jCheckBoxConColor;
    private javax.swing.JCheckBox jCheckBoxMadera;
    private javax.swing.JCheckBox jCheckBoxPlastico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
