package factoryMethod.naturalNumber;

public class NaturalNumberManager {
    
    private static NaturalNumberManager manager;   
    
    private NaturalNumber naturalNumber;
    private NaturalNumberCreator naturalNumberCreator;
    
    private NaturalNumberManager(){        
    }
    
    public static NaturalNumberManager getManager(){
        if(NaturalNumberManager.manager==null){
            NaturalNumberManager.manager=new NaturalNumberManager();
        }
        return NaturalNumberManager.manager;
    }

    public void setCreator(NaturalNumberCreator naturalNumberCreator){
        this.naturalNumberCreator=naturalNumberCreator;
    }

    public void createNaturalNumber(int valor){
        this.naturalNumber=this.naturalNumberCreator.createNaturalNumber(valor);
    }

    public NaturalNumber getNaturalNumber(){
        return naturalNumber;
    }
    
}
