package nexoCRM.nexoCRM.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexoCRM.nexoCRM.modelo.Rutas;

@Repository
public interface RutasRepositorio extends CrudRepository<Rutas, Integer>{

}
