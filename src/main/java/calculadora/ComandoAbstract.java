package calculadora;

public abstract class ComandoAbstract implements Comando{

    private Calculadora calc;
    
    public ComandoAbstract(Calculadora calc){
        this.calc=calc;
    }
    
    public Calculadora getCalculadora(){
        return this.calc;
    }
    
}
