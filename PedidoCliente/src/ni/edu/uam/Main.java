package ni.edu.uam;

import java.util.Scanner;
import ni.edu.uam.modelos.Cliente;
import ni.edu.uam.modelos.Tienda;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese producto: ");
        String producto = sc.nextLine();

        System.out.print("Ingrese cantidad: ");
        int cantidad = sc.nextInt();

        Cliente cliente = new Cliente(nombre);
        Tienda tienda = new Tienda();

        cliente.realizarPedido(tienda, producto, cantidad);

        sc.close();
    }
}