//Mauricio Vergara
//Andres Olivero
package universidad;
public abstract class Personal {
    
    protected String tipoDocumento, documento, apellidos, nombres;
    protected int edad;
    protected boolean activo;
    
    public Personal(String tipoDocumento, String documento, 
            String apellidos, String nombres, int edad, boolean activo){
        
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.edad = edad;
        this.activo = activo;
    }
    
    public String mostrarInfo(){
        String resultado = "";
        String estado="";
        if(this.activo){
            estado = "Activo";
        }else{
            estado = "Inactivo";
        }
        resultado = tipoDocumento+"\t"+documento+"\t"+nombres+"\t"+
                apellidos+"\t"+Integer.toString(edad)+"\t"+estado;
        return resultado;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
}
