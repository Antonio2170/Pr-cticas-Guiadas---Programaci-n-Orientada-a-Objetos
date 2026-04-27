package ni.edu.uam.modelos;

import java.util.ArrayList;

public class Empresa {

    ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public double calcularTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalarioTotal();
        }
        return total;
    }
}