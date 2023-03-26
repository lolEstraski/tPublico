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


    @ManyToOne
    @JoinColumn(nullable = false)
    private Empresa empresa;

    @OneToMany(mappedBy = "rutaPasajero")
    @ToString.Exclude
    private List<Pasajero> pasajeros;

    @OneToMany(mappedBy = "rutaC")
    @ToString.Exclude
    private List<Conductor> conductores;

    @OneToMany(mappedBy = "ruta")
    @ToString.Exclude
    private List<Horario> horarios;

    @OneToMany(mappedBy = "codigo")
    @ToString.Exclude
    private List<RutaParadas> rutaParadas;

    @ToString.Exclude
    @OneToMany(mappedBy = "codigo")
    private List<Ciudad> ciudades;
}
