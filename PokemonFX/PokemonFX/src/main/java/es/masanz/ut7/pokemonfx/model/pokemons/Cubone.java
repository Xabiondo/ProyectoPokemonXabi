package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Tierra;

public class Cubone extends Pokemon implements Tierra {

    public Cubone(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 28;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Marowak marowak = new Marowak(this.nivel);
        marowak.setApodo(this.getApodo());
        marowak.setHpIV(this.getHpIV());
        marowak.setAtaqueIV(this.getAtaqueIV());
        marowak.setDefensaIV(this.getDefensaIV());
        marowak.setVelocidadIV(this.getVelocidadIV());
        marowak.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        marowak.setDefensaEspecialIV(this.getDefensaEspecialIV());
        marowak.setPuntosExp(this.getPuntosExp());

        float hpPercentage = (float) this.getHpActual() / this.getMaxHP();
        marowak.setHpActual((int) (marowak.getMaxHP() * hpPercentage));

        return marowak;
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
    }
}