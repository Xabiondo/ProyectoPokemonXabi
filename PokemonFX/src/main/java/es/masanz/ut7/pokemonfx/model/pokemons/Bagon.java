package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Dragon;

public class Bagon extends Pokemon implements Dragon {

    public Bagon(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 30;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Shelgon shelgon = new Shelgon(this.nivel);
        shelgon.setApodo(this.getApodo());
        shelgon.setHpIV(this.getHpIV());
        shelgon.setAtaqueIV(this.getAtaqueIV());
        shelgon.setDefensaIV(this.getDefensaIV());
        shelgon.setVelocidadIV(this.getVelocidadIV());
        shelgon.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        shelgon.setDefensaEspecialIV(this.getDefensaEspecialIV());
        shelgon.setPuntosExp(this.getPuntosExp());
        shelgon.setHpIV(getMaxHP());
        return shelgon;
    }

    @Override
    protected void asignarAtaques() {
        asignarAtaque("cabezazo", new Ataque("cabezazo", 70, 100, Tipo.NORMAL, false, 15));
        asignarAtaque("coladragón", new Ataque("coladragón", 60, 90, Tipo.DRAGON, false, 10));
        asignarAtaque("enfado", new Ataque("enfado", 120, 100, Tipo.DRAGON, false, 10));
        asignarAtaque("pulso dragón", new Ataque("pulso dragón", 85, 100, Tipo.DRAGON, true, 10));
    }
}
