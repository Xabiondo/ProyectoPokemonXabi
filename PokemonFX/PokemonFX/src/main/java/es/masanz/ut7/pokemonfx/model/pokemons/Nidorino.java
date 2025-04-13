package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Veneno;

public class Nidorino extends Pokemon implements Veneno {

    public Nidorino(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 16;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {

        Nidoking nidoking = new Nidoking(this.nivel);
        nidoking.setApodo(this.getApodo());
        nidoking.setHpIV(this.getHpIV());
        nidoking.setAtaqueIV(this.getAtaqueIV());
        nidoking.setDefensaIV(this.getDefensaIV());
        nidoking.setVelocidadIV(this.getVelocidadIV());
        nidoking.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        nidoking.setDefensaEspecialIV(this.getDefensaEspecialIV());
        nidoking.setPuntosExp(this.getPuntosExp());
        float hpPercentage = (float) this.getHpActual() / this.getMaxHP();
        nidoking.setHpActual((int) (nidoking.getMaxHP() * hpPercentage));

        return nidoking;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Gruñido
        Ataque grunido = new Ataque("gruñido", 0, 100, Tipo.NORMAL, true, 40);
        asignarAtaque(grunido.getNombre(), grunido);

        // Nivel 5: Picotazo venenoso
        Ataque picotazoVenenoso = new Ataque("picotazo venenoso", 15, 100, Tipo.VENENO, false, 35);
        asignarAtaque(picotazoVenenoso.getNombre(), picotazoVenenoso);

        // Nivel 12: Cornada
        Ataque cornada = new Ataque("cornada", 65, 100, Tipo.NORMAL, false, 25);
        asignarAtaque(cornada.getNombre(), cornada);

        // Nivel 20: Golpe cuerpo
        Ataque golpeCuerpo = new Ataque("golpe cuerpo", 85, 100, Tipo.NORMAL, false, 15);
        asignarAtaque(golpeCuerpo.getNombre(), golpeCuerpo);

        // Nivel 30: Doble patada
        Ataque doblePatada = new Ataque("doble patada", 30, 100, Tipo.LUCHA, false, 30);
        asignarAtaque(doblePatada.getNombre(), doblePatada);

        // Nivel 37: Puya nociva
        Ataque puyaNociva = new Ataque("puya nociva", 80, 100, Tipo.VENENO, false, 20);
        asignarAtaque(puyaNociva.getNombre(), puyaNociva);
    }
}
