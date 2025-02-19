package nexoCRM.nexoCRM.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexoCRM.nexoCRM.modelo.Envios;
import nexoCRM.nexoCRM.repositorio.EnviosRepositorio;

@Service
public class EnviosServicio {
    @Autowired
    private EnviosRepositorio enviosRepositorio;

    public List<Envios> mostrarEnvios(){
        return (List<Envios>) enviosRepositorio.findAll();
    }

    public Optional<Envios> mostrarPorId(Integer id){
        return enviosRepositorio.findById(id);
    }
    
    public List<Envios> mostrarPorEstado(String estado){
        return enviosRepositorio.findByEstado(estado);
    }
    
    public List<Envios> mostrarPorDestino(String destino){
        return enviosRepositorio.findByDestino(destino);
    }

    public Envios agregarEnvio(Envios envios){
        return enviosRepositorio.save(envios);
    }

    public boolean eliminarPorId(Integer id){
        try {
            enviosRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
