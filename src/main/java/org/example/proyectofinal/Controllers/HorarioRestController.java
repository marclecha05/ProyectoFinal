package org.example.proyectofinal.Controllers;

import jakarta.servlet.http.HttpSession;
import org.example.proyectofinal.Entities.Horario;
import org.example.proyectofinal.Repositories.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Nuevo controlador REST
@RestController
@RequestMapping("/api/horarios")
public class HorarioRestController {

    @Autowired
    private HorarioRepository horarioRepository;

    @GetMapping("/proveedor")
    public List<Horario> obtenerHorarios(HttpSession session) {
        Integer proveedorId = (Integer) session.getAttribute("proveedorId");
        return horarioRepository.findByProveedor_Id(proveedorId);
    }
}
