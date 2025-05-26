package org.example.proyectofinal.Repositories;

import org.example.proyectofinal.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, String> {
    Usuario findByEmail(String email);
    Usuario findByUsername(String username);
}
