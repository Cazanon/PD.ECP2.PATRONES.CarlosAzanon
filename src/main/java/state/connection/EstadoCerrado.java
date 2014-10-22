package state.connection;

public class EstadoCerrado extends Estado {

    @Override
    public void abrir(Conexion conexion) {
        conexion.setEstado(new EstadoPreparado());
    }

    @Override
    public void cerrar(Conexion conexion) {
    }

    @Override
    public void enviar(String msg, Link link, Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public void recibir(int respuesta, Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public String toString() {
        return "CERRADO";
    }

}
