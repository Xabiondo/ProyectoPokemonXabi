package es.masanz.ut7.pokemonfx.model.enums;

import es.masanz.ut7.pokemonfx.controller.MapController;
import javafx.scene.image.Image;

public enum TileType {

    // TODO 09: Incluir nuevos tipos de sprites. Las dimensiones deben ser 16x16px
    CAMINO_BLANCO("/pruebas/camino_blanco.png"),
    PARED_BLANCA("/pruebas/pared_blanca.png"),
    CESPED("/pruebas/cesped.png"),
    CESPED_ARBUSTO("/pruebas/cesped_arbusto.png"),
    CESPED_HIERBA("/pruebas/cesped_hierba.png"),
    MONTE_CENTRO("/pruebas/monte_centro.png"),
    MONTE_BORDE_SUPERIOR("/pruebas/monte_borde_superior.png"),
    MONTE_BORDE_INFERIOR("/pruebas/monte_borde_inferior.png"),
    MONTE_BORDE_IZQUIERDA("/pruebas/monte_borde_izquierda.png"),
    MONTE_BORDE_DERECHA("/pruebas/monte_borde_derecha.png"),
    MONTE_ESQUINA_SUPERIOR_IZQUIERDA("/pruebas/monte_esquina_superior_izquierda.png"),
    MONTE_ESQUINA_SUPERIOR_DERECHA("/pruebas/monte_esquina_superior_derecha.png"),
    MONTE_ESQUINA_INFERIOR_IZQUIERDA("/pruebas/monte_esquina_inferior_izquierda.png"),
    MONTE_ESQUINA_INFERIOR_DERECHA("/pruebas/monte_esquina_inferior_derecha.png"),
    AGUAGRANDE("/pruebas/AguaGrande.png"),
    AGUA_ROCA_IZQUIERDA("/pruebas/agua_roca_izquierda.png"),
    AGUA_ROCA_DERECHA("/pruebas/agua_roca_derecha.png"),
    AGUA_ROCA_ARRIBA("/pruebas/agua_roca_arriba.png"),

    TELEPORT_RED("/pruebas/teleport_red.png"),
    TECHO_IZQUIERDA("/pruebas/techo_izquierda.png"),
    TECHO("/pruebas/techo.png"),
    TECHO_DERECHA("/pruebas/techo_derecha.png"),
    TECHO_BORDE_IZQUIERDA("/pruebas/techo_borde_izquierda.png"),
    TECHO_BORDE("/pruebas/techo_borde.png"),
    TECHO_BORDE_DERECHA("/pruebas/techo_borde_derecha.png"),
    VENTANA_IZQUIERDA("/pruebas/ventana_izquierda.png"),
    PARED_CON_VENTANA_IZQUIERDA("/pruebas/pared_con_ventana_izquierda.png"),
    TEXTO_GYM("/pruebas/texto_gym.png"),
    PARED_CON_VENTANA_DERECHA("/pruebas/pared_con_ventana_derecha.png"),
    VENTANA_DERECHA("/pruebas/ventana_derecha.png"),
    ESQUINA_DERECHA_SUPERIOR("/pruebas/esquina_derecha_superior.png"),
    PARED_INFERIOR_IZQUIERDA("/pruebas/pared_inferior_izquierda.png"),
    PARED_INFERIOR("/pruebas/pared_inferior.png"),
    PUERTA("/pruebas/puerta.png"),
    PARED_INFERIOR_DERECHA("/pruebas/pared_inferior_derecha.png"),
    SUELO_MADERA("/pruebas/suelo_madera.png"),
    ARBOL_PARTE_ABAJO("/pruebas/arbol_parte_abajo.png"),
    ARBOL_PARTE_ARRIBA("/pruebas/arbol_parte_arriba.png"),
    ESQUINA_DERECHA_INFERIOR("/pruebas/esquina_derecha_inferior.png");

    public final Image imagen;

    TileType(String rutaImagen){
        imagen = new Image(MapController.class.getResource(rutaImagen).toExternalForm());
    }

}
