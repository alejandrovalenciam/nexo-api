package nexoCRM.nexoCRM.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexoCRM.nexoCRM.modelo.Mensajeros;

@Repository
public interface MensajerosRepositorio extends CrudRepository<Mensajeros, Integer>{

}
