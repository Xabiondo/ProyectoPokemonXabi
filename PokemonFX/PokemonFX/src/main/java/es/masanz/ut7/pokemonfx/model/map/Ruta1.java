package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.event.EventoEjemplo;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.*;

import java.util.ArrayList;
import java.util.List;

public class Ruta1 extends Mapa {

    @Override
    protected void cargarPokemonSalvajes() {
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Mewtwo(5));
        pokemonSalvajes.add(new Growlithe(6));
        pokemonSalvajes.add(new Arcanine(7));
    }

    @Override
    protected void cargarMapa() {

        this.nombre = "Ruta 1";

        // Matriz ampliada para incluir las casas rojas en las esquinas
        int[][] mapaRuta = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 17, 17, 17, 17, 17, 17, 17, 17, 17},
                {2, 8, 8, 8, 8, 2, 2, 2, 2, 16, 16, 16, 16, 16, 16, 16, 16, 16},
                {2, 10, 10, 10, 10, 2, 2, 2, 2, 17, 17, 17, 17, 17, 17, 17, 17, 17},
                {2, 1, 15, 13, 14, 2, 2, 2, 2, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16},
                {2, 3, 12, 4, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 8, 8, 8, 8, 2, 2, 8, 8, 8, 8, 2, 2, 8, 8, 8, 8, 2},
                {2, 10, 10, 10, 10, 2, 2, 10, 10, 10, 10, 2, 2, 10, 10, 10, 10, 2},
                {2, 1, 15, 13, 14, 2, 2, 1, 15, 13, 14, 2, 2, 1, 15, 13, 14, 2},
                {2, 3, 12, 4, 5, 2, 2, 3, 12, 4, 5, 2, 2, 3, 12, 4, 5, 2},
                {18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19},
                {2, 2, 2, 2, 2, 2, 2, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17},
                {2, 2, 2, 2, 2, 2, 2, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16}
        };
        this.inicioX = 0; // Posición inicial del jugador
        this.inicioY = 10;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        // Agregar un NPC de ejemplo
        Entrenador entrenador1 = new Entrenador();
        NPC npc1 = new NPC(1, 5, 3, entrenador1); // Coordenadas: (1, 1)
        entrenador1.incluirPokemonParaCombatir(1, new Arcanine(15));
        npcs.add(npc1);

        Entrenador entrenador2 = new Entrenador();
        NPC npc2 = new NPC(5, 10, 1, entrenador2); // Coordenadas: (5, 5)
        entrenador2.incluirPokemonParaCombatir(1, new Arcanine(15));
        npcs.add(npc2);

        Entrenador entrenador3 = new Entrenador();
        NPC npc3 = new NPC(12, 9, 0, entrenador3); // Coordenadas: (9, 9)
        entrenador3.incluirPokemonParaCombatir(1, new Arcanine(15));
        npcs.add(npc3);

        Entrenador entrenador4 = new Entrenador();
        NPC npc4 = new NPC(17, 4, 0, entrenador4); // Coordenadas: (12, 12)
        entrenador4.incluirPokemonParaCombatir(1, new Arcanine(15));
        npcs.add(npc4);
        // Asignar tiles al mapa
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        mapData[y][x] = TileType.PUERTA_IZQUIERDA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 3:
                        mapData[y][x] = TileType.BASE_IZQUIERDA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 4:
                        mapData[y][x] = TileType.BASE_CENTRO_DERECHA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 5:
                        mapData[y][x] = TileType.BASE_DERECHA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 6:
                        mapData[y][x] = TileType.PARED_CENTRO_IZQUIERDA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 7:
                        mapData[y][x] = TileType.PARED_CENTRO_DERECHA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        mapData[y][x] = TileType.TEJADO_CENTRO_DERECHA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 9:
                        mapData[y][x] = TileType.BASE_IZQUIERDA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 10:
                        mapData[y][x] = TileType.PARED_IZQUIERDA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 11:
                        mapData[y][x] = TileType.TEJADO_IZQUIERDA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;

                    case 12:
                        mapData[y][x] = TileType.PUERTA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 13:
                        mapData[y][x] = TileType.VENTANA_IZQUIERDA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 14:
                        mapData[y][x] = TileType.VENTANA_DERECHA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 15:
                        mapData[y][x] = TileType.PUERTA_DERECHA_ROJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 16:
                        mapData[y][x] = TileType.ARBOL_PARTE_ABAJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 17:
                        mapData[y][x] = TileType.ARBOL_PARTE_ARRIBA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 18:
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 19:
                        mapData[y][x] = TileType.TELEPORT_RED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Ruta 2";
                        break;






                    default:
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                }
            }
        }
    }
}