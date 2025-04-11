package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Totodile extends Pokemon implements Agua {

    public Totodile(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 18;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Croconaw croconaw = new Croconaw(this.nivel);
        croconaw.setApodo(this.getApodo());
        croconaw.setHpIV(this.getHpIV());
        croconaw.setAtaqueIV(this.getAtaqueIV());
        croconaw.setDefensaIV(this.getDefensaIV());
        croconaw.setVelocidadIV(this.getVelocidadIV());
        croconaw.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        croconaw.setDefensaEspecialIV(this.getDefensaEspecialIV());
        croconaw.setPuntosExp(this.getPuntosExp());
        croconaw.setHpIV(getMaxHP());
        return croconaw;
    }

    @Override
    protected void asignarAtaques() {
        asignarAtaque("pistola agua", new Ataque("pistola agua", 40, 100, Tipo.AGUA, true, 25));
        asignarAtaque("mordisco", new Ataque("mordisco", 60, 100, Tipo.SINIESTRO, false, 25));
        asignarAtaque("hidropulso", new Ataque("hidropulso", 60, 100, Tipo.AGUA, true, 20));
        asignarAtaque("acua cola", new Ataque("acua cola", 90, 90, Tipo.AGUA, false, 10));
    }
}
