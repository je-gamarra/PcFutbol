package src;

import java.util.ArrayList;

public class Ejecutar {
    public static void main(String[] args){

        DT dt = new DT(); 
        dt.setNombre("zidane");
        dt.setSalario(100);

        Jugador jugador = new Jugador();
        jugador.setNombre("Janner");
        jugador.setSalario(10_000);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Aristidez");
        jugador2.setSalario(20_000);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Romario");
        jugador3.setSalario(30_000);

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(dt);
        empleados.add(jugador);
        empleados.add(jugador2);
        empleados.add(jugador3);

        ArrayList<Jugable> jugables = new ArrayList<>(); 
        jugables.add(dt);
        jugables.add(jugador);
        jugables.add(jugador2);
        jugables.add(jugador3); 


        ServiceLiquidacionSueldo ServiceLiquidador = new ServiceLiquidacionSueldo();
        ServiceLiquidador.liquidarSueldos(empleados);

        ServiceFestejo serviceFesteja = new ServiceFestejo();
        serviceFesteja.festejar(jugables); 


        //jugador.festejar();
        //dt.festejar();

    }
}
