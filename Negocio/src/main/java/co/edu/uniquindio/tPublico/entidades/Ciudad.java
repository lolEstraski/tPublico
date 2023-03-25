package co.edu.uniquindio.tPublico.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ciudad implements Serializable {

    //Este atrubuto es la PK de la entidad
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    //----------------------------------- Atribustos de la entidad -------------------------------------
    @Column(nullable = false)
    private String nombreCiudad;
    //Constructor
    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------

    @JoinColumn(nullable = false)
    @ManyToOne
    private Ruta id;

    @OneToOne
    private Ubicacion ubicacion;
}
