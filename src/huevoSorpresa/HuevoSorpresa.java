package huevoSorpresa;
public class HuevoSorpresa {
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    
public HuevoSorpresa(){}


public HuevoSorpresa(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}


public int obtenerUnidades(){return this.unidades;}


public double obtenerPrecio(){return this.precio;}


public void modificarUnidades(int unidades){this.unidades=unidades;}

public void sacarHuevosSorpresas(int unidades, double dinero) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * precio)) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if(this.unidades<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}


public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if(precio_max<precio + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
    precio=precio + aumento;
}
}