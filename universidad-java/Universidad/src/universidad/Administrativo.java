package universidad;
//Mauricio Veregara
//Andres Olivero
public class Administrativo extends Personal{
    
    private String cargo, fechaContrato;
    
    public Administrativo(String tipoDocumento, String documento, 
            String apellidos, String nombres, int edad, boolean activo,
            String cargo, String fechaContrato) {
        super(tipoDocumento, documento, apellidos, 
                nombres, edad, activo);
        this.cargo = cargo;
        this.fechaContrato = fechaContrato;
    }
    
    public String mostrar(){
        String resultado = "";
        resultado = mostrarInfo()+"\t"+cargo+"\t"+fechaContrato;
        return resultado;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    
}
