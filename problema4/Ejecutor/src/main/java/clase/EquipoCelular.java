package clase;

public class EquipoCelular {
    
    private String sistemaOperativo;
    private float tamañoPantalla;
    private float costoInicial;
    private float iva = (float)12;
    private float ivaInicial;
    private float costoFinal;
    private String dirMac;
    private String infIMEI;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public float getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(float tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public float getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(float costoInicial) {
        this.costoInicial = costoInicial;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getIvaInicial() {
        return ivaInicial;
    }

    public void setIvaInicial(float ivaInicial) {
        this.ivaInicial = ivaInicial;
    }

    public float getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(float costoFinal) {
        this.costoFinal = costoFinal;
    }

    public String getDirMac() {
        return dirMac;
    }

    public void setDirMac(String dirMac) {
        this.dirMac = dirMac;
    }

    public String getInfIMEI() {
        return infIMEI;
    }

    public void setInfIMEI(String infIMEI) {
        this.infIMEI = infIMEI;
    }
    
    public void ivaCostoInicial(){
        ivaInicial = (iva/100) * costoInicial;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaInicial;
    }
}
