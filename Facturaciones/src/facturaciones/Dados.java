
package facturaciones;

public class Dados {
    TipoDados tipo;
    ColorDados color;
    
    
    public int getPrecio(){
        return tipo.getPrecio() + color.getPrecio();
    }
    
    public void instantiateConColor(){
        color = new ConColorDados();
    }
    
    public void instantiateSinColor(){
        color = new SinColorDados();
    }
    
    public void instantiateMadera(){
        tipo = new Madera();
    }
    
    public void instantiatePlastico(){
        tipo = new Plastico();
    }

    public String getTipo() {
        if (tipo instanceof Madera){
            return "Madera";
        } else {
            return "Plastico";
        }
    }

    public String getColor() {
        if(color instanceof ConColorDados) {
            return "Con Color";
        } else {
            return "Blancos";
        }
    }
}
