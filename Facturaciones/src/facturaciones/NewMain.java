
package facturaciones;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class NewMain {
    private static final String DEST = "C:\\Users\\manue\\OneDrive\\Documentos\\NetBeansProjects\\Facturacion\\primer.pdf"; 
    private static String dest;
    
    public static void main(String[] args) throws IOException{
        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Seleccione la Carpeta Donde Exportar el PDF");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){}
        dest =  fc.getSelectedFile().getAbsolutePath() + "\\Factura.pdf";
        
        new NewMain().CrearPdf(dest);
        
    }
    
    public void CrearPdf(String dest) throws IOException{
        float [] pointColumnWidths = {150F, 150F, 150F, 150F};   
        Table table = new Table(pointColumnWidths);
        
        table.addCell("Name");       
        table.addCell("Raju");       
        table.addCell("Id");       
        table.addCell("1001");       
        table.addCell("Designation");       
        table.addCell("Programmer");
        
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        document.add(table);
        document.close();
        System.out.println("Listo");
    }
    
}
