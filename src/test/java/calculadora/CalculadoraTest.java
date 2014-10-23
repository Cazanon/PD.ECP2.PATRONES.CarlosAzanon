package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import composite.expression.Dividir;
import composite.expression.Expresion;
import composite.expression.Multiplicar;
import composite.expression.Numero;
import composite.expression.Restar;
import composite.expression.Sumar;

public class CalculadoraTest {
    private Expresion exp1, exp2, exp3, exp4, exp5, exp6;

    @Before
    public void ini() {
        this.exp1 = new Numero(4);
        this.exp2 = new Sumar(this.exp1, new Numero(2));
        this.exp3 = new Restar(this.exp1, new Numero(3));
        this.exp4 = new Multiplicar(this.exp1, new Numero(2));
        this.exp5 = new Dividir(this.exp1, new Numero(3));
        this.exp6 = new Sumar(new Restar(new Numero(3), new Multiplicar(
                new Dividir(this.exp1, new Numero(2)), new Numero(3))), this.exp1); // ((3-((4/2)*3))+4)
    }

    @Test
    public void testValor() {
        assertEquals(4, this.exp1.operar());
    }

    @Test
    public void TestSuma() {
        assertEquals(6, this.exp2.operar());
    }
    
}
