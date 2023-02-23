package src;

import java.util.ArrayList;

public class Fecha {

    private int numero; 

    private boolean fechaFifa;

    private ArrayList<Partido> partidos;



    public Fecha(int numero) {
        this.numero = numero; 
    }


    public void addPartido(Partido partido){

        if ( partidos == null)
        partidos = new ArrayList<>(); 
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isFechaFifa() {
        return fechaFifa;
    }

    public void setFechaFifa(boolean fechaFifa) {
        this.fechaFifa = fechaFifa;
    }

    
    
}
