package calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoMementableAbstract{
    
    public ComandoGuardar(CalculadoraMementable calc,GestorMementos<MementoCalculadora> gestor) {
        super(calc,gestor);
    }
    
    @Override
    public void execute() {
        String nombreMemento=IO.in.readString("Nombre de guardado");
        MementoCalculadora memento=this.getCalculadoraMementable().crearMemento();
        this.getGestorMementos().addMemento(nombreMemento,memento);
    }
    
    @Override
    public String name() {
        return ComandoMementableAbstract.guardar;
    }

}
