package src;

import java.util.List;

public class ServiceFestejo {

    public void festejar(List<Jugable> jugador){

        for (Jugable jug : jugador) {
            jug.festejar(); 
            
        }

    }
    
}
