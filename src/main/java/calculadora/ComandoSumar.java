package calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {

	private Calculadora calculadora;
	
	public ComandoSumar(Calculadora calc) {
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
