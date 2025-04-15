package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;
import es.masanz.ut7.pokemonfx.model.type.Hielo;

public class Dewgong extends Pokemon implements Agua, Hielo {

    public Dewgong(int nivel) {
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
        Ataque rayoHielo = new Ataque("rayo hielo", 90, 100, Tipo.HIELO, true, 10);
        asignarAtaque(rayoHielo.getNombre(), rayoHielo);

        Ataque hidrobomba = new Ataque("hidrobomba", 110, 80, Tipo.AGUA, false, 5);
        asignarAtaque(hidrobomba.getNombre(), hidrobomba);

        Ataque colmilloHielo = new Ataque("colmillo hielo", 65, 95, Tipo.HIELO, false, 15);
        asignarAtaque(colmilloHielo.getNombre(), colmilloHielo);
    }
}