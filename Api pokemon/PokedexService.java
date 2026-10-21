package com.example.apirestwithspring.services;

import com.example.apirestwithspring.entities.*;
import com.example.apirestwithspring.repositories.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class PokedexService {

     private final PokedexRepository repository;

    private final RestClient client = RestClient.create(
            "https://pokeapi.co/api/v2"
    );

    public PokedexService(PokedexRepository repository) {
        this.repository = repository;
    }

    public List<Pokemon> listarTodos() {
        return repository.listarTodos();
    }

    public Pokemon cadastrar(String nomeOuId) {
        Pokemon pokemon = client.get()
                .uri("/pokemon/{nomeOuId}", nomeOuId)
                .retrieve()
                .body(Pokemon.class);

        return repository.salvar(pokemon);
    }

    public Pokemon atualizar(Integer id, Pokemon pokemon) {
        return repository.atualizar(id, pokemon);
    }

    public boolean excluir(Integer id) {
        return repository.excluir(id);
    }
}
