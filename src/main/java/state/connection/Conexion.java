package state.connection;

public class Conexion {
    
    private Estados estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estados.CERRADO;
    }

    public Link getLink() {
        return link;
    }

    public Estados getEstado() {
        return this.estado;
    }

    public void abrir() {
        if (this.estado == Estados.CERRADO) {
            this.estado = Estados.PREPARADO;
        } else if (this.estado == Estados.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PREPARADO) {
        } else if (this.estado == Estados.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else
            assert false : "estado imposible";
    }

    public void cerrar() {
        if (this.estado == Estados.CERRADO) {
        } else if (this.estado == Estados.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PREPARADO) {
            this.estado = Estados.CERRADO;
        } else if (this.estado == Estados.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void parar() {
        if (this.estado == Estados.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PARADO) {
        } else if (this.estado == Estados.PREPARADO) {
            this.estado = Estados.PARADO;
        } else if (this.estado == Estados.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void iniciar() {
        if (this.estado == Estados.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PARADO) {
            this.estado = Estados.PREPARADO;
        } else if (this.estado == Estados.PREPARADO) {
        } else if (this.estado == Estados.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void enviar(String msg) {
        if (this.estado == Estados.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PREPARADO) {
            this.link.enviar(msg);
            this.estado = Estados.ESPERANDO;
        } else if (this.estado == Estados.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void recibir(int respuesta) {
        if (this.estado == Estados.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.PREPARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estados.ESPERANDO) {
            if (respuesta == 0) {
                this.estado = Estados.PREPARADO;
            } else {
                this.estado = Estados.CERRADO;
            }
        }
        assert false : "estado imposible";
    }

}
