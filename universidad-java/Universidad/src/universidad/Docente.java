//Mauricio Vergara
//Andres Olivero
package universidad;
public abstract class Docente extends Personal{
    
    protected String profesion, asignatura;
    
    public Docente(String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo,
            String profesion, String asignatura) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo);
        this.profesion = profesion;
        this.asignatura = asignatura;
    }
    
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }
    
}
