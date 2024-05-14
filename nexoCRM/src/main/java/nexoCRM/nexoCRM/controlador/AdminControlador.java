package nexoCRM.nexoCRM.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nexoCRM.nexoCRM.modelo.Admin;
import nexoCRM.nexoCRM.servicio.AdminServicio;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminControlador {
    @Autowired
    private AdminServicio adminServicio;

    @GetMapping("/")
    public List<Admin> mostrarAdmin() {
        return adminServicio.mostrarAdmin();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Admin> mostrarPorId(@PathVariable("id") Integer id){
        return  adminServicio.mostrarPorId(id);
    }

    @PostMapping("/agregar")
    public Admin agregarAdmin(@RequestBody Admin admin){
        return adminServicio.agregarAdmin(admin);
    }

    @PostMapping("/actualizar")
    public Admin actualizarAdmin(@RequestBody Admin admin){
        return adminServicio.agregarAdmin(admin);
    }

    @DeleteMapping(path = "eliminar/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean eliminado = adminServicio.eliminarPorId(id);

        if (eliminado) {
            return "Registro eliminado";
        }
        else{
            return "Registro no eliminado";
        }
    }
}
