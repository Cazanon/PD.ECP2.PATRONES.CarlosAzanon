package calculadora;

import upm.jbb.IO;

public class ComandoRestar extends ComandoAbstract{

    public ComandoRestar(Calculadora calc) {
        super(calc);
    }

    @Override
    public String name() {
        return Comando.restar;
    }

    @Override
    public void execute() {
        int valor=IO.in.readInt("Introduzca numero:");
        this.getCalculadora().restar(valor);
    }

}
