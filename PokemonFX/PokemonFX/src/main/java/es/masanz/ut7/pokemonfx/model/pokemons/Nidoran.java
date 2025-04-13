package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Veneno;

public class Nidoran extends Pokemon implements Veneno {

    public Nidoran(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 16;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Nidorino nidorino = new Nidorino(this.nivel);
        nidorino.setApodo(this.getApodo());
        nidorino.setHpIV(this.getHpIV());
        nidorino.setAtaqueIV(this.getAtaqueIV());
        nidorino.setDefensaIV(this.getDefensaIV());
        nidorino.setVelocidadIV(this.getVelocidadIV());
        nidorino.setAtaqueEspecialIV(this.getAtaqueEspecialIV());
        nidorino.setDefensaEspecialIV(this.getDefensaEspecialIV());
        nidorino.setPuntosExp(this.getPuntosExp());
        float hpPercentage = (float) this.getHpActual() / this.getMaxHP();
        nidorino.setHpActual((int) (nidorino.getMaxHP() * hpPercentage));

        return nidorino;
    }

    @Override
    protected void asignarAtaques() {
        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
        asignarAtaque(placaje.getNombre(), placaje);

        Ataque picotazoVeneno = new Ataque("picotazo veneno", 50, 100, Tipo.VENENO, false, 25);
        asignarAtaque(picotazoVeneno.getNombre(), picotazoVeneno);

        Ataque dobleAtaque = new Ataque("doble ataque", 35, 90, Tipo.NORMAL, false, 20);
        asignarAtaque(dobleAtaque.getNombre(), dobleAtaque);

        Ataque colmilloVeneno = new Ataque("colmillo veneno", 70, 100, Tipo.VENENO, false, 15);
        asignarAtaque(colmilloVeneno.getNombre(), colmilloVeneno);
    }
}
