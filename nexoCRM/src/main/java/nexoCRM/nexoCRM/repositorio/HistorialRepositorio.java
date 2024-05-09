package nexoCRM.nexoCRM.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexoCRM.nexoCRM.modelo.Historial;

@Repository
public interface HistorialRepositorio extends CrudRepository<Historial, Integer>{

}
