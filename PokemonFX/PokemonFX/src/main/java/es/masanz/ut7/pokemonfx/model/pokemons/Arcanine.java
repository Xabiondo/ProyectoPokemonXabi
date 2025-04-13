package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Arcanine extends Pokemon implements Fuego {

    public Arcanine(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 0; // Ya no evoluciona
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {
        asignarAtaque("colmillo ígneo", new Ataque("colmillo ígneo", 65, 95, Tipo.FUEGO, false, 15));
        asignarAtaque("lanzallamas", new Ataque("lanzallamas", 90, 100, Tipo.FUEGO, true, 15));
        asignarAtaque("velocidad extrema", new Ataque("velocidad extrema", 80, 100, Tipo.NORMAL, false, 5));
        asignarAtaque("envite ígneo", new Ataque("envite ígneo", 120, 100, Tipo.FUEGO, false, 5));
    }
}
