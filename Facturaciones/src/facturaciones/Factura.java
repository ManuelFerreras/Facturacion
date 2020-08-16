/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaciones;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JDialog {
    ArrayList<Cartas> cartas;
    ArrayList<Dados> dados;
    private int precioTotal = 0;
    
    public Factura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setBorder(new EmptyBorder(2,2,2,2));
        jTable1.setShowGrid(false);
        jTable1.setIntercellSpacing(new Dimension(0,0));
        
    }
    
    
    class jPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D d2d = (Graphics2D)g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(66, 39, 90);
            Color color2 = new Color(114, 74, 109);
            GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
            d2d.setPaint(gp);
            d2d.fillRect(0, 0, width, height);
            
        }
    }
    
    public void updateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        for (int i = 0; i < cartas.size(); i++) {
            model.addRow(new Object[]{"Cartas", cartas.get(i).getTipo(), cartas.get(i).getColor(), cartas.get(i).getPrecio()});
            precioTotal+= cartas.get(i).getPrecio();
        }
        for (int i = 0; i < dados.size(); i++) {
            model.addRow(new Object[]{"Dados", dados.get(i).getTipo(), dados.get(i).getColor(), dados.get(i).getPrecio()});
            precioTotal+= dados.get(i).getPrecio();
        }
        
        jLabel2.setText("$ " + Integer.toString(precioTotal));
    }

    public void setCartas(ArrayList<Cartas> cartas){
        this.cartas = cartas;
    }
    
    public void setDados(ArrayList<Dados> dados){
        this.dados = dados;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new jPanelGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Juego", "Material del Juego", "Color del Juego", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 850, 440));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio total:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 690, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("0");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 690, -1, -1));

        jButton1.setText("Volver");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 660, 100, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Factura dialog = new Factura(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
