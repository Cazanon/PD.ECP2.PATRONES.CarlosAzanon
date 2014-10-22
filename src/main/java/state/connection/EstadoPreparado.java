package state.connection;

public class EstadoPreparado extends Estado {

    @Override
    public void abrir(Conexion conexion) {
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new EstadoCerrado());
    }

    @Override
    public void enviar(String msg, Link link, Conexion conexion) {
        link.enviar(msg);
        conexion.setEstado(new EstadoEsperando());
    }

    @Override
    public void recibir(int respuesta, Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public void iniciar(Conexion conexion) {
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(new EstadoParado());
    }

    @Override
    public String toString() {
        return "PREPARADO";
    }

}
