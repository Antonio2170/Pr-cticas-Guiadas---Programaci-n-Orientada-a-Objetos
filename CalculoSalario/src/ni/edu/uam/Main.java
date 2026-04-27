package ni.edu.uam;

import java.util.Scanner;
import ni.edu.uam.modelos.Empleado;
import ni.edu.uam.modelos.Empresa;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese salario base: ");
        double salario = sc.nextDouble();

        Empleado emp = new Empleado(nombre, salario);

        emp.mostrarSalario();

        double bono = emp.calcularBono();
        System.out.println("Bono: " + bono);

        System.out.println("Salario total: " + emp.calcularSalarioTotal());

        // Mostrar mensaje según condición
        if (emp.aplicaDescuento()) {
            System.out.println("Aplica descuento");
        } else {
            System.out.println("No aplica descuento");
        }

        // Reto: Empresa
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(emp);

        System.out.println("Total salarios en la empresa: " + empresa.calcularTotalSalarios());

        sc.close();
    }
}