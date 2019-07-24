package universidad;
//Mauricio Veregara
//Andres Olivero
public class Planta extends Docente{

    private String fechaContrato;
    private int cantProyectos;

    public Planta(String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo, String profesion, 
            String asignatura,
            String fechaContrato, int cantProyectos) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo, profesion, asignatura);
        this.fechaContrato = fechaContrato;
        this.cantProyectos = cantProyectos;
    }
    
    public String mostrar(){
        String resultado="";
        resultado = mostrarInfo()+"\t"+profesion+"\t"+asignatura+"\t"+fechaContrato+"\t"+cantProyectos;
        return resultado;
    }
    
}
