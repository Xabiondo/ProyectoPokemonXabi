package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.type.Planta;

public class Ivysaur extends Bulbasaur implements Planta {
    public Ivysaur(int nivel) {
        super(nivel);
    }
    @Override
    public int nivelEvolucion() {
        return 16;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {

        Venusaur venusaur = new Venusaur(this.nivel);
        venusaur.setApodo(this.getApodo());


        venusaur.setHpIV(this.getHpIV());
        venusaur.setAtaqueIV(this.getAtaqueIV());
        venusaur.setDefensaIV(this.getDefensaIV());
        venusaur.setVelocidadIV(this.getVelocidadIV());
        venusaur.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        venusaur.setDefensaEspecialIV(this.getDefensaEspecialIV());


        venusaur.setPuntosExp(this.getPuntosExp());

        venusaur.setHpIV(getMaxHP());


        return venusaur;



    }
}
