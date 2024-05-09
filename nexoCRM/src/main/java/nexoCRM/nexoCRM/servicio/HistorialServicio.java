package nexoCRM.nexoCRM.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexoCRM.nexoCRM.modelo.Historial;
import nexoCRM.nexoCRM.repositorio.HistorialRepositorio;

@Service
public class HistorialServicio {
    @Autowired
    private HistorialRepositorio historialRepositorio;

    public List<Historial> mostrarHistorial(){
        return (List<Historial>) historialRepositorio.findAll();
    }

    public Optional<Historial> mostrarPorId(Integer id){
        return historialRepositorio.findById(id);
    }

    public Historial agregarHistorial(Historial historial){
        return historialRepositorio.save(historial);
    }

    public boolean eliminarPorId(Integer id){
        try {
            historialRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
