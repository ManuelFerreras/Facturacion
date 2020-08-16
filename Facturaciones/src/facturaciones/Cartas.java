
package facturaciones;

public class Cartas {
    TipoCartas tipo;
    ColorCartas color;
    
    
    public int getPrecio(){
        return tipo.getPrecio() + color.getPrecio();
    }
    
    public void instantiateConColor(){
        color = new ConColorCartas();
    }
    
    public void instantiateSinColor(){
        color = new SinColorCartas();
    }
    
    public void instantiatePremium(){
        tipo = new Premium();
    }
    
    public void instantiateNormal(){
        tipo = new Normal();
    }
}
