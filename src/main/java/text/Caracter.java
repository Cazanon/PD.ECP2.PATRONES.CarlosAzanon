package text;

public class Caracter extends Componente{
    
    private char caracter;

    public Caracter(char caracter) {
        this.caracter=caracter;
        this.isCaracter=true;
    }

    @Override
    public void add(Componente componente) {        
    }

    @Override
    public String dibujar(boolean mayusculas) {
        if(mayusculas){
            return String.valueOf(caracter).toUpperCase();
        }else{
            return String.valueOf(caracter);    
        }
    }
    
}
