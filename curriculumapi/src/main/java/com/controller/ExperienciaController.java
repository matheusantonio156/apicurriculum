package com.controller;

import com.service.ExperienciaService; // Importar o serviço ExperienciaService
import com.curriculumapi.model.Experiencia; // Importar o modelo Experiencia
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experiencias")
public class ExperienciaController {

    private final ExperienciaService experienciaService; // Injetando o serviço

    // Injeção de dependência via construtor
    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    // Método GET
    @GetMapping("/{id}")
    public ResponseEntity<Object> getExperiencia(@PathVariable Long id) {
        Object experiencia = experienciaService.findById(id); // Chama o serviço
        return ResponseEntity.ok(experiencia); // Retorna o objeto encontrado
    }

    // Método POST
    @PostMapping
    public ResponseEntity<Void> createExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.save(experiencia); // Salva a experiência
        return ResponseEntity.status(HttpStatus.CREATED).build(); // Retorna 201 Created
    }
}
