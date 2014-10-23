package calculadora;

public interface Comando {

	public final static String sumar="SUMAR";
	public final static String restar="RESTAR";
	public final static String iniciar="INICIAR";
	public final static String imprimir="IMPRIMIR";
	
	public String name();
	public void execute();

}
