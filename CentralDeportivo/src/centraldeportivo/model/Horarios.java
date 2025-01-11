package centraldeportivo.model;

import java.util.Date;

public class Horarios {
    private Date fechaHora;
    private int id_cancha;
    private int id_persona;

    public Horarios(Date fechaHora, int id_cancha, int id_persona) {
        this.fechaHora = fechaHora;
        this.id_cancha = id_cancha;
        this.id_persona = id_persona;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public void setId_cancha(int id_cancha) {
        this.id_cancha = id_cancha;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    
    
}
