package ni.edu.uam.modelos;

public class Pedido {
    Cliente cliente;
    String producto;
    int cantidad;

    public Pedido(Cliente cliente, String producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public void mostrarDetalle() {
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
    }
}