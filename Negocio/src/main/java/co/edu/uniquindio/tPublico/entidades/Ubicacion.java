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

    @ToString.Exclude
    @OneToMany(mappedBy = "codigo")
    private List<Parada> Paradas;

    @OneToOne(mappedBy = "codigo")
    private Ciudad ciudad;
}
