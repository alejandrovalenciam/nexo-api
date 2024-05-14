package nexoCRM.nexoCRM.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import nexoCRM.nexoCRM.modelo.Clientes;
import nexoCRM.nexoCRM.servicio.ClientesServicio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClientesControlador {
    @Autowired
    private ClientesServicio clientesServicio;

    // @GetMapping("/")
    // public List<Clientes> mostrarClientes() {
    //     return clientesServicio.mostrarClientes();
    // }

    @GetMapping("")
    public List<Clientes> mostrar(@RequestParam("estado") String estado) {
        return (List<Clientes>) clientesServicio.mostrar(estado);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Clientes> mostrarPorId(@PathVariable("id") Integer id) {
        return clientesServicio.mostrarPorId(id);
    }

    @PostMapping("/agregar")
    public Clientes agregarCliente(@RequestBody Clientes cliente) {
        return clientesServicio.agregarCliente(cliente);
    }

    @PostMapping("/actualizar")
    public Clientes actualizarCliente(@RequestBody Clientes cliente) {
        return clientesServicio.agregarCliente(cliente);
    }
    
    @DeleteMapping(path = "/eliminar/{id}")
    public String eliminarPorId (@PathVariable("id") Integer id){
        boolean eliminado = clientesServicio.eliminarPorId(id);

        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
