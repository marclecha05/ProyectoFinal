package org.example.proyectofinal.Repositories;

import org.example.proyectofinal.Entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {
    List<Horario> findByProveedor_Id(Integer proveedorId);

}
