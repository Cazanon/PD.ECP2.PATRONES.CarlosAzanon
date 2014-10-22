package state.connection;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConexionTest {
    private Conexion conexion;

    private LinkMock link;

    @Before
    public void ini() {
        this.link = new LinkMock();
        this.conexion = new Conexion(this.link);
    }

    @Test
    public void testEstadoInicial() {
        assertEquals("CERRADO", this.conexion.getEstado().toString().toString());
    }

    @Test
    public void testCerradoAbrir() {
        this.conexion.abrir();
        assertEquals("PREPARADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testCerradoCerrar() {
        this.conexion.cerrar();
        assertEquals("CERRADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testCerradoNoSoportadoParar() {
        try {
            this.conexion.parar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoIniciar() {
        try {
            this.conexion.iniciar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoEnviar() {
        try {
            this.conexion.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testCerradoNoSoportadoRecibir() {
        try {
            this.conexion.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testPreparadoAbrir() {
        this.conexion.abrir();
        this.conexion.abrir();
        assertEquals("PREPARADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testPreparadoCerrar() {
        this.conexion.abrir();
        this.conexion.cerrar();
        assertEquals("CERRADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testPreparadoParar() {
        this.conexion.abrir();
        this.conexion.parar();
        assertEquals("PARADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testPreparadoIniciar() {
        this.conexion.abrir();
        this.conexion.iniciar();
        assertEquals("PREPARADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testPreparadoEnviar() {
        this.conexion.abrir();
        this.conexion.enviar("...");
        assertEquals("ESPERANDO", this.conexion.getEstado().toString());
        assertEquals("...", link.getMsg());
    }

    @Test
    public void testPreparadoNoSoportadoRecibir() {
        this.conexion.abrir();
        try {
            this.conexion.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoAbrir() {
        this.conexion.abrir();
        this.conexion.parar();
        try {
            this.conexion.abrir();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoNoSoportadoCerrar() {
        this.conexion.abrir();
        this.conexion.parar();
        try {
            this.conexion.cerrar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoParar() {
        this.conexion.abrir();
        this.conexion.parar();
        this.conexion.parar();
        assertEquals("PARADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testParadoIniciar() {
        this.conexion.abrir();
        this.conexion.parar();
        this.conexion.iniciar();
        assertEquals("PREPARADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testParadoNoSoportadoEnviar() {
        this.conexion.abrir();
        this.conexion.parar();
        try {
            this.conexion.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoRecibir() {
        this.conexion.abrir();
        this.conexion.parar();
        try {
            this.conexion.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testEsperandoNoSoportadoAbrir(){
        this.conexion.abrir();
        this.conexion.enviar("");
        try {
            this.conexion.abrir();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoCerrar(){
        this.conexion.abrir();
        this.conexion.enviar("");
        try {
            this.conexion.cerrar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoParar(){
        this.conexion.abrir();
        this.conexion.enviar("");
        try {
            this.conexion.parar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoIniciar(){
        this.conexion.abrir();
        this.conexion.enviar("");
        try {
            this.conexion.iniciar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoEnviar(){
        this.conexion.abrir();
        this.conexion.enviar("");
        try {
            this.conexion.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoRecibirACK() {
        this.conexion.abrir();
        this.conexion.enviar("...");
        this.conexion.recibir(Link.ACK);
        assertEquals("PREPARADO", this.conexion.getEstado().toString());
    }

    @Test
    public void testEsperandoRecibirError() {
        this.conexion.abrir();
        this.conexion.enviar("...");
        this.conexion.recibir(1);
        assertEquals("CERRADO", this.conexion.getEstado().toString());
    }


}
