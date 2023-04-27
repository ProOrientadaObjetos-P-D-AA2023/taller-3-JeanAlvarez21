package clase;

public class Terreno {
    
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public void setCostoTerreno(double costoTerreno) {
        this.costoTerreno = costoTerreno;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    
    public void calcularArea(){
        area = largo * ancho;
    }
    
    public void calcularCosto(){
        costoTerreno = valorMetroCuadrado * area;
    }    
    
}