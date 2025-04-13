package es.masanz.ut7.pokemonfx.model.enums;

public enum Tipo {

    // TODO 10: Si se incluyen nuevos tipos de pokemon, se deberan reflejar aqui
    AGUA(new String[]{"PLANTA"}, new String[]{"FUEGO"}, new String[]{}),
    FUEGO(new String[]{"AGUA"}, new String[]{"PLANTA"}, new String[]{}),
    PLANTA(new String[]{"FUEGO"}, new String[]{"AGUAG"}, new String[]{}),
    NORMAL(new String[]{"LUCHA"}, new String[]{}, new String[]{"FANTASMA"}),
    SINIESTRO(new String[]{"LUCHA"}, new String[]{"PSIQUICO"}, new String[]{}),
    DRAGON(new String[]{"HIELO", "DRAGON"}, new String[]{"DRAGON"}, new String[]{}),
    VOLADOR(new String[]{"ELECTRICO", "HIELO", "ROCA"}, new String[]{"PLANTA", "LUCHA", "BICHO"}, new String[]{"TIERRA"}),
    PSIQUICO(new String[]{"SINIESTRO", "BICHO", "FANTASMA"}, new String[]{"LUCHA", "PSIQUICO"}, new String[]{}),
    HIELO(new String[]{"FUEGO", "LUCHA", "ROCA", "ACERO"}, new String[]{"AGUA", "PLANTA", "HIELO"}, new String[]{}),
    LUCHA(new String[]{"PSIQUICO", "VOLADOR", "HADA"}, new String[]{"NORMAL", "ICE", "ROCA", "ACERO"}, new String[]{}),
    VENENO(new String[]{"PSIQUICO", "TIERRA"}, new String[]{"PLANTA", "LUCHA"}, new String[]{}),
    TIERRA(new String[]{"AGUA", "HIELO", "PLANTA"}, new String[]{"VENENO", "ROCA", "ACERO", "FUEGO"}, new String[]{"ELECTRICO"}),
    BICHO(new String[]{"FUEGO", "ROCA", "VOLADOR"}, new String[]{"PLANTA", "PSIQUICO", "SINIESTRO"}, new String[]{}),
    FANTASMA(new String[]{"SINIETRO", "TIEERA", "DRAGON"}, new String[]{"NORMAL", "LUCHA"}, new String[]{"NORMAL", "LUCHA"});



    public final String[] debilidades;
    public final String[] resistencias;
    public final String[] inmunidades;

    Tipo(String[] debilidades, String[] resistencias, String[] inmunidades) {
        this.debilidades = debilidades;
        this.resistencias = resistencias;
        this.inmunidades = inmunidades;
    }

    public boolean esDebilContra(String tipo) {
        if(debilidades!=null && debilidades.length>0){
            for (String debilidad : debilidades) {
                if(debilidad.equalsIgnoreCase(tipo)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean esFuerteContra(String tipo) {
        if(resistencias!=null && resistencias.length>0){
            for (String resistencia : resistencias) {
                if(resistencia.equalsIgnoreCase(tipo)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean esInmuneContra(String tipo) {
        if(inmunidades!=null && inmunidades.length>0){
            for (String inmunidad : inmunidades) {
                if(inmunidad.equalsIgnoreCase(tipo)){
                    return true;
                }
            }
        }
        return false;
    }
}
