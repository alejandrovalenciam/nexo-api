package nexoCRM.nexoCRM.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexoCRM.nexoCRM.modelo.Envios;

@Repository
public interface EnviosRepositorio extends CrudRepository<Envios, Integer>{

}
