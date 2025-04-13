package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;
import es.masanz.ut7.pokemonfx.model.type.Volador;

public class Gyarados extends Pokemon implements Agua, Volador {

    public Gyarados(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1; // Evoluciona desde Magikarp, no más allá
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {
        Ataque mordisco = new Ataque("mordisco", 60, 100, Tipo.SINIESTRO, false, 25);
        asignarAtaque(mordisco.getNombre(), mordisco);

        Ataque hidrobomba = new Ataque("hidrobomba", 110, 80, Tipo.AGUA, true, 5);
        asignarAtaque(hidrobomba.getNombre(), hidrobomba);

        Ataque vuelo = new Ataque("vuelo", 90, 95, Tipo.VOLADOR, false, 15);
        asignarAtaque(vuelo.getNombre(), vuelo);

        Ataque acuaCola = new Ataque("aqua cola", 90, 90, Tipo.AGUA, false, 10);
        asignarAtaque(acuaCola.getNombre(), acuaCola);

        Ataque hiperrayo = new Ataque("hiperrayo", 150, 90, Tipo.NORMAL, true, 5);
        asignarAtaque(hiperrayo.getNombre(), hiperrayo);
    }
}
