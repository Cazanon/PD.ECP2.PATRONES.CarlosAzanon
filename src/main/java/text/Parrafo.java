package text;

import java.util.ArrayList;

public class Parrafo extends Componente {

    private ArrayList<Caracter> parrafo;
    
    public Parrafo(){
        this.parrafo=new ArrayList<Caracter>();
        this.isCaracter=false;
    }
    
    @Override
    public void add(Componente componente){
        if(componente.isCaracter){
            this.parrafo.add((Caracter)componente);         
        }else{
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
