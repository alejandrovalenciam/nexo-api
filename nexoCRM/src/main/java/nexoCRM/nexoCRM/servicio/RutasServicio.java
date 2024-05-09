package nexoCRM.nexoCRM.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexoCRM.nexoCRM.modelo.Rutas;
import nexoCRM.nexoCRM.repositorio.RutasRepositorio;

@Service
public class RutasServicio {
    @Autowired
    private RutasRepositorio rutasRepositorio;

    public List<Rutas> mostrarRutas(){
        return (List<Rutas>) rutasRepositorio.findAll();
    }

    public Optional<Rutas> mostrarPorId(Integer id){
        return rutasRepositorio.findById(id);
    }

    public Rutas agregarRuta(Rutas ruta){
        return rutasRepositorio.save(ruta);
    }

    public boolean eliminarPorId(Integer id){
        try {
            rutasRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
