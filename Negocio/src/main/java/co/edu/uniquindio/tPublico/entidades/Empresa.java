package co.edu.uniquindio.tPublico.entidades;


import com.sun.istack.Nullable;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Empresa implements Serializable{
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nit;

    @ElementCollection
    private List<String> telefonos;

    @Column(nullable = false)
    private String direccion;

    @Builder
    public Empresa(Integer nit, List<String> telefonos, String direccion) {
        this.nit = nit;
        this.telefonos = telefonos;
        this.direccion = direccion;
    }

    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------

    @ToString.Exclude
    @OneToMany(mappedBy = "nit")
    private List<Ruta> rutas;
}
