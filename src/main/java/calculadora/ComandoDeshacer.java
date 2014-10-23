package calculadora;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoMementableAbstract{

    public ComandoDeshacer(CalculadoraMementable calc,GestorMementos<MementoCalculadora> gestor) {
        super(calc,gestor);
    }
    
    @Override
    public void execute() {
        String[] mementos=this.getGestorMementos().keys();
        if(mementos.length > 0){
            String nombreMemento=String.valueOf(IO.in.select(mementos,"Seleccionar estado guardado"));
            MementoCalculadora memento = this.getGestorMementos().getMemento(nombreMemento);
            this.getCalculadoraMementable().restaurarMemento(memento);
        }else{
            IO.out.println("No hay estados guardados");
        }
    }
    
    @Override
    public String name() {
        return ComandoMementableAbstract.deshacer;
    }

}
