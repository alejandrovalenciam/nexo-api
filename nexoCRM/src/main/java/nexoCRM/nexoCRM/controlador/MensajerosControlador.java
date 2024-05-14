package nexoCRM.nexoCRM.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nexoCRM.nexoCRM.modelo.Mensajeros;
import nexoCRM.nexoCRM.servicio.MensajerosServicio;

@RestController
@RequestMapping("/mensajeros")
@CrossOrigin("*")
public class MensajerosControlador {
    @Autowired
    private MensajerosServicio mensajerosServicio;

    @GetMapping("/")
    public List<Mensajeros> mostrarMensajeros() {
        return mensajerosServicio.mostrarMensajeros();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Mensajeros> mostrarPorId(@PathVariable("id") Integer id) {
        return mensajerosServicio.mostrarPorId(id);
    }

    @PostMapping("/agregar")
    public Mensajeros agregarMensajero(@RequestBody Mensajeros envio) {
        return mensajerosServicio.agregarMensajero(envio);
    }

    @PostMapping("/actualizar")
    public Mensajeros actualizarMensajero(@RequestBody Mensajeros envio) {
        return mensajerosServicio.agregarMensajero(envio);
    }
    
    @DeleteMapping(path = "/eliminar/{id}")
    public String eliminarPorId (@PathVariable("id") Integer id){
        boolean eliminado = mensajerosServicio.eliminarPorId(id);

        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
