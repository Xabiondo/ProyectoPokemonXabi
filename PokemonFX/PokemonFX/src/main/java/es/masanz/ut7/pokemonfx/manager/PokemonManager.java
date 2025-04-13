package es.masanz.ut7.pokemonfx.manager;

import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;

import java.util.List;

public class PokemonManager {

    // TODO 03: Hacer que, en vez de devolver un pokemon de la ruta, devuelva un clon de ese pokemon.
    public static Pokemon generarPokemonSalvaje(String ruta) {
        Pokemon pokemon = null;
        if(MapManager.mapas.containsKey(ruta)){
            List<Pokemon> pokemonSalvajes = MapManager.mapas.get(ruta).getPokemonSalvajes();
            pokemon = pokemonSalvajes.get((int) (Math.random() * pokemonSalvajes.size()));

            // Clonamos el Pokemon en para que sea igual que el original, pero sin ser el mismo
            if(pokemon != null) {
                try {
                    pokemon = (Pokemon) pokemon.clone();
                } catch (CloneNotSupportedException e) {

                    System.err.println("Error clonando el pokemon " + e.getMessage());
                }
            }
        }
        if(pokemon==null){
            pokemon = new Bulbasaur(5);
        }
        return pokemon;
    }

}