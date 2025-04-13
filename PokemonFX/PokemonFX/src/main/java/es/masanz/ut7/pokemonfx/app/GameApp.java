package es.masanz.ut7.pokemonfx.app;

import es.masanz.ut7.pokemonfx.controller.MapController;
import es.masanz.ut7.pokemonfx.model.pokemons.*;
import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import javafx.application.Application;
import javafx.stage.Stage;

public class GameApp extends Application {

    // SPRITES OBTENIDOS DE (ENTRE OTROS) https://www.spriters-resource.com/game_boy_gbc/pokemongoldsilver/

    public static Entrenador jugador;

    @Override
    public void start(Stage primaryStage) {
        MapController.load(primaryStage);
    }

    public static void main(String[] args) {
        // TODO 00: AQUI DEFINIR VUESTRO ENTRENADOR INICIAL
        jugador = new Entrenador();
        jugador.incluirPokemonParaCombatir(0, new Eevee(5));
        jugador.incluirPokemonParaCombatir(1, new Eevee(6));
        jugador.incluirPokemonParaCombatir(2, new Arcanine(7));
        jugador.incluirPokemonParaCombatir(3, new Nidoran(8));
        jugador.incluirPokemonParaCombatir(4, new Gyarados(9));
        jugador.incluirPokemonParaCombatir(5, new Nidoking(45));
        jugador.getPokemonesCapturados().add(new Squirtle(25));
        jugador.getPokemonesCapturados().add(new Charmander(35));
        // Para que me funcionase el nidoran, le he cambiado el nombre a su png
        launch(args);
    }
}
