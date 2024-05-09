package nexoCRM.nexoCRM.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nexoCRM.nexoCRM.modelo.Envios;
import nexoCRM.nexoCRM.servicio.EnviosServicio;

@RestController
@RequestMapping("/envios")
public class EnviosControlador {
    @Autowired
    private EnviosServicio enviosServicio;

    @GetMapping("/")
    public List<Envios> mostrarEnvios() {
        return enviosServicio.mostrarEnvios();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Envios> mostrarPorId(@PathVariable("id") Integer id) {
        return enviosServicio.mostrarPorId(id);
    }

    @PostMapping("/agregar")
    public Envios agregarEnvio(@RequestBody Envios envio) {
        return enviosServicio.agregarEnvio(envio);
    }

    @PostMapping("/actualizar")
    public Envios actualizarEnvio(@RequestBody Envios envio) {
        return enviosServicio.agregarEnvio(envio);
    }
    
    @DeleteMapping(path = "/eliminar/{id}")
    public String eliminarPorId (@PathVariable("id") Integer id){
        boolean eliminado = enviosServicio.eliminarPorId(id);

        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
