package composite.expression;

public abstract class Operacion extends Expresion{

    private Expresion expresion1;
    private Expresion expresion2;
    
    public Operacion(Expresion exppresion1,Expresion expresion2){
        setExpresion1(expresion1);
        setExpresion2(expresion2);
    }
    
    public Expresion getExpresion1(){
        return expresion1;
    }
    
    public void setExpresion1(Expresion expresion1){
        this.expresion1 = expresion1;
    }
    
    public Expresion getExpresion2(){
        return expresion2;
    }
    
    public void setExpresion2(Expresion expresion2){
        this.expresion2 = expresion2;
    }
    
    public abstract int operar();

    
}
