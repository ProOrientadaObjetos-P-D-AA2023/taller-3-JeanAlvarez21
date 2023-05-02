
package main;

import clase.EquipoCelular;

public class Ejecutor {

    public static void main(String[] args) {
        
        EquipoCelular equipo1 = new EquipoCelular();
    
        equipo1.setSistemaOperativo("iOS 11");
        equipo1.setTamañoPantalla((float)5.8);
        equipo1.setCostoInicial((float)299.99);
        equipo1.setDirMac("00:1e:c3:9e:21:7b.");
        equipo1.setInfIMEI("010763/01/387533/5");
        
        equipo1.ivaCostoInicial();
        equipo1.calcularCostoFinal();
        
        System.out.println("Sistema operativo: " + equipo1.getSistemaOperativo());
        System.out.println("Tamaño de la pantalla: " + equipo1.getTamañoPantalla());
        System.out.println("Costo inicial del equipo: $" + equipo1.getCostoInicial());
        System.out.println("Direccion Mac: " + equipo1.getDirMac());
        System.out.println("IMEI: " + equipo1.getInfIMEI());
        System.out.println("IVA: %" + equipo1.getIva() + "\n");
        System.out.print("Costo final del equipo: " + equipo1.getCostoFinal());
        
    
    }
}
