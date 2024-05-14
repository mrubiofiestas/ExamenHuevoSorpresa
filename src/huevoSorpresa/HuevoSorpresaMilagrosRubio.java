package huevoSorpresa;

/**
 * Definimos la clase HuevoSorpresa
 *
 * @author MILAGROS RUBIO
 * @version 1.0
 * @since 14 de mayo del 2024
 */
public class HuevoSorpresaMilagrosRubio {

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa

    /**
     * @return metodo get que devuelve las unidades del huevo sorpresa
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades metodo void que llama a las unidades
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return metodo get que devuelve el precio del huevo sorpresa
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio metodo void que llama al precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return metodo get que devuelve la sorpresa del huevosorpresa
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa metodo void que llama a la sorpresa
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return metodo get que devuelve el precio maximo
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * @param precio_max the precio_max to set
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }

    /**
     * Clase sin parametros
     */
    public HuevoSorpresaMilagrosRubio() {
    }

    /**
     * Constructor con parametros
     * 
     * @param unidades unidades del huevo sorpresa
     * @param precio precio del huevo sorpresa
     * @param sorpresa sorpresa que viene dentro del huevo sorpresa
     * @param precio_max precio max dle huevo sorpresa
     */
    public HuevoSorpresaMilagrosRubio(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_max = precio_max;
    }

    /**
     * metodo para obtener unidades del huevo sorpresa
     * @return devuelve las unidades
     */
    public int obtenerUnidades() {
        return this.getUnidades();
    }

    /**
     * metodo para obtener el precio del huevo sorpresa
     * @return devuelve el precio
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }

    /**
     * Metodo que modifica las unidades del huevo sorpresa
     * @param unidades unidades del huevo sorpresa
     */
    public void modificarUnidades(int unidades) {
        this.setUnidades(unidades);
    }

    /**
     * Metodo void que permite sacar huevos sorpresas con parametros
     * 
     * @param unidades unidades del huevo sorpresa
     * @param dinero dinero disponible
     * @param sorpresa sorpresa del huevo sorpresa
     * @throws Exception excepcion que se lanza si se ingresa una cantidad de dinero negativa, 
     * cuando no tiene suficiente dinero, ingresa una cantidad negativa de huevos sorpresa o 
     * no hay suficientes huevos sorpresa.
     */
    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.getUnidades() < unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /**
     * Metodo void que permite aumentar precio 
     * @param aumento aumento del precio
     * @throws Exception lanza una excepcion si el aumento es negativo o 
     * cuando se ingresa una cantidad que supere el precio maximo 
     */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_max() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
}
