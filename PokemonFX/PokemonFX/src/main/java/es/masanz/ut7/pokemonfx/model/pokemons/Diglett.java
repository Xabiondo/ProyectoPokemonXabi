package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Tierra;

public class Diglett extends Pokemon implements Tierra {

    public Diglett(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 26;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Dugtrio dugtrio = new Dugtrio(this.nivel);
        dugtrio.setApodo(this.getApodo());
        dugtrio.setHpIV(this.getHpIV());
        dugtrio.setAtaqueIV(this.getAtaqueIV());
        dugtrio.setDefensaIV(this.getDefensaIV());
        dugtrio.setVelocidadIV(this.getVelocidadIV());
        dugtrio.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        dugtrio.setDefensaEspecialIV(this.getDefensaEspecialIV());
        dugtrio.setPuntosExp(this.getPuntosExp());

        float hpPercentage = (float) this.getHpActual() / this.getMaxHP();
        dugtrio.setHpActual((int) (dugtrio.getMaxHP() * hpPercentage));

        return dugtrio;
    }

    @Override
    protected void asignarAtaques() {
        Ataque aranazo = new Ataque("arañazo", 40, 100, Tipo.NORMAL, false, 35);
        asignarAtaque(aranazo.getNombre(), aranazo);

        Ataque tierraViva = new Ataque("tierra viva", 50, 100, Tipo.TIERRA, true, 10);
        asignarAtaque(tierraViva.getNombre(), tierraViva);
    }
}