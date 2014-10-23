package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factoria;
    
    private Map<Character,Caracter> caracteres;
    
    private FactoriaCaracter(){
        caracteres=new HashMap<Character,Caracter>();
    }
    
    public static FactoriaCaracter getFactoria(){
        //Singleton
        if(FactoriaCaracter.factoria==null){
            FactoriaCaracter.factoria=new FactoriaCaracter();            
        }
        return FactoriaCaracter.factoria;
    }

    public Caracter get(char key){
        //Flyweight
        if (caracteres.containsKey(key)){
            return caracteres.get(key);
        }else{
            Caracter caracter = new Caracter(key);
            caracteres.put(key, caracter);
            return caracter;
        }
    }
    
}
