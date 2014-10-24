package text;

public abstract class Componente {
    //Composite
    
    public abstract void add(Componente componente);

    public abstract String dibujar(boolean mayusculas);
    
    public boolean isCaracter;

}
