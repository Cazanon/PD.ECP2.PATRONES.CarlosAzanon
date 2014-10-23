package calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora>{
	
    public CalculadoraMementable() {
        super();
    }

    @Override
    public MementoCalculadora crearMemento() {
        return new MementoCalculadora(this.getTotal());
    }

    @Override
    public void restaurarMemento(MementoCalculadora memento) {
        this.setTotal(memento.getMemento());
    }

}
