package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for a length matriz: ");
        int n = sc.nextInt();

        // Fazendo a matriz
        int[][] matriz = new int[n][n];
        List<Integer> listNegativeNumbers = new ArrayList<>();

        // Exemplo:
        // n = 3
        // matriz  = [] [] []
        //           [] [] []
        //           [] [] []

        // Pegando valores para a matriz
        for( int i = 0; i < n; i++ ){
            for( int j = 0; j < n; j++ ){
                matriz[i][j] = sc.nextInt();
            }
        }

        // Diagonal
        System.out.println("Main diagonal: ");
        for( int i = 0; i < n; i++ ){
            System.out.print(matriz[i][i] + "\t");
        }


        // Números negativos
        int count = 0;
        for( int i = 0; i < n; i++ ){
            for( int j = 0; j < n; j++ ){
                if( matriz[i][j] < 0 ){
                    count++;
                    listNegativeNumbers.add( matriz[i][j] );
                }
            }
        }
        System.out.println();
        System.out.println("Total negative numbers: " + count);
        System.out.println("Negative numbers: " + listNegativeNumbers);

        sc.close();
    }
}
