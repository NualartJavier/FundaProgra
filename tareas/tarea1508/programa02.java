/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author juan
 */
public class programa02 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int op;
        do {
            int matriz[][] = new int[3][3];
            llenado(matriz);
            System.out.println("Cuadrado magico");
            mostrado(matriz);
            if (evaluacion(matriz) == true) {
                System.out.println("La matriz si cumple con un cuadrado magico");
            } else {
                System.out.println("La matriz no cumpe con un cuadrado magico");
            }
            System.out.println("Para generar una nueva matriz preisione (1)");
            System.out.println("Para salir preisione (2)");
            op = intro.nextInt();
        } while (op != 2);
    }

    public static void llenado(int matriz[][]) {
        Random rnd = new Random();
        int array[] = new int[9];
        int j = 0, i = 0;
        array[i] = (int) (rnd.nextDouble() * 9 + 1);
        for (i = 1; i < array.length; i++) {
            array[i] = (int) (rnd.nextDouble() * 9 + 1);
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    i--;
                }
            }
        }
        int k = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = array[k];
                k++;
            }

        }

    }

    public static void mostrado(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(+matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean evaluacion(int matriz[][]) {
        if (matriz[0][0] + matriz[1][0] + matriz[2][0] == 15 && matriz[0][0] + matriz[0][1] + matriz[0][2] == 15 && matriz[2][0] + matriz[2][1] + matriz[2][2] == 15 && matriz[0][2] + matriz[1][2] + matriz[2][2] == 15 && matriz[0][1] + matriz[1][1] + matriz[2][1] == 15 && matriz[0][0] + matriz[1][1] + matriz[2][2] == 15) {
            return true;
        }
        return false;
    }
}
