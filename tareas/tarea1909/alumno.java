
/**
 * Write a description of class alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String rut;
    private String matricula;
    datos dat = new datos();
    /**
     * Constructor for objects of class alumno
     */
    public alumno()
    {
        nombre="juan";
        apellido="ruiz";
        rut="1.111.111-2";
        matricula="12342324415";
    }
    public alumno(String n,String a,String r,String m)
    {
        nombre=n;
        apellido=a;
        rut=r;
        matricula=m;
    }
    public void setNombre(String name){
    nombre=name;
    }
    public String getNombre(){
     return nombre;
    }
    public void setApellido(String ap){
    apellido=ap;
    }
     public String getApellido(){
     return apellido;
    }
    public void setRut(String ru){
    rut=ru;
    }
     public String getRut(){
     return rut;
    }
    public void setMatricula(String mat){
     matricula=mat;
    }
    public String getMatricula(){
     return matricula;
    }
    public void main(){
     System.out.println("Ingrese el nombre");
     setNombre(nomAp());
     System.out.println("Ingrese el apellido");
     setApellido(nomAp());
     setRut(rut());
     setMatricula(matricula());
    }
    public String nomAp(){
     String n="";
     do{
        n=dat.leer();
        }while(dat.valNom(n)==false);
       return n; 
    }
    public String rut(){
     String n="";
     do{
         System.out.println("Ingrese el rut");
        n=dat.leer();
        }while(dat.valRut(n)==false);
       return n; 
    }
    public String matricula(){
     String n="";
     do{
         System.out.println("Ingrese la matricula");
        n=dat.leer();
        }while(dat.valMat(n)==false);
       return n; 
    }
    public String toString(){
     String cadena="\nNombre: "+this.nombre+"\nApellido: "+this.apellido+"\nRut :"+this.rut+"\nMatricula :"+this.matricula;
        return cadena;
    }
}
