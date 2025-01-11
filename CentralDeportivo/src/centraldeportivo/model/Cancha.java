package centraldeportivo.model;


public class Cancha {
    private int id_cancha;
    private String descripcion;
    private char estado;
    private String deporte;

    public Cancha(int id_cancha, String descripcion, char estado, String deporte) {
        this.id_cancha = id_cancha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.deporte = deporte;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public void setId_cancha(int id_cancha) {
        this.id_cancha = id_cancha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char actividad) {
        this.estado = actividad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    
}
