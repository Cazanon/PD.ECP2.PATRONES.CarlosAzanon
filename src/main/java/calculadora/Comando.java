package calculadora;

public interface Comando {

	public final static String sumar="SUMAR";
	public final static String restar="RESTAR";
	public final static String iniciar="INICIAR";
	public final static String imprimir="IMPRIMIR";

    public final static String guardar="GUARDAR";
    public final static String deshacer="DESHACER";
	
	public String name();
	public void execute();

}
