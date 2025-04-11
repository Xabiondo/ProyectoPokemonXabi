package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Croconaw extends Pokemon implements Agua {

    public Croconaw(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 0; // No evoluciona más aquí
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {
        asignarAtaque("hidropulso", new Ataque("hidropulso", 60, 100, Tipo.AGUA, true, 20));
        asignarAtaque("mordisco", new Ataque("mordisco", 60, 100, Tipo.SINIESTRO, false, 25));
        asignarAtaque("acua cola", new Ataque("acua cola", 90, 90, Tipo.AGUA, false, 10));
        asignarAtaque("rompe moldes", new Ataque("rompe moldes", 70, 95, Tipo.NORMAL, false, 15));
    }
}
