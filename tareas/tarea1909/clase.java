import java.util.ArrayList;
/**
 * Write a description of class clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clase
{
    // instance variables - replace the example below with your own
    private int cantAl;
    ArrayList<alumno> clase = new ArrayList<alumno>();
    datos dat = new datos();
    /**
     * Constructor for objects of class clase
     */
    public clase()
    {
     cantAl=0;
    }
    public void setCantAl(int c){
    cantAl=c;
    }
    public int getCantAl(){
    return cantAl;
    }
    public void main(){
       int op=0;
     do{
       do{
         menu();
        op=dat.leerInt();
        }while(dat.val1(op)==false);
        ejecMenu(op);
        }while(op !=4);
    }
    public void menu(){
     System.out.println("__________________________________________");   
     System.out.println("Eliga la opcion a realizar en la clase");   
     System.out.println("(1)Añadir alumno");
     System.out.println("(2)Buscar alumno");
     System.out.println("(3)Mostrar clase");
     System.out.println("(4)Salir");
    }
    public void ejecMenu(int op){
        
     switch(op){
        case 1:System.out.println("Nuevo alumno");
        añadir();
        setCantAl(cantAl+1);break;
        case 2:buscar();break;
        case 3:System.out.println(toString());
        mostrarClase();break;
        }
    }
    public void añadir(){
     alumno al=new alumno();
     clase.add(al);
     clase.get(getCantAl()).main();
    }
    public void buscar(){
        System.out.println("Ingrese el rut del alumno que desee buscar");
        String run="";
        boolean busc=false;
        do{
            run=dat.leer();
        }while(dat.valRut(run)==false);
     for(int i=0;i<clase.size();i++){
        if(run.equals(clase.get(i).getRut())){
            System.out.println("Alumno encontrado¡¡¡¡");
            ejecAl(i);
            busc=true;break;
        }
        }
        if(busc==false){System.out.println("El alumno no se encuentra registrado en la clase");}
    }
    public void menuAl(){
      System.out.println("(1)Mostrar alumno");
      System.out.println("(2)Eliminar alumno");
      System.out.println("(3)Volver");
    }
    public void ejecAl(int n){
     int op=0;
     do{
      do{
        menuAl();
        op =dat.leerInt();
        }while(dat.val2(op)==false);
      switch(op){
         case 1:System.out.print(clase.get(n).toString());break;
         case 2:clase.remove(n);
         System.out.println("Alumno borrado..");
         setCantAl(cantAl-1);break;
         }
     }while(op==1);
    }
    public String toString(){
     String cadena="\nCantidad de alumnos : "+this.cantAl;
        return cadena;
    }
    public void mostrarClase(){
     for(int i=0;i<clase.size();i++){
        System.out.println(clase.get(i).toString());
        }
    }
}
