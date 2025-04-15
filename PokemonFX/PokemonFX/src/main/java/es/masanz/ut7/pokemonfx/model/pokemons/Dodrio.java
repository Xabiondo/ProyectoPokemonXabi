package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Normal;
import es.masanz.ut7.pokemonfx.model.type.Volador;

public class Dodrio extends Pokemon implements Normal, Volador {

    public Dodrio(int nivel) {
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
        Ataque picoDrill = new Ataque("pico drill", 80, 100, Tipo.VOLADOR, false, 20);
        asignarAtaque(picoDrill.getNombre(), picoDrill);

        Ataque tornado = new Ataque("tornado", 60, 100, Tipo.VOLADOR, true, 20);
        asignarAtaque(tornado.getNombre(), tornado);

        Ataque agilidad = new Ataque("agilidad", 0, 100, Tipo.NORMAL, true, 30);
        asignarAtaque(agilidad.getNombre(), agilidad);
    }
}