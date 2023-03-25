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
@NoArgsConstructor
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

}
