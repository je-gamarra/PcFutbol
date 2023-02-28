package src;

import java.util.ArrayList;
import java.util.Random;

public class Equipo {

    private String nombre;

    private String escudo;

    private String color;

    private int fundacion;


    private ArrayList<Jugador> jugadores; 

    private DT dt;

    private int golesLocal;

    private int golesVisitante;
    

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public DT getDt() {
        return dt;
    }

    public void setDt(DT dt) {
        this.dt = dt;
    }

    public void addJugador(Jugador jugador){

        if (jugadores == null )
        jugadores = new ArrayList<>();

        jugadores.add(jugador); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;

        
        
    } 

    

    
}
