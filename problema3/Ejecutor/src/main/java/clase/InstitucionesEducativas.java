package clase;

public class InstitucionesEducativas {
    
    private String nombreInstitucion;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private float gastosPorEstudiante;
    private float presupuesto; 

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public float getGastosPorEstudiante() {
        return gastosPorEstudiante;
    }

    public void setGastosPorEstudiante(float gastosPorEstudiante) {
        this.gastosPorEstudiante = gastosPorEstudiante;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
  
    public void calcularPresupuesto(){
        presupuesto = (float) numeroAlumnos * gastosPorEstudiante;
    }
    
}
