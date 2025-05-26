package org.example.proyectofinal.Services;

import org.example.proyectofinal.Entities.Cliente;
import org.example.proyectofinal.Entities.Usuario;
import org.example.proyectofinal.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }
    public List<Cliente> findByUsuario(Usuario usuario) {return clienteRepository.findByUsuario(usuario);  }
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public Cliente deleteById(Integer id) {
        Cliente cliente = clienteRepository.findById(id).get();
        clienteRepository.delete(cliente);
        return cliente;
    }
}
