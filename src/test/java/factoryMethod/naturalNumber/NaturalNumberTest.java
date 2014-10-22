package factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class NaturalNumberTest {
    
    @Test
    public void testNaturalNumberManagerIsSingleton() {
        assertSame(NaturalNumberManager.getManager(), NaturalNumberManager.getManager());
    }

    @Test
    public void testNaturalNumberManagerSingletonNotNull() {
        assertNotNull(NaturalNumberManager.getManager());
    }

    @Test
    public void testNaturalNumberManagerES() {
        NaturalNumberManager.getManager().setCreator(new NaturalNumberEScreator());
        NaturalNumberManager.getManager().createNaturalNumber(4);
        assertEquals("cuatro", NaturalNumberManager.getManager().getNaturalNumber().getTextValue());    
    }
    
    @Test
    public void testNaturalNumberManagerFR() {
        NaturalNumberManager.getManager().setCreator(new NaturalNumberFRcreator());
        NaturalNumberManager.getManager().createNaturalNumber(3);
        assertEquals("trois", NaturalNumberManager.getManager().getNaturalNumber().getTextValue());
    }

    @Test
    public void testNaturalNumberManagerEN() {
        NaturalNumberManager.getManager().setCreator(new NaturalNumberENcreator());
        NaturalNumberManager.getManager().createNaturalNumber(2);
        assertEquals("two", NaturalNumberManager.getManager().getNaturalNumber().getTextValue());
    }

}
