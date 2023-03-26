package co.edu.uniquindio.tPublico.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pasajero extends  Persona implements Serializable {

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String usuario;

    public Pasajero(String password, String usuario) {
        this.password = password;
        this.usuario = usuario;
    }

    //----------------------------ENTIDAD RELACIÓN-----------------------------------------------------------------

    @ManyToOne
    @JoinColumn(nullable = false)
    private Ruta rutaPasajero;
}
