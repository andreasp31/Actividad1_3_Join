public class Cajero extends Thread{
    private String nombre;
    private Cliente[] clientes;

    public Cajero(String nombre, Cliente[] clientes){
        this.nombre = nombre;
        this.clientes = clientes;
    }

    @Override
    public void run(){
        for(Cliente cliente : clientes){
            System.out.println(nombre + " atiende a " + cliente.getNombre());
            cliente.start();

            try{
                cliente.join();
                System.out.println(nombre + ":que pase el siguiente");

            }
            catch (InterruptedException e){
                System.out.println(nombre + " ha terminado con todos los clientes");
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}
