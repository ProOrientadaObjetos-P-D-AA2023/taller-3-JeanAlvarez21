
package main;
import clase.EquivalenteHora;
public class Ejecutor {

    public static void main(String[] args) {
        
        EquivalenteHora h = new EquivalenteHora();
        
        h.setHoras(2);
        
        h.convertirAMin();
        h.convertirASeg();
        h.convertirADia();
        
        System.out.println(h.getHoras() + " horas son " + h.getMinutos() + " minutos.");
        System.out.println(h.getHoras() + " horas son " + h.getSegundos() + " segundos.");
        System.out.println(h.getHoras() + " horas son " + h.getDias() + " dias.");
    }
}
