package state.connection;

public class Conexion {
    
    private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new EstadoCerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void abrir() {
        estado.abrir(this);
    }

    public void cerrar() {
        estado.cerrar(this);
    }

    public void parar() {
        estado.parar(this);
    }

    public void iniciar() {
        estado.iniciar(this);
    }

    public void enviar(String msg) {
        estado.enviar(msg,this.link,this);
    }

    public void recibir(int respuesta) {
        estado.recibir(respuesta,this);
    }
    
    public void setEstado(Estado estado){
        this.estado=estado;
    }

}
