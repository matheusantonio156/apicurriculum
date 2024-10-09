package com.service;

import com.curriculumapi.model.Experiencia; // Importar o modelo Experiencia
import com.curriculumapi.repository.ExperienciaRepository; // Importar o repositório
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public Optional<Experiencia> findById(Long id) {
        return experienciaRepository.findById(id);
    }

    public void save(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }
}
