package co.edu.uniquindio.tPublico.entidades;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@MappedSuperclass
@ToString
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona  implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer  cedula;

    @Column(nullable = false, length = 180)
    @Length(max = 180)
    private String  nombre;

    @Column(nullable = false, unique = true, length = 200)
    @Email
    @Length(max = 200)
    private String  email;

    @Column(nullable = false, length = 180)
    @Length(max = 180)
    private String  domicilio;

    @Column(nullable = false, length = 180)
    @Length(max = 180)
    private Integer  edad;

    @ElementCollection
    private List<String> telefonos;

    @Builder
    public Persona(Integer cedula, String nombre, String email, String domicilio, Integer edad, List<String> telefonos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.domicilio = domicilio;
        this.edad = edad;
        this.telefonos = telefonos;
    }

    public Persona() {
    }

    public Persona(Integer cedula) {
    }
}
