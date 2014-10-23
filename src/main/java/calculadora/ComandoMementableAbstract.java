package calculadora;

public abstract class ComandoMementableAbstract implements Comando{

    private Calculadora calc;
    
    public ComandoMementableAbstract(Calculadora calc){
        this.calc=calc;
    }
    
    public Calculadora getCalculadora(){
        return this.calc;
    }
    
}
