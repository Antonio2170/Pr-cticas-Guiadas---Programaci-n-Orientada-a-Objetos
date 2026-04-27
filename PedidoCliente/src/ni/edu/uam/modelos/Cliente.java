package ni.edu.uam.modelos;

public class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void realizarPedido(Tienda tienda, String producto, int cantidad) {
        tienda.procesarPedido(this, producto, cantidad);
    }
}