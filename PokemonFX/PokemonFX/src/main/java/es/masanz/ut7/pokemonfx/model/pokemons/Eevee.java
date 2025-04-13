package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Normal;

public class Eevee extends Pokemon implements Normal {

    public Eevee(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 0; // Eevee evoluciona por objeto o amistad
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null; // No evolución automática
    }

    @Override
    protected void asignarAtaques() {
        asignarAtaque("placaje", new Ataque("placaje", 40, 100, Tipo.NORMAL, false, 35));
        asignarAtaque("rapidez", new Ataque("rapidez", 60, 100, Tipo.NORMAL, true, 20));
        asignarAtaque("mordisco", new Ataque("mordisco", 60, 100, Tipo.SINIESTRO, false, 25));
        asignarAtaque("deseo", new Ataque("deseo", 0, 100, Tipo.NORMAL, false, 10));
    }
}
