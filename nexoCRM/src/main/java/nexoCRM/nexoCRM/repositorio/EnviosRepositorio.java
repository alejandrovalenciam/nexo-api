package nexoCRM.nexoCRM.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexoCRM.nexoCRM.modelo.Envios;

@Repository
public interface EnviosRepositorio extends CrudRepository<Envios, Integer>{
    public List<Envios> findByEstado(String entregado);
    public List<Envios> findByDestino(String destino);
}
