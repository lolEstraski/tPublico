package co.edu.uniquindio.tPublico.entidades;


import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

import java.util.List;

@Entity
public class Empresa implements Serializable{
    @Id
    private Integer codigo;

    @ElementCollection
    private List<String> telefonos;

    private String direccion;





}
