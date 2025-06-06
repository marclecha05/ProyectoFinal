package org.example.proyectofinal.Services;

import org.example.proyectofinal.Entities.Horario;
import org.example.proyectofinal.Repositories.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HorarioService {
    @Autowired
    private HorarioRepository horarioRepository;

    public List<Horario> findAll() {
        return horarioRepository.findAll();
    }
    public Optional<Horario> findById(Integer id) {
        return horarioRepository.findById(id);
    }
    public Horario save(Horario horario) {
        return horarioRepository.save(horario);
    }
    public Horario deleteById(Integer id) {
        Horario horario = horarioRepository.findById(id).get();
        horarioRepository.delete(horario);
        return horario;
    }
}
