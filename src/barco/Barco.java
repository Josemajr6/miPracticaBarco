package barco;

/**
 * Representa un barco con nombre, precio y stock disponible.
 * 
 * @author José Manuel Jiménez Rodríguez
 * @version 1.0, 31/03/2025
 */
public class Barco {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor vacío (no implementado).
     * 
     * @param string Parámetro no usado
     * @param i Parámetro no usado
     * @param j Parámetro no usado
     * @param string2 Parámetro no usado
     * @param string3 Parámetro no usado
     */
    public Barco(String string, int i, int j, String string2, String string3) {
    }

    /**
     * Constructor que inicializa un barco con nombre, precio y stock.
     * 
     * @param nom Nombre del barco.
     * @param precio Precio del barco.
     * @param stock Cantidad en stock del barco.
     */
    public Barco(String nom, double precio, int stock) {
        this.setNombre(nom);
        this.setPrecio(precio);
        this.setStock(stock);
    }

    /**
     * Asigna un nombre al barco.
     * 
     * @param nom Nombre del barco.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del barco.
     * 
     * @return Nombre del barco.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene la cantidad de barcos en stock.
     * 
     * @return Cantidad de barcos disponibles en stock.
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Añade barcos al stock.
     * 
     * @param cantidad Cantidad de barcos a comprar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede comprar un nº negativo de barcos");
        setStock(getStock() + cantidad);
    }

    /**
     * Vende barcos si hay suficiente stock.
     * 
     * @param cantidad Cantidad de barcos a vender.
     * @throws Exception Si la cantidad es negativa o no hay suficiente stock.
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede vender una cantidad negativa de barcos");
        if (obtenerStock() < cantidad)
            throw new Exception("No hay suficientes barcos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Calcula el valor total del stock de barcos.
     * 
     * @return Valor total del stock.
     */
    public double calcularValorStock() {
        return getStock() * getPrecio();
    }

    /**
     * Aplica un descuento al precio del barco.
     * 
     * @param porcentaje Porcentaje de descuento a aplicar.
     * @throws Exception Si el porcentaje es menor que 0 o mayor que 100.
     */
    public void aplicarDescuento(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100)
            throw new Exception("Porcentaje de descuento inválido");
        setPrecio(getPrecio() - getPrecio() * (porcentaje / 100));
    }

    /**
     * Obtener stock de barcos mediante método get
     * 
     * @return Cantidad de barcos disponibles en stock
     */
    private int getStock() {
        return stock;
    }

    
    /**
     * Establecer cantidad de stock disponibles
     * 
     * @param stock Cantidad de stock disponible
     */
    private void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Obtener el precio del IVA
     * 
     * @return precio del IVA
     */
    private double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Establecer el precio del iva
     * 
     * @param precioIVA Precio de IVA
     */
    private void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Obtenemos el precio del barco
     * 
     * @return precio del barco
     */
    private double getPrecio() {
        return precio;
    }

    /**
     * Establecer el precio de un barco
     * 
     * @param precio del barco
     */
    private void setPrecio(double precio) {
        this.precio = precio;
    }

    
    /**
     * Obtener el nombre de un barco
     * 
     * @return nombre del barco
     */
    private String getNombre() {
        return nombre;
    }

    
    /**
     * Establecer el nombre a un barco
     * 
     * @param nombre del barco
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
