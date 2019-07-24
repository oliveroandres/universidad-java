//Mauricio Vergara
//Andres Olivero
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidad {

    public static void main(String[] args) {
 
        Scanner xd = new Scanner(System.in);
       ArrayList<Alumnos> listaAlumnos = new ArrayList();
       boolean ciclo = true;
       int decision=1;
       int decisiondosen=1;
       while(ciclo){
           
           String tipoDocumento,  documento,  apellidos, nombres, 
                   codigo,  facultad,  programa; 
           int edad, semestre; 
           boolean activo;
           System.out.println("ingrese un alumno");
           System.out.println("");
           System.out.println("Ingrese tipo de documento");
           tipoDocumento  = xd.next();
           System.out.println("Digite el documento:");
           documento = xd.next();
           System.out.println("Digite el nombre:");
           nombres = xd.next();
           System.out.println("Digite el apellido:");
           apellidos = xd.next();
           System.out.println("Digite la edad:");
           edad = xd.nextInt();
           System.out.println("Digite la facultad");
           facultad = xd.next();
           System.out.println("Digite el programa:");
           programa = xd.next();
           System.out.println("Digite el semestre:");
           semestre = xd.nextInt();
           System.out.println("Digite el código:");
           codigo = xd.next();
           
           listaAlumnos.add(new Alumnos(tipoDocumento, documento, apellidos, nombres, edad, true, codigo, facultad, programa, semestre));
           System.out.println("¿Desea seguir ingresando alumnos? (1=sí / 2=no)");
           decision = xd.nextInt();
           if(decision == 2){
               ciclo = false;
           }
       }
       boolean cicl =true;
       ArrayList<Catedratico> ListaCatedra = new ArrayList();
        while(cicl){
            String tipodocumento,documento,nombre,apellido,profecion,asignatura,fechainicio,fechafin;
            boolean activo;
            int edad;
            System.out.println("ingrese un docente catedratico");
           System.out.println("");
            System.out.println("digite tipo de documento");
            tipodocumento=xd.next();
            System.out.println("digete documento");
            documento=xd.next();
            System.out.println("digite nombre");
            nombre=xd.next();
            System.out.println("digite apelido");
            apellido=xd.next();
            System.out.println("digite edad");
            edad=xd.nextInt();
            System.out.println("digite profecion");
            profecion=xd.next();
            System.out.println("digite asignatura");
            asignatura=xd.next();
            System.out.println("digite la fecha de inicio");
            fechainicio=xd.next();
            System.out.println("digite la fecha finalizacion");
            fechafin=xd.next();
            activo=true;
            ListaCatedra.add(new Catedratico(tipodocumento,documento,apellido, nombre, edad, activo, profecion, asignatura, fechainicio, fechafin));
            System.out.println("¿desea agrgar un docente catedratico mas? 1)si 2)no");
            decisiondosen=xd.nextInt();
             if(decisiondosen == 2){
               cicl = false;
           }
        }
        ArrayList<Planta> ListaPlanta = new ArrayList();
        boolean cic=true;
        int desplan=1;
        while(cic){
        String tipodocumento,documento,nombre,apellido,profecion,asignatura,fechaContrato;
        boolean activo=true;
        int edad,cantproyec;
        
        System.out.println("ingrese un docente de planta");
           System.out.println("");
        System.out.println("digite tipo de documento");
            tipodocumento=xd.next();
            System.out.println("digete documento");
            documento=xd.next();
            System.out.println("digite nombre");
            nombre=xd.next();
            System.out.println("digite apelido");
            apellido=xd.next();
            System.out.println("digite edad");
            edad=xd.nextInt();
            System.out.println("digite profecion");
            profecion=xd.next();
            System.out.println("digite asignatura");
            asignatura=xd.next();
            System.out.println("digite la fecha de contrato");
            fechaContrato=xd.next();
            System.out.println("digite la cantidad de proyectos");
            cantproyec=xd.nextInt();
            
            ListaPlanta.add(new Planta(tipodocumento, documento, apellido, nombre, edad, activo, profecion, asignatura, fechaContrato,cantproyec));
             System.out.println("¿desea agregar un docente de planta mas? 1)si 2)no");
            desplan=xd.nextInt();
             if(desplan == 2){
               cic = false;
           }
        }
        
        ArrayList<Administrativo> ListaAdministrativo = new ArrayList();
        boolean ci=true;
        int decisionadmin =1;
        while(ci){
        String tipodocumento,documento,nombre,apellido,cargo,fechacontrato;
        int edad;
        boolean activo =true;
        System.out.println("ingrese un administrativo");
           System.out.println("");
            System.out.println("digite tipo de documento");
            tipodocumento=xd.next();
            System.out.println("digete documento");
            documento=xd.next();
            System.out.println("digite nombre");
            nombre=xd.next();
            System.out.println("digite apelido");
            apellido=xd.next();
            System.out.println("digite edad");
            edad=xd.nextInt();
            System.out.println("digite el cargo");
            cargo=xd.next();
            System.out.println("digite la fecha de contrato");
            fechacontrato=xd.next();
                ListaAdministrativo.add(new Administrativo(tipodocumento, documento, apellido, nombre, edad, activo, cargo, fechacontrato));
            
          System.out.println("¿desea agrgar un administrativo mas? 1)si 2)no");
            decisionadmin=xd.nextInt();
             if(decisionadmin == 2){
               ci = false;
           }
        }
        System.out.println("lista de alumnos"); 
        for(int i =0; i<listaAlumnos.size(); i++){
           System.out.println(listaAlumnos.get(i).mostrar());          
        }
        System.out.println("lista de docentes catedraticos"); 
        for(int x=0;x<ListaCatedra.size();x++){
         System.out.println(ListaCatedra.get(x).mostrar());
        }
        System.out.println("lista de docentes de planta");
        for(int y=0;y<ListaPlanta.size();){
        System.out.println(ListaPlanta.get(y).mostrar());
        }
        System.out.println("lista de docentes de administrativos");
        for(int z=0;z<ListaAdministrativo.size();){
        System.out.println(ListaAdministrativo.get(z).mostrar());
         }
        int b;
        System.out.println("desea modificar algo");
        System.out.println("1)alumno");
        System.out.println("2)docente catedratico");
        System.out.println("3)docente de planta");
        System.out.println("4)administrativo");
        b=xd.nextInt();
        int d=0; 
        switch(b){
            case 1:
                d=d+1;
                boolean aluca=true;
            System.out.println("lista de alumnos"); 
            for(int i =0; i<listaAlumnos.size(); i++){
            System.out.println(listaAlumnos.get(i).mostrar());
            }
            while(aluca){
                int num;
                System.out.println("que alumno desea modificar");
                num=xd.nextInt();
                System.out.println();
            
            }
               break;
            case 2:
            System.out.println("lista de docentes catedraticos"); 
            for(int x=0;x<ListaCatedra.size();x++){
            System.out.println(ListaCatedra.get(x).mostrar());
            }
                break;
            case 3:
            System.out.println("lista de docentes de planta");
            for(int y=0;y<ListaPlanta.size();){
            System.out.println(ListaPlanta.get(y).mostrar());
            }
                break;
            case 4:
            System.out.println("lista de docentes de administrativos");
            for(int z=0;z<ListaAdministrativo.size();){
            System.out.println(ListaAdministrativo.get(z).mostrar());
            }
                break;
        }
        
    }
    
}
