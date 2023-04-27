
package problema1;
import clase.Terreno;

public class Ejecutor {

    public static void main(String[] args) {
        Terreno t = new Terreno();
        
        t.setAncho(25);
        t.setLargo(50);
        t.setValorMetroCuadrado(10);
        
        t.calcularArea();
        t.calcularCosto();
        
        System.out.println("El largo de su terreno es de " + t.getLargo() + "m");
        System.out.println("El ancho de su terreno es de " + t.getAncho() + "m");
        System.out.println("El area de su terreno es de " + t.getArea() + "m");
        System.out.println("Teniendo en cuenta que el costo por metro cuadrado es de $" + t.getValorMetroCuadrado() + " el costo de su terreno es de $" + t.getCostoTerreno());
        
    }
    
}
