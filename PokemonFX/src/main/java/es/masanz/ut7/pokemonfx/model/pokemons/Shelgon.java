package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Dragon;

public class Shelgon extends Pokemon implements Dragon {

    public Shelgon(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 0; // Detenemos evolución
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {
        asignarAtaque("cabezazo", new Ataque("cabezazo", 70, 100, Tipo.NORMAL, false, 15));
        asignarAtaque("pulso dragón", new Ataque("pulso dragón", 85, 100, Tipo.DRAGON, true, 10));
        asignarAtaque("envite draco", new Ataque("envite draco", 120, 100, Tipo.DRAGON, false, 5));
        asignarAtaque("golpe cuerpo", new Ataque("golpe cuerpo", 85, 100, Tipo.NORMAL, false, 15));
    }
}
