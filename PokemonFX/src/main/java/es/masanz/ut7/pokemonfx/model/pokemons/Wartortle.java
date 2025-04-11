package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Wartortle extends Squirtle implements Agua {
    public Wartortle(int nivel) {
        super(nivel);
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return super.pokemonAEvolucionar();
    }

    @Override
    public int nivelEvolucion() {
        return 150;
        //para que no evolucione más
    }
}
