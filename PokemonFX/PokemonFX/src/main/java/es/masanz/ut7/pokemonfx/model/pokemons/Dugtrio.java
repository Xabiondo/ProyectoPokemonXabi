package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Tierra;

public class Dugtrio extends Pokemon implements Tierra {

    public Dugtrio(int nivel) {
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
        Ataque aranazo = new Ataque("arañazo", 40, 100, Tipo.NORMAL, false, 35);
        asignarAtaque(aranazo.getNombre(), aranazo);

        Ataque tierraViva = new Ataque("tierra viva", 50, 100, Tipo.TIERRA, true, 10);
        asignarAtaque(tierraViva.getNombre(), tierraViva);

        Ataque excavacion = new Ataque("excavación", 80, 100, Tipo.TIERRA, false, 10);
        asignarAtaque(excavacion.getNombre(), excavacion);

        Ataque terremoto = new Ataque("terremoto", 100, 100, Tipo.TIERRA, true, 10);
        asignarAtaque(terremoto.getNombre(), terremoto);
    }
}