package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;
import es.masanz.ut7.pokemonfx.model.type.Volador;

public class Charizard extends Pokemon implements Fuego, Volador {

    public Charizard(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 100; // No evoluciona más
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {
        Ataque lanzallamas = new Ataque("lanzallamas", 95, 100, Tipo.FUEGO, true, 10);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        Ataque vuelo = new Ataque("vuelo", 90, 95, Tipo.VOLADOR, false, 15);
        asignarAtaque(vuelo.getNombre(), vuelo);

        Ataque sofoco = new Ataque("sofoco", 150, 90, Tipo.FUEGO, true, 5);
        asignarAtaque(sofoco.getNombre(), sofoco);
    }
}
