package calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {

	private CalculadoraTest calculadora;
	
	public ComandoImprimir(CalculadoraTest calc) {
		calculadora=calc;
	}

	@Override
	public String name() {
		return Comando.imprimir;
	}

	@Override
	public void execute() {
		int valor=calculadora.getTotal();
		IO.out.print(valor);
	}

}
