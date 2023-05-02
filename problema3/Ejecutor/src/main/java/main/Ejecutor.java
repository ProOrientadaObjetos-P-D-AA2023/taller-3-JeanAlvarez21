
package main;

import clase.InstitucionesEducativas;

public class Ejecutor {

    public static void main(String[] args) {
        
        InstitucionesEducativas inst = new InstitucionesEducativas() ;
        
        inst.setNombreInstitucion("Daniel Alvarez Burneo");
        inst.setTipoInstitucion("Fiscomisional");
        inst.setNumeroAlumnos(7283);
        inst.setNumeroDocentes(60);
        inst.setNumeroSedes(3);
        inst.setGastosPorEstudiante((float) 36.70);
        
        inst.calcularPresupuesto();
        
        System.out.println("Institucion Educativa: " + inst.getNombreInstitucion());
        System.out.println("Tipo de institucion: " + inst.getTipoInstitucion());
        System.out.println("Numero de alumnnos: " + inst.getNumeroAlumnos());
        System.out.println("Numero de docentes: " + inst.getNumeroDocentes());
        System.out.println("Numero de cedes: " + inst.getNumeroSedes());
        System.out.println("Gastos proyectados por estudiante: $" + inst.getGastosPorEstudiante());
        System.out.println("Presupuesto: $" + inst.getPresupuesto());
    }
}
