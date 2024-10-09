package com.curriculumapi.repository;

import com.curriculumapi.model.Experiencia; // Importar o modelo Experiencia
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
}
