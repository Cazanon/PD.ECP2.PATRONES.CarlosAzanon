package calculadora;

public abstract class ComandoMementableAbstract extends ComandoAbstract{

    private CalculadoraMementable calcMementable;

    private GestorMementos<MementoCalculadora> gestor;
    
    public ComandoMementableAbstract(CalculadoraMementable calcMementable, GestorMementos<MementoCalculadora> gestor) {
        super(calcMementable);
        this.calcMementable=calcMementable;
        this.gestor=gestor;
    }
    
    public CalculadoraMementable getCalculadoraMementable(){
        return calcMementable;
    }
        
    public GestorMementos<MementoCalculadora> getGestorMementos(){
        return this.gestor;
    }
    
}
