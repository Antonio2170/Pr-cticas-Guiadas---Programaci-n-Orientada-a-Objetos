package ni.edu.uam.modelos;

public class Tienda {

    public void procesarPedido(Cliente cliente, String producto, int cantidad) {
        Pedido pedido = new Pedido(cliente, producto, cantidad);
        pedido.mostrarDetalle();
        System.out.println("Pedido procesado correctamente");
    }
}
