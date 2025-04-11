package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Charmeleon extends Pokemon implements Fuego {

    public Charmeleon(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 16;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Charizard charizard = new Charizard(this.nivel);
        charizard.setApodo(this.getApodo());
        charizard.setHpIV(this.getHpIV());
        charizard.setAtaqueIV(this.getAtaqueIV());
        charizard.setDefensaIV(this.getDefensaIV());
        charizard.setVelocidadIV(this.getVelocidadIV());
        charizard.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        charizard.setDefensaEspecialIV(this.getDefensaEspecialIV());
        charizard.setPuntosExp(this.getPuntosExp());

        float hpPercentage = (float) this.getHpActual() / this.getMaxHP();
        charizard.setHpActual((int) (charizard.getMaxHP() * hpPercentage));

        return charizard;
    }

    @Override
    protected void asignarAtaques() {
        Ataque aranazo = new Ataque("arañazo", 40, 100, Tipo.NORMAL, false, 35);
        asignarAtaque(aranazo.getNombre(), aranazo);

        Ataque ascuas = new Ataque("ascuas", 40, 100, Tipo.FUEGO, true, 25);
        asignarAtaque(ascuas.getNombre(), ascuas);

        Ataque colmilloIgneo = new Ataque("colmillo ígneo", 65, 95, Tipo.FUEGO, false, 15);
        asignarAtaque(colmilloIgneo.getNombre(), colmilloIgneo);
    }
}
