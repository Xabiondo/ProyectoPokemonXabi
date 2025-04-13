package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Veneno;
import es.masanz.ut7.pokemonfx.model.type.Tierra;

public class Nidoking extends Pokemon implements Veneno, Tierra {

    public Nidoking(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1; // No evoluciona más
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null; // No tiene evolución
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Cornada
        Ataque cornada = new Ataque("cornada", 65, 100, Tipo.NORMAL, false, 25);
        asignarAtaque(cornada.getNombre(), cornada);

        // Nivel 8: Doble patada
        Ataque doblePatada = new Ataque("doble patada", 30, 100, Tipo.LUCHA, false, 30);
        asignarAtaque(doblePatada.getNombre(), doblePatada);

        // Nivel 15: Puya nociva
        Ataque puyaNociva = new Ataque("puya nociva", 80, 100, Tipo.VENENO, false, 20);
        asignarAtaque(puyaNociva.getNombre(), puyaNociva);

        // Nivel 22: Terremoto
        Ataque terremoto = new Ataque("terremoto", 100, 100, Tipo.TIERRA, false, 10);
        asignarAtaque(terremoto.getNombre(), terremoto);

        // Nivel 30: Cuchillada
        Ataque cuchillada = new Ataque("cuchillada", 70, 100, Tipo.NORMAL, false, 20);
        asignarAtaque(cuchillada.getNombre(), cuchillada);

        // Nivel 40: Megacuerno
        Ataque megacuerno = new Ataque("megacuerno", 120, 85, Tipo.BICHO, false, 5);
        asignarAtaque(megacuerno.getNombre(), megacuerno);

        // Nivel 50: Ventisca
        Ataque ventisca = new Ataque("ventisca", 110, 70, Tipo.HIELO, true, 5);
        asignarAtaque(ventisca.getNombre(), ventisca);
    }
}
