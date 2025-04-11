package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Charmander extends Pokemon implements Fuego {

    public Charmander(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 7;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Charmeleon charmeleon = new Charmeleon(this.nivel);

        charmeleon.setApodo(this.getApodo());
        charmeleon.setHpIV(this.getHpIV());
        charmeleon.setAtaqueIV(this.getAtaqueIV());
        charmeleon.setDefensaIV(this.getDefensaIV());
        charmeleon.setVelocidadIV(this.getVelocidadIV());
        charmeleon.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        charmeleon.setDefensaEspecialIV(this.getDefensaEspecialIV());
        charmeleon.setPuntosExp(this.getPuntosExp());

        float hpPercentage = (float) this.getHpActual() / this.getMaxHP();
        charmeleon.setHpActual((int) (charmeleon.getMaxHP() * hpPercentage));

        return charmeleon;
    }


    @Override
    protected void asignarAtaques() {

        Ataque aranazo = new Ataque("arañazo", 40, 100, Tipo.NORMAL, false, 35);
        asignarAtaque(aranazo.getNombre(), aranazo);

        Ataque ascuas = new Ataque("ascuas", 40, 100, Tipo.FUEGO, true, 25);
        asignarAtaque(ascuas.getNombre(), ascuas);

        Ataque lanzallamas = new Ataque("lanzallamas", 95, 100, Tipo.FUEGO, true, 10);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);
/*
        Ataque cuchillada = new Ataque("cuchillada", 70, 100, Tipo.NORMAL, false, 20);
        asignarAtaque(cuchillada.getNombre(), cuchillada);
*/
    }

}
