package org.example.proyectofinal.Controllers;

import org.example.proyectofinal.Entities.Horario;
import org.example.proyectofinal.Entities.Proveedor;
import org.example.proyectofinal.Repositories.HorarioRepository;
import org.example.proyectofinal.Repositories.ProveedorRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Map;

@Controller // Usa @Controller para redirecciones
@RequestMapping("/registrotresForm") // Asegúrate de que coincida con la acción del formulario
public class RegistertresController {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Autowired
    private HorarioRepository horarioRepository;

    @PostMapping
    public void registrarHorarios(
            @RequestParam Map<String, String> allParams,
            HttpServletResponse response,
            HttpSession session) throws IOException {

        Integer proveedorId = (Integer) session.getAttribute("proveedorId");
        Proveedor proveedor = proveedorRepository.findById(proveedorId)
                .orElseThrow(() -> new RuntimeException("Proveedor no encontrado"));

        // Usa los mismos nombres que en el HTML (sin acentos para consistencia)
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        for (String dia : dias) {
            Horario horario = new Horario();
            horario.setDiaSemana(dia.substring(0, 1).toUpperCase() + dia.substring(1)); // Capitaliza la primera letra
            horario.setAperturaManana(allParams.get(dia + "AperturaManana"));
            horario.setCierreManana(allParams.get(dia + "CierreManana"));
            horario.setAperturaTarde(allParams.get(dia + "AperturaTarde"));
            horario.setCierreTarde(allParams.get(dia + "CierreTarde"));
            horario.setProveedor(proveedor);
            horarioRepository.save(horario);
        }

        response.sendRedirect("/calendarioProveedor.html");
    }
}