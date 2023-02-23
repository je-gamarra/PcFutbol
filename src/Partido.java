package src;

import java.util.ArrayList;
import java.util.Random;

public class Partido {

    //private static final int GOLES_MAXIMO = 7;

    private Estadio estadio;

    private Equipo local;

    private Equipo visitante;

    private Object golesLocal;

    private Object golesVisitante;

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public void jugarResultado(){

        

        golesLocal = calcularGol(local);
        golesVisitante = calcularGol(visitante);

        System.out.println("****************************");

        System.out.print(golesLocal + " " + local.getNombre()+ "-");
        System.out.println(golesVisitante + " " + local.getNombre());

        System.out.println("****************************"); 

    }

    private Object calcularGol(Equipo equipo) {

        Random rnd = new Random();

        ArrayList<Jugador> jugadores = equipo.getJugadores(); 

        int promedio = 0;

        for(Jugador jugador : jugadores){

            promedio += jugador.getPromedio(); 
        }

        promedio /= jugadores.size(); 

        return rnd.nextInt(promedio);
    }

    
}
