package nexoCRM.nexoCRM.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_envio")
    private Envios idEnvio;

    @ManyToOne
    @JoinColumn(name = "id_mensajero")
    private Mensajeros idMensajero;
}
