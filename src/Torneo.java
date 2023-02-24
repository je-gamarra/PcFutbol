package src;

import java.util.ArrayList;

public class Torneo {

    private  String nombre; 

    private String descripcion;

    private boolean nacional; 

    private ArrayList<Fecha> fechas;

    public Torneo(){

        if (fechas == null)

           fechas = new ArrayList<>();

        
    }

    public void addFecha(Fecha fecha){
        fechas.add(fecha);
      

    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    
}
