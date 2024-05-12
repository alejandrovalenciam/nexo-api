package nexoCRM.nexoCRM.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexoCRM.nexoCRM.modelo.Admin;
import nexoCRM.nexoCRM.repositorio.AdminRepositorio;

@Service
public class AdminServicio {
    @Autowired
    private AdminRepositorio adminRepositorio;

    public List<Admin> mostrarAdmin(){
        return (List<Admin>) adminRepositorio.findAll();
    }

    public Optional<Admin> mostrarPorId(Integer id){
        return  adminRepositorio.findById(id);
    }

    public Admin agregarAdmin(Admin admin){
        return adminRepositorio.save(admin);
    }

    public boolean eliminarPorId(Integer id){
        try {
            adminRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
