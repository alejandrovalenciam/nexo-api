package nexoCRM.nexoCRM.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nexoCRM.nexoCRM.modelo.Historial;
import nexoCRM.nexoCRM.servicio.HistorialServicio;

@RestController
@RequestMapping("/historial")
@CrossOrigin("*")
public class HistorialControlador {
    @Autowired
    private HistorialServicio historialServicio;

    @GetMapping("/")
    public List<Historial> mostrarHistorial() {
        return historialServicio.mostrarHistorial();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Historial> mostrarPorId(@PathVariable("id") Integer id) {
        return historialServicio.mostrarPorId(id);
    }

    @PostMapping("/agregar")
    public Historial agregarHistorial(@RequestBody Historial historial) {
        return historialServicio.agregarHistorial(historial);
    }

    @PostMapping("/actualizar")
    public Historial actualizarHistorial(@RequestBody Historial historial) {
        return historialServicio.agregarHistorial(historial);
    }
    
    @DeleteMapping(path = "/eliminar/{id}")
    public String eliminarPorId (@PathVariable("id") Integer id){
        boolean eliminado = historialServicio.eliminarPorId(id);

        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
