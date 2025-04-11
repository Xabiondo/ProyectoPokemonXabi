package es.masanz.ut7.pokemonfx.model.enums;

public enum Stats {

    // TODO 08: Incluir nuevos pokemon. Cuidado, el nombre correcto es muy IMPORTANTE
    BULBASAUR("001", 45, 49, 49, 45, 65, 65, 64),
    CHARMANDER("004", 39, 52, 43, 65, 60, 50, 65),
    SQUIRTLE("007", 44, 48, 65, 43, 50, 64, 66),
    IVYSAUR("010" , 60 , 62 , 63 , 60 , 80 , 80 ,70),
    VENUSAUR("011" , 80 , 82 , 83 , 80 , 100 , 100 , 100),
    EEVEE("133", 55, 55, 50, 55, 45, 65, 65),
    TOTODILE("158", 50, 65, 64, 43, 44, 48, 66),
    CROCOWNAW("159", 65, 80, 80, 58, 59, 63, 80),
    GROWLITHE("058", 55, 70, 45, 60, 70, 50, 70),
    ARCANINE("059", 90, 110, 80, 95, 100, 80, 120),
    BAGON("371", 45, 75, 60, 50, 40, 30, 60),
    WARTORTLE("008", 59, 63, 80, 58, 65, 80, 68),
    CHARMELEON("005", 58, 64, 58, 80, 80, 65, 142),
    CHARIZARD("006", 78, 84, 78, 100, 109, 85, 240),

    SHELGON("372", 65, 95, 100, 50, 60, 50, 80);



    public final String numPokedex;
    public final int hp, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial, expBase;

    Stats(String numPokedex, int hp, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, int expBase) {
        this.numPokedex = numPokedex;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.expBase = expBase;
    }
}
