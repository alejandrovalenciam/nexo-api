package nexoCRM.nexoCRM.modelo;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Clientes implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer numeroDocumento;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String pais;
    private String telefono;

    @Column(unique = true)
    private String correo;

    private String estado;
}
