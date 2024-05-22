package nexoCRM.nexoCRM.modelo;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Envios implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fechaEnvio;
    private String tipoEnvio;
    private String estado;
    private Date fechaEntrega;
    private String detalles;
    private String direccion;
    private String destino;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes idCliente;
}
