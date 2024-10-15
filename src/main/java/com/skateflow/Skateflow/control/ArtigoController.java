package com.skateflow.Skateflow.control;

import com.skateflow.Skateflow.model.Artigo;
import com.skateflow.Skateflow.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artigos")
public class ArtigoController {

    @Autowired
    private ArtigoRepository artigoRepository;

    // Listar todos os artigos
    @GetMapping
    public List<Artigo> listarArtigos() {
        return artigoRepository.findAll();
    }

    // Criar um novo artigo
    @PostMapping
    public Artigo criarArtigo(@RequestBody Artigo artigo) {
        return artigoRepository.save(artigo);
    }

    // Exibir um artigo pelo ID
    @GetMapping("/{id}")
    public Artigo exibirArtigo(@PathVariable Long id) {
        return artigoRepository.findById(id).orElseThrow(() -> new RuntimeException("Artigo não encontrado"));
    }
}
