package org.example.proyectofinal.Repositories;

import org.example.proyectofinal.Entities.Cliente;
import org.example.proyectofinal.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByUsuario(Usuario usuario);
}
