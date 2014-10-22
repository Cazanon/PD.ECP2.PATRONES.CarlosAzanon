package composite.expression;

public class Sumar extends Operacion {

    public Sumar(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public int operar() {
        return getExpresion1().operar()+getExpresion2().operar();
    }

    @Override
    public String toString() {
        return "("+getExpresion1().toString()+"+"+getExpresion2().toString()+")";
    }

}
