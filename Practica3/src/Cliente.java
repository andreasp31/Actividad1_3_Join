public class Cliente extends Thread{
    private String nombre;
    private Cajero cajero;

    public Cliente(String nombre, Cajero cajero){
        this.nombre = nombre;
        this.cajero = cajero;
    }

    @Override
    public void run(){
        System.out.println(nombre + " está pasando por el " + cajero.getNombre());
        try{
            int tiempoCliente = (int)(Math.random()*300) + 1000;
            Thread.sleep(tiempoCliente);

            System.out.println(nombre + " terminó con el " + cajero.getNombre() + tiempoCliente + "ms");

        }
        catch (InterruptedException e){
            System.out.println(nombre + " se ha parado.");
        }
    }

    public String getNombre() {
        return nombre;
    }


}
