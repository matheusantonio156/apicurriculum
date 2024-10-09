package com.service;

import com.curriculumapi.model.Pessoal; // Importar o modelo Pessoal
import com.curriculumapi.repository.PessoalRepository; // Importar o repositório
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoalService {

    @Autowired
    private PessoalRepository pessoalRepository;

    public Optional<Pessoal> findById(Long id) {
        return pessoalRepository.findById(id);
    }

    public void save(Pessoal pessoal) {
        pessoalRepository.save(pessoal);
    }
}
