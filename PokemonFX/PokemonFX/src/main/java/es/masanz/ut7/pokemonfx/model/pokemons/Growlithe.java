package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Growlithe extends Pokemon implements Fuego {

    public Growlithe(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 25;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Arcanine arcanine = new Arcanine(this.nivel);
        arcanine.setApodo(this.getApodo());
        arcanine.setHpIV(this.getHpIV());
        arcanine.setAtaqueIV(this.getAtaqueIV());
        arcanine.setDefensaIV(this.getDefensaIV());
        arcanine.setVelocidadIV(this.getVelocidadIV());
        arcanine.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        arcanine.setDefensaEspecialIV(this.getDefensaEspecialIV());
        arcanine.setPuntosExp(this.getPuntosExp());
        arcanine.setHpIV(getMaxHP());
        return arcanine;
    }

    @Override
    protected void asignarAtaques() {
        asignarAtaque("gruñido", new Ataque("gruñido", 0, 100, Tipo.NORMAL, false, 40));
        asignarAtaque("ascuas", new Ataque("ascuas", 40, 100, Tipo.FUEGO, true, 25));
        asignarAtaque("colmillo ígneo", new Ataque("colmillo ígneo", 65, 95, Tipo.FUEGO, false, 15));
        asignarAtaque("lanzallamas", new Ataque("lanzallamas", 90, 100, Tipo.FUEGO, true, 15));
    }
}
