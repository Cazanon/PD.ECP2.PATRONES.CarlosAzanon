package text;

import java.util.ArrayList;

public class Texto extends Componente {
    
    private ArrayList<Componente> texto;
    
    public Texto(){
        this.texto=new ArrayList<Componente>();
        this.isCaracter=false;
    }
    
    @Override
    public void add(Componente componente){
        if(componente.isCaracter){
            throw new UnsupportedOperationException();
        }else{
            this.texto.add(componente);   
        }     
    }

    @Override
    public String dibujar(boolean mayusculas){
        String txt="";
        for(Componente componente:texto){
            txt+=componente.dibujar(mayusculas);
        }
        return txt+"---o---\n";
    }

}
