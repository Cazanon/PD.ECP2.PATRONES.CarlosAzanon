package state.connection;

public class EstadoEsperando extends Estado {

    @Override
    public void abrir(Conexion conexion) {        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public void enviar(String msg, Link link, Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida...");
    }

    @Override
    public void recibir(int respuesta, Conexion conexion) {
        if(respuesta==Link.ACK){
            conexion.setEstado(new EstadoPreparado());
        }else{
            conexion.setEstado(new EstadoCerrado());
        }
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
        return "ESPERANDO";
    }

}
