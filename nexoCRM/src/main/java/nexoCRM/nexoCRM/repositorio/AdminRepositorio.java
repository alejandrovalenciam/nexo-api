package nexoCRM.nexoCRM.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexoCRM.nexoCRM.modelo.Admin;

@Repository
public interface AdminRepositorio extends CrudRepository<Admin, Integer>{

}
