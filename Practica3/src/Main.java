public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Jornada \n");

        Cajero cajero1 = new Cajero("Cajero 1",null);
        Cajero cajero2 = new Cajero("Cajero 2",null);


        Cliente[] clientesCajero1 = {
                new Cliente("Ana",cajero1),
                new Cliente("Carlos",cajero1),
                new Cliente("Dani",cajero1),
                new Cliente("Xade",cajero1),
        };

        Cliente[] clientesCajero2 = {
                new Cliente("Gonzalo",cajero2),
                new Cliente("Lucía",cajero2),
                new Cliente("Sara",cajero2),
                new Cliente("Alex",cajero2),
        };

        //Pasan la lista de los clientes a cada cajero
        cajero1.setClientes(clientesCajero1);
        cajero2.setClientes(clientesCajero2);

        cajero1.start();
        cajero2.start();


    }
}