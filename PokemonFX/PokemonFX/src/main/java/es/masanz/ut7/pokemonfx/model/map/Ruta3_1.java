package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.*;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.*;

public class Ruta3_1 extends Mapa {

    @Override
    protected void cargarPokemonSalvajes() {
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Bulbasaur(5));
        pokemonSalvajes.add(new Squirtle(6));
        pokemonSalvajes.add(new Charmander(7));
    }

    @Override
    protected void cargarMapa() {

        int[][] mapaRuta = {
                {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                {0, 0, 0, 4, 4, 4, 4, 4, 4, 4 ,4 , 8, 8, 8, 8, 8, 8, 8, 8},
                {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 7, 7, 7, 7, 7, 7, 7, 7},
                {4, 4, 0, 0, 4, 4, 4, 4, 4,4 , 4, 4, 4, 4, 4, 4, 4, 4, 4},
                {4, 4, 0, 0, 4, 4, 4, 4, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4},
                {4, 4, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4},
                {4, 4, 4, 0, 0, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 5},
                {4, 4, 4, 4, 0, 0, 0, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
                {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}
        };

        this.inicioX = 1; // Columna 1 (segunda columna)
        this.inicioY = 2; // Fila 1 (segunda fila)

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Ruta 3.1";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();
        Entrenador noFunciona = new Entrenador();
        Entrenador entrenador2 = new Entrenador();




        noFunciona.incluirPokemonParaCombatir(1 , new Mewtwo(12));
        noFunciona.incluirPokemonParaCombatir(2 , new Nidorino(22));
        entrenador2.incluirPokemonParaCombatir(1 , new Venusaur(32));
        entrenador2.incluirPokemonParaCombatir(2 , new Charmeleon(22));
        NPC npc1 = new NPC(3 , 5 , 4 , noFunciona);
        NPC npc2 = new NPC(10 , 7 , 1 , entrenador2);
        npcs.add(npc1);
        npcs.add(npc2);




        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 2:
                        mapData[y][x] = TileType.PARED_BLANCA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 3:
                        mapData[y][x] = TileType.CESPED_ARBUSTO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 4:
                        mapData[y][x] = TileType.CESPED_HIERBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 5:
                        mapData[y][x] = TileType.TELEPORT_RED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Ruta 4";
                        break;
                    case 6:
                        mapData[y][x] = TileType.AGUAGRANDE.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 7:
                        mapData[y][x] = TileType.ARBOL_PARTE_ABAJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        mapData[y][x] = TileType.ARBOL_PARTE_ARRIBA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;

                    case 13:
                        mapData[y][x] = TileType.AGUA_ROCA_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;

                    case 12:
                        mapData[y][x] = TileType.AGUA_ROCA_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;


                    case 14:
                        mapData[y][x] = TileType.AGUA_ROCA_ARRIBA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    default:
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                }
            }
        }
    }
}