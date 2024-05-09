package nexoCRM.nexoCRM.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexoCRM.nexoCRM.modelo.Clientes;

@Repository
public interface ClientesRepositorio extends CrudRepository<Clientes, Integer >{

}
