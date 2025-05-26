package org.example.proyectofinal.Controllers;

import org.example.proyectofinal.Entities.Proveedor;
import org.example.proyectofinal.Services.ProveedorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProveedorController {
    private final ProveedorService proveedorService;
    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }
    @GetMapping("/proveedores")
    List<Proveedor> findAll() {
        return proveedorService.findAll();
    }

}
