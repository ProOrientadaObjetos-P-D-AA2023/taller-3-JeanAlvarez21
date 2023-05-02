package clase;

public class EquivalenteHora {
    
    private double horas;
    private int minutos;
    private int segundos;
    private double dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }
    
    public void convertirAMin(){
        minutos = (int) (horas * 60);
    }
    
    public void convertirASeg(){
        segundos = (int) (horas * 3600);
    }
    
    public void convertirADia(){
        dias = horas / 24;
    }
}
