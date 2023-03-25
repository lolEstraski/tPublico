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
public class Administrador extends Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false)
    private String nombreUsuario;

    @Builder
    public Administrador(Integer codigo, String contrasena, String nombreUsuario) {
        this.codigo = codigo;
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
    }
//----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------
    @ToString.Exclude
    @OneToMany(mappedBy = "codigo")
    private List<Ruta> rutas;


}
