package calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoAbstract{

    public ComandoGuardar(Calculadora calc) {
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
