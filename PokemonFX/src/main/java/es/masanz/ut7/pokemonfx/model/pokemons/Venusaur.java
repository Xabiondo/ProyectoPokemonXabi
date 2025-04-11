package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.type.Planta;

public class Venusaur extends Ivysaur implements Planta {
    public Venusaur(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1; //ya no tiene más evoluciones
    }

    @Override
    public Pokemon pokemonAEvolucionar() {

        return null;
    }
}