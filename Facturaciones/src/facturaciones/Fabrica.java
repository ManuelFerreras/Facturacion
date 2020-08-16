
package facturaciones;

import java.awt.Frame;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Fabrica extends javax.swing.JFrame {
    ArrayList<Cartas> cartas = new ArrayList<Cartas>();
    ArrayList<Dados> dados = new ArrayList<Dados>();

    
    public Fabrica() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JButton();
        ButtonAgregarDados = new javax.swing.JButton();
        ButtonAgregarCartas = new javax.swing.JButton();
        ButtonCrearFactura = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturacion");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Facturación de Juegos de Mesa");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

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
        getContentPane().add(ButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        ButtonAgregarDados.setBackground(new java.awt.Color(51, 51, 51));
        ButtonAgregarDados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonAgregarDados.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgregarDados.setText("Agregar Dados");
        ButtonAgregarDados.setBorderPainted(false);
        ButtonAgregarDados.setContentAreaFilled(false);
        ButtonAgregarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAgregarDados.setFocusPainted(false);
        ButtonAgregarDados.setOpaque(true);
        ButtonAgregarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgregarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 120, -1));

        ButtonAgregarCartas.setBackground(new java.awt.Color(51, 51, 51));
        ButtonAgregarCartas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonAgregarCartas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgregarCartas.setText("Agregar Cartas");
        ButtonAgregarCartas.setBorderPainted(false);
        ButtonAgregarCartas.setContentAreaFilled(false);
        ButtonAgregarCartas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAgregarCartas.setFocusPainted(false);
        ButtonAgregarCartas.setOpaque(true);
        ButtonAgregarCartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarCartasActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgregarCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 120, -1));

        ButtonCrearFactura.setBackground(new java.awt.Color(51, 51, 51));
        ButtonCrearFactura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonCrearFactura.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCrearFactura.setText(" Crear Factura ");
        ButtonCrearFactura.setBorderPainted(false);
        ButtonCrearFactura.setContentAreaFilled(false);
        ButtonCrearFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCrearFactura.setFocusPainted(false);
        ButtonCrearFactura.setOpaque(true);
        ButtonCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCrearFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 120, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/appBackground.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCrearFacturaActionPerformed

    private void ButtonAgregarCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarCartasActionPerformed
        Window parentWindow = SwingUtilities.windowForComponent(this);
        Frame parentFrame = (Frame)parentWindow;
        AgregarCartas agregarCartasWindow = new AgregarCartas(parentFrame, true);
        this.setVisible(false);
        agregarCartasWindow.setVisible(true);
        
        cartas.add(agregarCartasWindow.getCartas());
        
        this.setVisible(true);
        
    }//GEN-LAST:event_ButtonAgregarCartasActionPerformed

    private void ButtonAgregarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarDadosActionPerformed
        Window parentWindow = SwingUtilities.windowForComponent(this);
        Frame parentFrame = (Frame)parentWindow;
        AgregarDados agregarDadosWindow = new AgregarDados(parentFrame, true);
        this.setVisible(false);
        agregarDadosWindow.setVisible(true);
        
        dados.add(agregarDadosWindow.getDados());
        
        this.setVisible(true);
    }//GEN-LAST:event_ButtonAgregarDadosActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fabrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarCartas;
    private javax.swing.JButton ButtonAgregarDados;
    private javax.swing.JButton ButtonCrearFactura;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
