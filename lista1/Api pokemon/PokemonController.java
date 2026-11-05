package com.example.apirestwithspring.controllers;

import com.example.apirestwithspring.entities.*;
import com.example.apirestwithspring.services.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    private final PokedexService service;

    public PokemonController(PokedexService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pokemon> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pokemon cadastrar(
            @RequestParam("nomeOuId") String nomeOuId
    ) {
        return service.cadastrar(nomeOuId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pokemon> atualizar(
            @PathVariable("id") Integer id,
            @RequestBody Pokemon pokemon
    ) {
        Pokemon atualizado = service.atualizar(id, pokemon);

        if (atualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(
            @PathVariable("id") Integer id
    ) {
        if (service.excluir(id)) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
