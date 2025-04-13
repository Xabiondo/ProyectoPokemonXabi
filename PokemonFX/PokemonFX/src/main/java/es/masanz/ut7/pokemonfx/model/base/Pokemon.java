package es.masanz.ut7.pokemonfx.model.base;

import es.masanz.ut7.pokemonfx.model.enums.Stats;

import java.util.LinkedHashMap;
import java.util.UUID;

// TODO 06: Crear vuestros propios pokemon que extiendan esta clase
public abstract class Pokemon implements Cloneable{

    protected String id;
    protected String apodo;
    protected int hpActual;
    // estos factores se pueden consultar en https://pokemon.fandom.com/es/wiki/Lista_de_Pok%C3%A9mon_con_sus_estad%C3%ADsticas_base
    protected int hpBase, ataqueBase, defensaBase, velocidadBase, ataqueEspecialBase, defensaEspecialBase;
    // estos factores se generan al hacer en un numero random entre el 0 y el 31
    protected int hpIV, ataqueIV, defensaIV, velocidadIV, ataqueEspecialIV, defensaEspecialIV;
    // este factor se puede consultar en https://pokemon.fandom.com/es/wiki/Experiencia_base
    protected int expBase;
    protected int nivel;
    protected int puntosExp;
    protected String numPokedex;

    protected LinkedHashMap<String, Ataque> ataques;

    protected Ataque ataqueSeleccionado;

    public Pokemon(int nivel){
        this.id = UUID.randomUUID().toString();
        Stats stats = Stats.valueOf(this.getClass().getSimpleName().toUpperCase());
        this.numPokedex = stats.numPokedex;
        this.hpBase = stats.hp;
        this.ataqueBase = stats.ataque;
        this.defensaBase = stats.defensa;
        this.velocidadBase = stats.velocidad;
        this.ataqueEspecialBase = stats.ataqueEspecial;
        this.defensaEspecialBase = stats.defensaEspecial;
        this.expBase = stats.expBase;
        this.hpIV = (int) (Math.random() * 32);
        this.ataqueIV = (int) (Math.random() * 32);
        this.defensaIV = (int) (Math.random() * 32);
        this.velocidadIV = (int) (Math.random() * 32);
        this.ataqueEspecialIV = (int) (Math.random() * 32);
        this.defensaEspecialIV = (int) (Math.random() * 32);
        this.nivel = nivel;
        this.puntosExp = 0;
        this.apodo = null;
        this.hpActual = getMaxHP();
        this.ataqueSeleccionado = null;
        asignarAtaques();
    }

    protected abstract void asignarAtaques();

    public abstract int nivelEvolucion();

    public abstract Pokemon pokemonAEvolucionar();

    public String atacar(Pokemon enemigo) {
        String msg = ataqueSeleccionado.ejecutarAtaque(this, enemigo);
        return msg;
    }

    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        int vida = this.getHpActual() - cantidadDano;
        if(vida<0) vida = 0;
        this.setHpActual(vida);
    }

    public int calcularHP() {
        return ((2 * hpBase + hpIV + 31) * nivel / 100) + nivel + 10;
    }

    private int calcularStat(int statBase, int statIV) {
        return ((2 * statBase + statIV + 31) * nivel / 100) + 5;
    }

    public void asignarAtaque(String clave, Ataque ataque){
        if(ataques==null){
            ataques = new LinkedHashMap<>();
        }
        ataques.put(clave, ataque);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHpBase() {
        return hpBase;
    }

    public void setHpBase(int hpBase) {
        this.hpBase = hpBase;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public int getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(int defensaBase) {
        this.defensaBase = defensaBase;
    }

    public int getVelocidadBase() {
        return velocidadBase;
    }

    public void setVelocidadBase(int velocidadBase) {
        this.velocidadBase = velocidadBase;
    }

    public int getAtaqueEspecialBase() {
        return ataqueEspecialBase;
    }

    public void setAtaqueEspecialBase(int ataqueEspecialBase) {
        this.ataqueEspecialBase = ataqueEspecialBase;
    }

    public int getDefensaEspecialBase() {
        return defensaEspecialBase;
    }

    public void setDefensaEspecialBase(int defensaEspecialBase) {
        this.defensaEspecialBase = defensaEspecialBase;
    }

    public int getHpIV() {
        return hpIV;
    }

    public void setHpIV(int hpIV) {
        this.hpIV = hpIV;
    }

    public int getAtaqueIV() {
        return ataqueIV;
    }

    public void setAtaqueIV(int ataqueIV) {
        this.ataqueIV = ataqueIV;
    }

    public int getDefensaIV() {
        return defensaIV;
    }

    public void setDefensaIV(int defensaIV) {
        this.defensaIV = defensaIV;
    }

    public int getVelocidadIV() {
        return velocidadIV;
    }

    public void setVelocidadIV(int velocidadIV) {
        this.velocidadIV = velocidadIV;
    }

    public int getAtaqueEspecialIV() {
        return ataqueEspecialIV;
    }

    public void setAtaqueEspecialIV(int ataqueEspecialIV) {
        this.ataqueEspecialIV = ataqueEspecialIV;
    }

    public int getDefensaEspecialIV() {
        return defensaEspecialIV;
    }

    public void setDefensaEspecialIV(int defensaEspecialIV) {
        this.defensaEspecialIV = defensaEspecialIV;
    }

    public void setExpBase(int expBase) {
        this.expBase = expBase;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosExp(int puntosExp) {
        this.puntosExp = puntosExp;
    }

    public void setNumPokedex(String numPokedex) {
        this.numPokedex = numPokedex;
    }

    public void setAtaques(LinkedHashMap<String, Ataque> ataques) {
        this.ataques = ataques;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Info. de Pokemon "+getClass().getSimpleName()+":\n"));
        sb.append(String.format("   %-20s\n", "Nivel actual: "+getNivel()));
        if(apodo!=null){
            sb.append(String.format("   %-20s\n", "apodo: "+apodo));
        }
        sb.append(String.format("   %-20s\n", "vida max.: "+getMaxHP()));
        sb.append(String.format("   %-20s\n", "vida act.: "+getHpActual()));
        sb.append(String.format("   %-20s\n", "ataque: "+getAtaque()));
        sb.append(String.format("   %-20s\n", "defensa: "+getDefensa()));
        sb.append(String.format("   %-20s\n", "velocidad: "+getVelocidad()));
        sb.append(String.format("   %-20s\n", "ata. especial: "+getAtaqueEspecial()));
        sb.append(String.format("   %-20s\n", "def. especial: "+getAtaqueEspecial()));

        return sb.toString();
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNumPokedex() {
        return numPokedex;
    }

    public int getNivel(){
        return nivel;
    }

    public void subirNivel(){
        int vidaMaxAnterior = getMaxHP();
        nivel++;
        this.hpActual += (getMaxHP() - vidaMaxAnterior);
        if(this.hpActual>getMaxHP()) this.hpActual = getMaxHP();
    }

    public boolean sumarExperiencia(int puntosExp){
        boolean aumentaNivel = false;
        this.puntosExp += puntosExp;
        while(this.puntosExp>=experienciaNecesariaParaSubirNivel()){
            this.puntosExp = this.puntosExp - experienciaNecesariaParaSubirNivel();
            aumentaNivel = true;
            subirNivel();
        }
        return aumentaNivel;
    }


    public int experienciaNecesariaParaSubirNivel() {
        return (int) Math.pow(this.nivel, 3);
    }

    public int getMaxHP() {
        return calcularHP();
    }

    public int getHpActual() {
        return hpActual;
    }

    public void setHpActual(int hpActual) {
        this.hpActual = hpActual;
    }

    public int getAtaque() {
        return calcularStat(ataqueBase, ataqueIV);
    }

    public int getDefensa() {
        return calcularStat(defensaBase, defensaIV);
    }

    public int getVelocidad() {
        return calcularStat(velocidadBase, velocidadIV);
    }

    public int getAtaqueEspecial(){
        return calcularStat(ataqueEspecialBase, ataqueEspecialIV);
    }

    public int getDefensaEspecial(){
        return calcularStat(defensaEspecialBase, defensaEspecialIV);
    }

    public LinkedHashMap<String, Ataque> getAtaques() {
        return ataques;
    }

    public Ataque getAtaqueSeleccionado() {
        return ataqueSeleccionado;
    }

    public void setAtaqueSeleccionado(Ataque ataqueSeleccionado) {
        this.ataqueSeleccionado = ataqueSeleccionado;
    }

    public int getExpBase() {
        return expBase;
    }

    public void regenerarIVs(){

        this.hpIV = (int) (Math.random() * 32);
        this.ataqueIV = (int) (Math.random() * 32);
        this.defensaIV = (int) (Math.random() * 32);
        this.velocidadIV = (int) (Math.random() * 32);
        this.ataqueEspecialIV = (int) (Math.random() * 32);
        this.defensaEspecialIV = (int) (Math.random() * 32);
        this.id = UUID.randomUUID().toString();
        this.hpActual = this.getMaxHP(); // Ajustar el HP actual basado en los nuevos IVs


    }

    public int getPuntosExp() {
        return puntosExp;
    }

    // TODO 01: Implementar clone. El clonado deberá generar un pokemon con nuevos IV.

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Pokemon clonado = (Pokemon) super.clone();


        clonado.regenerarIVs();

        //para que salga full vida
        clonado.ataques = new LinkedHashMap<>();
        //Primero hacemos si o si un hashmap, y si esta lleno copiaremos los ataques clonanfolos

        if (this.ataques != null){
            for (Ataque ataque : this.ataques.values()){
                clonado.ataques.put(ataque.nombre , ataque.clone());
            }


        }
        return clonado;


    }
}
