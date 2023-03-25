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

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false)
    private String nombreUsuario;

    public Administrador(Integer cedula) {
        super(cedula);
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
    }

    //-----------------------ENTIDAD RELACIÓN-----------------------------------------------------------------
    @ToString.Exclude
    @OneToMany(mappedBy = "cedula")
    private List<Ruta> rutas;


}
