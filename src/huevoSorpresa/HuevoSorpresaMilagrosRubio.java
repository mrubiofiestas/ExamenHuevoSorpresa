package huevoSorpresa;
public class HuevoSorpresaMilagrosRubio {

    /**
     * @return the unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the sorpresa
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa the sorpresa to set
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return the precio_max
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
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    
public HuevoSorpresaMilagrosRubio(){}


public HuevoSorpresaMilagrosRubio(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}


public int obtenerUnidades(){return this.getUnidades();}


public double obtenerPrecio(){return this.getPrecio();}


public void modificarUnidades(int unidades){this.setUnidades(unidades);}

public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}


public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}
}