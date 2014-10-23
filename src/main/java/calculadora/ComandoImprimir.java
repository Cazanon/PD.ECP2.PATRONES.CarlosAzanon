package calculadora;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoAbstract{

    public ComandoImprimir(Calculadora calc) {
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
