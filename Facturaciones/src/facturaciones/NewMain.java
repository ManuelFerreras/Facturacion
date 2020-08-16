
package facturaciones;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;

public class NewMain {
    private static final String DEST = "D:\\Facturacion\\Facturacion\\primer.pdf"; 
    
    public static void main(String[] args) throws IOException{
        new NewMain().CrearPdf(DEST);
    }
    
    public void CrearPdf(String dest) throws IOException{
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        document.add(new Paragraph("Hola Mundo"));
        document.close();
        System.out.println("Listo");
    }
    
}
