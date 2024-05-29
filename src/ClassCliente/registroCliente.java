package ClassCliente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class registroCliente {
    //metodos
    public static void main(String[] args) {
        ArrayList<Cliente> Clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String mostrarClientes;

        //Solicitar datos
        do {
            System.out.println("Ingrese el id del cliente:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del cliente:");
            String apellido = sc.nextLine();
            System.out.println("Ingrese el email del cliente:");
            String email = sc.nextLine();
            System.out.println("Ingrese el teléfono del cliente:");
            String telefono = sc.nextLine();


            Cliente cliente = new Cliente(id, nombre, apellido, email, telefono);
            Clientes.add(cliente);



            System.out.println("¿Desea agregar otro cliente? (s/n)");
            mostrarClientes = sc.nextLine();
        }while (!mostrarClientes.equalsIgnoreCase("n"));

        // Mostrar clientes registrados
        System.out.println("Clientes registrados:");
        Iterator<Cliente> iterator = Clientes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        sc.close();
    }
}
