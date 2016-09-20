import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 * Write a description of class datos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class datos
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class datos
     */
    public datos()
    {
        // initialise instance variables
        x = 0;
    }
    public String leer(){
        Scanner intro = new Scanner(System.in);
        String cadena=intro.nextLine();
        return cadena;
        } 

    public static boolean valRut(String oper)
    {
        Pattern pat = Pattern.compile("^\\d{2}"+"\\."+"\\d{3}"+"\\."+"\\d{3}"+"-"+"(\\d{1}|k{1})$");
        Matcher mat = pat.matcher(oper);
        if (mat.matches()==false) {
            System.out.println("Rut ingresado incorrecto. intente de nuevo.");
            return false;
        }
        return true;
    }
     public static boolean valMat(String oper)
    {
        Pattern pat = Pattern.compile("^\\d{8}"+"(\\d{1}|k{1})"+"\\d{2}$");
        Matcher mat = pat.matcher(oper);
        if (mat.matches()==false) {
            System.out.println("Matricula ingresada incorrecto. intente de nuevo.");
            return false;
        }
        return true;
    }
    public static boolean valNom(String oper)
    {
        Pattern pat = Pattern.compile("^[a-zA-Z]+$");
        Matcher mat = pat.matcher(oper);
        if (mat.matches()==false) {
            System.out.println("Incorrecto. intente de nuevo.");
            return false;
        }
        return true;
    }
    public int leerInt(){
     int num=0;
        try{    
            Scanner intro = new Scanner(System.in);
            num=intro.nextInt();
        }catch(Exception e){System.out.println("Lo que ha ingresado esta incorrecto, intente denuevo"); }
    return num;
    }
    public boolean val1(int op){
    if(op>0&&op<5){return true;}else{
        System.out.println("Opcion ingresada invalida, intente denuevo");
        }
        return false;
    }
    public boolean val2(int op){
    if(op>0&&op<4){return true;}else{
        System.out.println("Opcion ingresada invalida, intente denuevo");
        }
        return false;
    }
}