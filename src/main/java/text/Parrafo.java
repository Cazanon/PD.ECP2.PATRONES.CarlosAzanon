package text;

import java.util.ArrayList;

public class Parrafo extends Componente {

    private ArrayList<Caracter> parrafo;
    
    public Parrafo(){
        parrafo=new ArrayList<Caracter>();
    }
    
    @Override
    public void add(Componente componente){
        try{
            this.parrafo.add((Caracter)componente);         
        }catch(ClassCastException e1){
            throw new UnsupportedOperationException();
        }       
    }

    @Override
    public String dibujar(boolean mayusculas){
        String parraf="";
        for(Caracter caracter: parrafo) {
            parraf+=caracter.dibujar(mayusculas);
        }
        return parraf+"\n";
    }

}
