package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;
import es.masanz.ut7.pokemonfx.model.pokemons.Charmander;
import es.masanz.ut7.pokemonfx.model.pokemons.Squirtle;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.*;

public class Ruta4 extends Mapa {

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
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1},
                {1, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 3, 3, 2, 1, 3, 3, 1},
                {1, 3, 4, 3, 3, 2, 2, 2, 2, 0, 0, 2, 2, 3, 2, 2, 3, 4, 1},
                {1, 3, 3, 2, 2, 2, 10, 7, 7, 0, 0, 0, 2, 2, 2, 2, 2, 3, 1},
                {1, 2, 2, 2, 10, 7, 13, 6, 6, 6, 0, 0, 0, 2, 2, 4, 2, 2, 1},
                {1, 2, 4, 2, 8, 6, 6, 6, 15, 15, 15, 0, 0, 0, 2, 2, 2, 3, 1},
                {1, 2, 2, 2, 8, 6, 15, 15, 15, 15, 15, 15, 0, 0, 0, 2, 3, 3, 1},
                {1, 3, 2, 2, 8, 6, 15, 6, 6, 6, 6, 15, 15, 0, 0, 2, 3, 4, 1},
                {1, 3, 4, 2, 9, 15, 15, 6, 6, 6, 6, 6, 15, 15, 0, 0, 3, 3, 1},
                {1, 3, 3, 2, 2, 9, 15, 6, 12, 16, 16, 13, 6, 15, 0, 0, 0, 2, 1},
                {1, 2, 2, 2, 2, 2, 9, 12, 17, 6, 6, 16, 13, 15, 15, 0, 0, 2, 1},
                {1, 2, 4, 2, 2, 2, 2, 12, 6, 6, 6, 6, 16, 13, 15, 0, 0, 2, 1},
                {1, 2, 2, 2, 3, 2, 2, 12, 6, 6, 6, 6, 6, 16, 13, 0, 0, 2, 1},
                {1, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        this.inicioX = 1; // Columna 1 (segunda columna)
        this.inicioY = 1; // Fila 1 (segunda fila)

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Ruta 4";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        teleportMap[0][14] = "Ruta 2";

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 0:
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 1:
                        mapData[y][x] = TileType.PARED_BLANCA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 2:
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 3:
                        mapData[y][x] = TileType.CESPED_HIERBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 4:
                        mapData[y][x] = TileType.CESPED_ARBUSTO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 5:
                        mapData[y][x] = TileType.TELEPORT_RED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 6:
                        mapData[y][x] = TileType.AGUAGRANDE.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 7:
                        mapData[y][x] = TileType.MONTE_BORDE_SUPERIOR.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        mapData[y][x] = TileType.MONTE_BORDE_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 9:
                        mapData[y][x] = TileType.MONTE_BORDE_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 10:
                        mapData[y][x] = TileType.MONTE_ESQUINA_SUPERIOR_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 11:
                        mapData[y][x] = TileType.MONTE_ESQUINA_SUPERIOR_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 12:
                        mapData[y][x] = TileType.AGUA_ROCA_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 13:
                        mapData[y][x] = TileType.AGUA_ROCA_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 15:
                        mapData[y][x] = TileType.MONTE_CENTRO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 16:
                        mapData[y][x] = TileType.AGUA_ROCA_ARRIBA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 17:
                        mapData[y][x] = TileType.MONTE_ESQUINA_INFERIOR_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                }
            }
        }
    }
}