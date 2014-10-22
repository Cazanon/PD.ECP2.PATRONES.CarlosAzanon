package calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {

	private TestCalc calculadora;
	
	public ComandoSumar(TestCalc calc) {
		calculadora=calc;
	}

	@Override
	public String name() {
		return Comando.sumar;
	}

	@Override
	public void execute() {
		int valor=IO.in.readInt();
		calculadora.sumar(valor);
	}

}
