package calculadora;

public class ComandoIniciar extends ComandoAbstract{

    public ComandoIniciar(Calculadora calc) {
        super(calc);
    }

    @Override
    public String name() {
        return Comando.iniciar;
    }

    @Override
    public void execute() {
        this.getCalculadora().iniciar();
    }

}
