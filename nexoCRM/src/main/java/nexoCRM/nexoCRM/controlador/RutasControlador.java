package nexoCRM.nexoCRM.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nexoCRM.nexoCRM.modelo.Rutas;
import nexoCRM.nexoCRM.servicio.RutasServicio;

@RestController
@RequestMapping("/rutas")
@CrossOrigin("*")
public class RutasControlador {
    @Autowired
    private RutasServicio rutasServicio;

    @GetMapping("/")
    public List<Rutas> mostrarRutas() {
        return rutasServicio.mostrarRutas();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Rutas> mostrarPorId(@PathVariable("id") Integer id) {
        return rutasServicio.mostrarPorId(id);
    }

    @PostMapping("/agregar")
    public Rutas agregarRuta(@RequestBody Rutas ruta) {
        return rutasServicio.agregarRuta(ruta);
    }

    @PostMapping("/actualizar")
    public Rutas actualizarRuta(@RequestBody Rutas ruta) {
        return rutasServicio.agregarRuta(ruta);
    }
    
    @DeleteMapping(path = "/eliminar/{id}")
    public String eliminarPorId (@PathVariable("id") Integer id){
        boolean eliminado = rutasServicio.eliminarPorId(id);

        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
