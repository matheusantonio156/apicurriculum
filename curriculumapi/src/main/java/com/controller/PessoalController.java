ppackage com.controller;

import com.service.PessoalService; // Importar o serviço PessoalService
import com.curriculumapi.model.Pessoal; // Importar o modelo Pessoal
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoais")
public class PessoalController {

    private final PessoalService pessoalService; // Injetando o serviço

    // Injeção de dependência via construtor
    public PessoalController(PessoalService pessoalService) {
        this.pessoalService = pessoalService;
    }

    // Método GET
    @GetMapping("/{id}")
    public ResponseEntity<Object> getPessoal(@PathVariable Long id) {
        Object pessoal = pessoalService.findById(id); // Chama o serviço
        return ResponseEntity.ok(pessoal); // Retorna o objeto encontrado
    }

    // Método POST
    @PostMapping
    public ResponseEntity<Void> createPessoal(@RequestBody Pessoal pessoal) {
        pessoalService.save(pessoal); // Salva o objeto Pessoal
        return ResponseEntity.status(HttpStatus.CREATED).build(); // Retorna 201 Created
    }
}