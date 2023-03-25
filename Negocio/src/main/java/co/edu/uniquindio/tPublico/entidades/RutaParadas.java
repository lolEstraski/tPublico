package co.edu.uniquindio.tPublico.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RutaParadas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Builder
    public RutaParadas(Integer codigo) {
        this.codigo = codigo;
    }

    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------

    @ManyToOne
    @JoinColumn(nullable = false)
    private Ruta ruta;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Parada parada;

}
