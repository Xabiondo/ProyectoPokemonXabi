package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Psiquico;

public class Mewtwo extends Pokemon implements Psiquico {

    public Mewtwo(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1; // No evoluciona
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {
        Ataque confusion = new Ataque("confusión", 50, 100, Tipo.PSIQUICO, true, 25);
        asignarAtaque(confusion.getNombre(), confusion);

        Ataque psicoonda = new Ataque("psicoonda", 65, 90, Tipo.PSIQUICO, true, 20);
        asignarAtaque(psicoonda.getNombre(), psicoonda);

        Ataque psicocorte = new Ataque("psicocorte", 70, 100, Tipo.PSIQUICO, false, 20);
        asignarAtaque(psicocorte.getNombre(), psicocorte);

        Ataque bolaSombra = new Ataque("bola sombra", 80, 100, Tipo.FANTASMA, true, 15);
        asignarAtaque(bolaSombra.getNombre(), bolaSombra);

        Ataque psíquico = new Ataque("psíquico", 90, 100, Tipo.PSIQUICO, true, 10);
        asignarAtaque(psíquico.getNombre(), psíquico);
    }
}
