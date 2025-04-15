package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Tierra;

public class Marowak extends Pokemon implements Tierra {

    public Marowak(int nivel) {
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
        Ataque huesoPalo = new Ataque("hueso palo", 65, 90, Tipo.TIERRA, false, 20);
        asignarAtaque(huesoPalo.getNombre(), huesoPalo);

        Ataque golpeCabeza = new Ataque("golpe cabeza", 70, 100, Tipo.NORMAL, false, 15);
        asignarAtaque(golpeCabeza.getNombre(), golpeCabeza);

        Ataque grunido = new Ataque("gruñido", 0, 100, Tipo.NORMAL, true, 40);
        asignarAtaque(grunido.getNombre(), grunido);

        Ataque focoEnergia = new Ataque("foco energía", 0, 100, Tipo.NORMAL, true, 30);
        asignarAtaque(focoEnergia.getNombre(), focoEnergia);

        Ataque terremoto = new Ataque("terremoto", 100, 100, Tipo.TIERRA, true, 10);
        asignarAtaque(terremoto.getNombre(), terremoto);
    }
}