package calculadora;

import upm.jbb.IO;

public class ComandoSumar extends ComandoAbstract{
	
	public ComandoSumar(Calculadora calc) {
		super(calc);
	}

	@Override
	public String name() {
		return Comando.sumar;
	}

	@Override
	public void execute() {
	    int valor=IO.in.readInt("Introduzca numero:");
		this.getCalculadora().sumar(valor);
	}

}
