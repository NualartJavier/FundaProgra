/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class UsoString {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String cadena = intro.nextLine();
        imprimirResultados(cadena);
    }

    public static void imprimirResultados(String str) {
        System.out.println("Largo de cadena es: " + largoCadena(str));
        System.out.println("Cantidad de vocales es: " + contarVocales(str));
        System.out.println("Cantidad de consonantes es: " + contarConsonantes(str));
        System.out.println("La cadena invertida es " + invertirString(str));
        System.out.println("Ingrese un char ");
        if (existeChar(str, leerChar()) == true) {
            System.out.println("El char ingresado SI esta en el String");
        } else {
            System.out.println("El char ingresado NO esta en el String");
        }
        System.out.println("Ingrese una cadena");
         if (existesubString(str, leerSub()) == true) {
            System.out.println("La sub cadena ingresada SI se encuentra en la cadena String");
        } else {
            System.out.println("La sub cadena ingresada NO se encuentra en la cadena String");
        }
         System.out.println("El siguiente arreglo Char contiene c/u de los caracteres de la cadena");
         System.out.println(crearArrayChar(str));
    }
    public static String leerSub(){
    Scanner intro = new Scanner(System.in);
    String sub=intro.nextLine();
    return sub;
    }
    public static char leerChar() {
        Scanner intro = new Scanner(System.in);
        char cha = intro.nextLine().charAt(0);
        return cha;
    }

    public static int largoCadena(String str) {
        int leng;
        leng = str.length();
        return leng;
    }

    public static int contarVocales(String str) {
        String voc = "aeiou";
        int cantVoc = 0;
        for (int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            if (voc.contains(letra + "")) {
                cantVoc++;
            }
        }
        return cantVoc;
    }

    public static int contarConsonantes(String str) {
        String voc = "aeiou";
        int cantCon = 0;
        for (int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            if (voc.contains(letra + "")) {

            } else {
                cantCon++;
            }
        }
        return cantCon;
    }

    public static String invertirString(String str) {
        String inver = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inver = inver + str.charAt(i);
        }
        return inver;
    }

    public static boolean existeChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean existesubString(String str, String substr) {
        if (str.indexOf(substr) != -1) {
            return true;
        }
        return false;
    }

    public static char[] crearArrayChar(String str) {
        char array[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        return array;
    }
}
