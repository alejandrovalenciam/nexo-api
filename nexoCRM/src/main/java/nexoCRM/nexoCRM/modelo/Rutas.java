package nexoCRM.nexoCRM.modelo;

import java.io.Serializable;
import java.sql.*;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Rutas implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fecha;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:MM")
    private Time horaSalida;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:MM")
    private Time horaLlegada;

    private String puntoEntrega;

    @ManyToOne
    @JoinColumn(name = "id_mensajero")
    private Mensajeros idMensajero;
}
