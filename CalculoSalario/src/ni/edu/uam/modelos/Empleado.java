package ni.edu.uam.modelos;

public class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método SIN retorno
    public void mostrarSalario() {
        System.out.println("Salario base: " + salarioBase);
    }

    // Métodos CON retorno
    public double calcularBono() {
        return salarioBase * 0.10;
    }

    public double calcularSalarioTotal() {
        return salarioBase + calcularBono();
    }

    // Actividad
    public boolean aplicaDescuento() {
        return salarioBase > 400;
    }
}
