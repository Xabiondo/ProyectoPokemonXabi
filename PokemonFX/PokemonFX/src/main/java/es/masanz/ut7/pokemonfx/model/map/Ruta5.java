package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.*;

import java.util.ArrayList;

public class Ruta5 extends Mapa {

    @Override
    protected void cargarPokemonSalvajes() {

    }
    //Enn este mapa no hay evidentemente

    @Override
    protected void cargarMapa() {

        this.nombre = "Casa";

        int[][] mapaRuta = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        this.inicioX = 6;
        this.inicioY = 7;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        Entrenador entrenador = new Entrenador();
        NPC npc1 = new NPC(5, 0, 0, entrenador);
        entrenador.incluirPokemonParaCombatir(0, new Arcanine(15));
        entrenador.incluirPokemonParaCombatir(1 , new Gyarados(36));
        entrenador.incluirPokemonParaCombatir(2 , new Dewgong(33));
        entrenador.incluirPokemonParaCombatir(3 , new Mewtwo(40));
        entrenador.incluirPokemonParaCombatir(4 , new Wartortle(36));
        entrenador.incluirPokemonParaCombatir(5 , new Venusaur(36));
        npcs.add(npc1);

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        mapData[y][x] = TileType.SUELO_MADERA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                }
            }
        }
    }
}
