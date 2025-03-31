package barco;

/**
 * Clase principal para probar la funcionalidad de la clase Barco.
 * Se crean instancias de Barco y se realizan operaciones de venta, compra,
 * aplicación de descuento y cálculo del valor del stock.
 * 
 * @author José Manuel Jiménez Rodríguez
 * @version 1.0, 31/03/2025
 */
public class MainBarco {

    public static void main(String[] args) {
        Barco barco1;
        int stockActual;

        // Creación de un barco con nombre, precio y stock inicial
        barco1 = new Barco("Titanic", 500000, 20);

        // Realiza operaciones de compra y venta
        operativa_barcos(barco1, 300);

        // Muestra el stock actual
        stockActual = barco1.obtenerStock();
        System.out.println("El stock actual es: " + stockActual);

        // Calcula y muestra el valor total del stock
        double valorStock = barco1.calcularValorStock();
        System.out.println("El valor total del stock es: " + valorStock);

        // Aplica un descuento al barco
        try {
            barco1.aplicarDescuento(10);
            System.out.println("Se aplicó un descuento del 10%.");
        } catch (Exception e) {
            System.out.println("Error al aplicar descuento: " + e.getMessage());
        }
    }

    /**
     * Realiza operaciones de venta y compra de barcos.
     * 
     * @param barco1 Barco sobre la cual operar.
     * @param cantidad Cantidad de barcos a vender.
     */
    private static void operativa_barcos(Barco barco1, int cantidad) {
        try {
            System.out.println("Venta de Barcos");
            barco1.vender(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al vender: " + e.getMessage());
        }

        try {
            System.out.println("Compra de Barcos");
            barco1.comprar(10);
        } catch (Exception e) {
            System.out.println("Fallo al comprar: " + e.getMessage());
        }
    }
}
