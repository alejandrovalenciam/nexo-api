package nexoCRM.nexoCRM.modelo;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Mensajeros implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private Integer numeroDocumento;

    private String nombre;
    private String apellido;
    private String telefono;

    @Column(unique = true)
    private String correo;
    
    private String ciudadBase;

}
