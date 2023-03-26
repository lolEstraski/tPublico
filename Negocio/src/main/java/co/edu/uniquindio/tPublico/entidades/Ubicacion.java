package co.edu.uniquindio.tPublico.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ubicacion  implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUbicacion;

    @Column(nullable = false)
    private String longitud;

    @Column(nullable = false)
    private String latitud;

    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------

    @OneToMany(mappedBy = "ubicacion")
    @ToString.Exclude
    private List<Parada> Paradas;

    @OneToOne(mappedBy = "ubicacion")
    private Ciudad ciudad;
}
