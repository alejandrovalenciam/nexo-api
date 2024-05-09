package nexoCRM.nexoCRM.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexoCRM.nexoCRM.modelo.Mensajeros;
import nexoCRM.nexoCRM.repositorio.MensajerosRepositorio;

@Service
public class MensajerosServicio {
    @Autowired
    private MensajerosRepositorio mensajerosRepositorio;

    public List<Mensajeros> mostrarMensajeros(){
        return (List<Mensajeros>) mensajerosRepositorio.findAll();
    }

    public Optional<Mensajeros> mostrarPorId(Integer id){
        return mensajerosRepositorio.findById(id);
    }

    public Mensajeros agregarMensajero(Mensajeros mensajero){
        return mensajerosRepositorio.save(mensajero);
    }

    public boolean eliminarPorId(Integer id){
        try {
            mensajerosRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
