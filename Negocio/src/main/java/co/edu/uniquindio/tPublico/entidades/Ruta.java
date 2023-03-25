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
public class Ruta implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Builder
    public Ruta(Integer id) {
        this.id = id;
    }
    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------
    @JoinColumn(nullable = false)
    @ManyToOne
    private Administrador cedula;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Empresa nit;

    @ToString.Exclude
    @OneToMany(mappedBy = "id")
    private List<Pasajero> pasajeros;

    @ToString.Exclude
    @OneToMany(mappedBy = "id")
    private List<Conductor> conductores;

    @ToString.Exclude
    @OneToMany(mappedBy = "idHorario")
    private List<Horario> horarios;

    @ToString.Exclude
    @OneToMany(mappedBy = "codigo")
    private List<RutaParadas> rutaParadas;

    @ToString.Exclude
    @OneToMany(mappedBy = "codigo")
    private List<Ciudad> ciudades;
}
