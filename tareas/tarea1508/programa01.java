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
public class programa01 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int op;
        do {
            int k;
            do {
                System.out.println("Ingrese la cantidad de encuestados ");
                k = intro.nextInt();
                if (k <= 0) {
                    System.out.println("Cantidad ingresada invalida, intente otra vez");
                }
            } while (k > 0);
            char matriz[][] = new char[2][k];
            llenado(matriz, k);
            impDatos(matriz);
            do {
                System.out.println("(1)- Para realisar un nuevo almacenamiento de respuestas");
                System.out.println("(2)- Para salir");
                op = intro.nextInt();
                if (op < 1 || op > 2) {
                    System.out.println("Opcion invalida, intente otra vez");
                }
            } while (op < 1 || op > 2);

        } while (op == 2);
    }

    public static void llenado(char matriz[][], int k) {
        Scanner intro = new Scanner(System.in);
        int op;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("--------------------------------------------------");
                System.out.println("Individuo N " + (j + 1));
                System.out.println("Seleccione el genero (1)Masculino (2)Femenino");
                do {
                    op = intro.nextInt();
                    if (op < 1 || op > 2) {
                        System.out.println("Opcion invalida, intente otra vez");
                    }
                } while (op < 1 || op > 2);
                if (op == 1) {
                    System.out.println("Ingrese la respuesta (s)Si (n)No (x)No sabe");
                    matriz[0][j] = intro.next().charAt(0);
                    matriz[1][j] = 'u';
                } else if (op == 2) {
                    System.out.println("Ingrese la respuesta (s)Si (n)No (x)No sabe");
                    matriz[1][j] = intro.next().charAt(0);
                    matriz[0][j] = 'u';
                }
            }
            break;
        }
    }

    public static void impDatos(char matriz[][]) {
        int h = 0, m = 0, p = 0, mS = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[0][j] == 's') {
                    h++;
                }
                if (matriz[0][j] == 's' || matriz[0][j] == 'n' || matriz[0][j] == 'x') {
                    p++;
                }
                if (matriz[1][j] == 's' || matriz[1][j] == 'n' || matriz[1][j] == 'x') {
                    p++;
                    if (matriz[1][j] == 's') {
                        mS++;
                    }
                }
                if (matriz[1][j] == 'n') {
                    m++;
                }
            }
            break;
        }
        System.out.println(p + " Personas participaron en la encuesta");
        System.out.println(h + " Hombres aprueban la gestion del gobierno");
        System.out.println(m + " Mujeres desaprueban la gestion del gobierno");
        System.out.println((h + mS) * 100 / p + "% de los participantes aprueban la gestion del gobierno");
    }

}
