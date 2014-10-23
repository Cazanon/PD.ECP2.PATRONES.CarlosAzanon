package calculadora;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoAbstract{

    public ComandoDeshacer(Calculadora calc) {
        super(calc);
    }

    @Override
    public String name() {
        return Comando.imprimir;
    }

    @Override
    public void execute() {
        IO.out.println("Resultado total: " + this.getCalculadora().getTotal());
    }


}
