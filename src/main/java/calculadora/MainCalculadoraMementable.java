package calculadora;

import upm.jbb.IO;

public class MainCalculadoraMementable {
    private GestorComandos gestorComandos;
    private GestorMementos<MementoCalculadora> gestorMementos;

    public MainCalculadoraMementable() {
        CalculadoraMementable calc = new CalculadoraMementable();
        this.gestorMementos=new GestorMementos<MementoCalculadora>();
        this.gestorComandos=new GestorComandos();
        this.gestorComandos.add(new ComandoSumar(calc));
        this.gestorComandos.add(new ComandoRestar(calc));
        this.gestorComandos.add(new ComandoIniciar(calc));
        this.gestorComandos.add(new ComandoImprimir(calc));
        this.gestorComandos.add(new ComandoGuardar(calc,gestorMementos));
        this.gestorComandos.add(new ComandoDeshacer(calc,gestorMementos));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestorComandos.keys());
        this.gestorComandos.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadoraMementable());
    }
}
