package text;

import java.util.ArrayList;

public class Texto extends Componente {
    
    private ArrayList<Componente> texto;
    
    public Texto(){
        texto=new ArrayList<Componente>();
    }
    
    @Override
    public void add(Componente componente){
        try{
            this.texto.add((Texto)componente);         
        }catch(ClassCastException e1){
            try{
                this.texto.add((Parrafo)componente);           
            }catch(ClassCastException e2){
                throw new UnsupportedOperationException();
            }
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
