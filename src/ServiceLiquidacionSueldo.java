package src;

import java.util.List;

public class ServiceLiquidacionSueldo {

    /**
     * @param empleados
     */
    public void liquidarSueldos(List<Empleado> empleados){

        for (Empleado empleado : empleados) {

            float sueldo = empleado.liquidarSueldo();
            System.out.println("Sueldo empleado("+empleado.getNombre()+"): " + sueldo);
        }
    }
    
}
