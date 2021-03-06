/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaciones;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import static com.itextpdf.layout.property.Property.FONT;
import com.itextpdf.layout.property.TextAlignment;
import com.sun.javafx.font.FontFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JDialog {
    ArrayList<Cartas> cartas;
    ArrayList<Dados> dados;
    private int precioTotal;
    private String dest;
    private static final String LOGO = System.getProperty("user.dir") + "\\Logo\\logo.png";
    
    public Factura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        precioTotal = 0;
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
    
    
    
    public void CrearPdf(String dest) throws IOException{
        PdfFont boldFont = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
        PdfFont normalFont = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont headerFont = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
        float [] pointColumnWidths = {150F, 150F, 150F, 150F};   
        Table table = new Table(pointColumnWidths);
        Image logo = new Image(ImageDataFactory.create(LOGO));
        Paragraph p1 = new Paragraph("FACTURA C").setFont(headerFont).setFontSize(20);
        
        p1.setMarginLeft(200f);
        Paragraph p2 = new Paragraph("").add(logo).add("\n\n\n\n\n");
        p2.setMarginLeft(90f);
        
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
                table.addHeaderCell(jTable1.getColumnName(i)).setFont(boldFont).setFontSize(14);
            }
      
        for (int rows = 0; rows < jTable1.getRowCount(); rows++) {
            for (int cols = 0; cols < jTable1.getColumnCount(); cols++) {
                table.addCell(jTable1.getModel().getValueAt(rows, cols).toString()).setFont(normalFont);
                table.getHeader().setFont(boldFont);
            }
        }
        
        for (int i = 0; i < 8; i++) {
            if(i == 7){
                table.addCell("Total: " + jLabel2.getText());
            } else{
                table.addCell("").setFont(normalFont);
            }
        }
        
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        document.add(p1);
        document.add(p2);
        document.add(table);
        document.close();
        JOptionPane.showMessageDialog(this, "PDF Creado exitosamente.");
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
            model.addRow(new Object[]{"Cartas", cartas.get(i).getTipo(), cartas.get(i).getColor(),"$ " + cartas.get(i).getPrecio()});
            precioTotal+= cartas.get(i).getPrecio();
        }
        for (int i = 0; i < dados.size(); i++) {
            model.addRow(new Object[]{"Dados", dados.get(i).getTipo(), dados.get(i).getColor(),"$ " + dados.get(i).getPrecio()});
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
        jPanel1 = new jPanelGradient();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exportar Tabla a PDF");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("0");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 631, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(224, 224, 224))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(581, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Seleccione la Carpeta Donde Exportar el PDF");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){}
        dest =  fc.getSelectedFile().getAbsolutePath() + "\\Factura.pdf";
        try {
            CrearPdf(dest);
        } catch (IOException ex) {}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
