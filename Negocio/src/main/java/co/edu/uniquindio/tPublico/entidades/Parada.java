package co.edu.uniquindio.tPublico.entidades;

import lombok.*;

import javax.persistence.*;
import javax.swing.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Parada implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false)
    private String urlimagen;

    public Parada(Integer codigo, String urlimagen) {
        this.codigo = codigo;
        this.urlimagen = urlimagen;
    }

    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------


    @OneToMany(mappedBy = "rutaParada")
    @ToString.Exclude
    private List<RutaParadas> rutaParadas;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Ubicacion ubicacion;
}
