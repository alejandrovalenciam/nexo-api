package nexoCRM.nexoCRM.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexoCRM.nexoCRM.modelo.Clientes;
import nexoCRM.nexoCRM.repositorio.ClientesRepositorio;

@Service
public class ClientesServicio {
    @Autowired
    private ClientesRepositorio clientesRepositorio;

    public List<Clientes> mostrarClientes(){
        return (List<Clientes>) clientesRepositorio.findAll();
    }

    public Optional<Clientes> mostrarPorId(Integer id){
        return clientesRepositorio.findById(id);
    }

    public Clientes agregarCliente(Clientes clientes){
        return clientesRepositorio.save(clientes);
    }

    public boolean eliminarPorId(Integer id){
        try {
            clientesRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
