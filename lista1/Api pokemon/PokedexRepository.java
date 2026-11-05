package com.example.apirestwithspring.repositories;

import com.example.apirestwithspring.entities.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository 
public class PokedexRepository  {
     private final List<Pokemon> pokemons = new ArrayList<>();

    public List<Pokemon> listarTodos() {
        return pokemons;
    }

    public Pokemon salvar(Pokemon pokemon) {
        pokemons.add(pokemon);
        return pokemon;
    }

    public Pokemon atualizar(Integer id, Pokemon pokemon) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).id().equals(id)) {
                Pokemon atualizado = new Pokemon(id, pokemon.name(), pokemon.height());
                pokemons.set(i, atualizado);
                return atualizado;
            }
        }

        return null;
    }
    public boolean excluir(Integer id) {
        return pokemons.removeIf(pokemon -> pokemon.id().equals(id));
    }
}
