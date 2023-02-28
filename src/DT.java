package src;

public class DT extends Empleado implements Jugable{

    private String estrategia;

    private int primas;

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }


    @Override
    public float liquidarSueldo() {



        // TODO Auto-generated method stub

        primas += 10;
        return (salario + primas) - getImpuesto();
    }

    @Override
    public void mover() {
        int x=0, y = 0; 

        x++;

            }

    @Override
    public void festejar() {

        System.out.println(":(");
       
    }
     
    
}
