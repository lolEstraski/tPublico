package co.edu.uniquindio.tPublico.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Horario implements Serializable {

    @Id
    private String dHorario;

    private String dia;

    private String  hora;

    private String frecuencia;


}
