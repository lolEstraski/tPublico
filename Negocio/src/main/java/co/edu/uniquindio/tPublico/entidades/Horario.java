package co.edu.uniquindio.tPublico.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Horario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idHorario;
    private String dia;

    private String  hora;

    private String frecuencia;

    @Builder
    public Horario(String idHorario, String dia, String hora, String frecuencia) {
        this.idHorario = idHorario;
        this.dia = dia;
        this.hora = hora;
        this.frecuencia = frecuencia;
    }

    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------

    @JoinColumn(nullable = false)
    @ManyToOne
    private Ruta id;
}
