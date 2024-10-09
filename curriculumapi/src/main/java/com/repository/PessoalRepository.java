package com.curriculumapi.repository;

import com.curriculumapi.model.Pessoal; // Importar o modelo Pessoal
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoalRepository extends JpaRepository<Pessoal, Long> {
}
