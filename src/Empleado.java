package src;

import javax.print.attribute.standard.RequestingUserName;

public class Empleado extends Persona{

    private int legado; 

    protected float salario; 

    protected float impuesto; 

    public int getLegado() {
        return legado;
    }

    public void setLegado(int legado) {
        this.legado = legado;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public float liquidarSueldo(){

        return salario - impuesto; 

    }
        


    



    
}
