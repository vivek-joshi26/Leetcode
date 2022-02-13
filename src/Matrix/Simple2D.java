package Matrix;

import java.util.Scanner;

public class Simple2D {

    public void printArray(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // number of rows
        int m = scanner.nextInt();  // number of columns

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = scanner.nextInt();  // get the input from the user
            }
        }

        // for printing
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a simple 3*4 2 d array and add values to it

        int[][] arr = new int[3][4];
        int count = 11;
        for (int i = 0; i < 3; i++){
            for( int j = 0; j < 4; j++){
                arr[i][j] = count;
                count++;
            }
        }

        /*
        for (int i = 0; i < 3; i++){
            for( int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

         */

        //taking input from the user

        Simple2D simple2D = new Simple2D();
        simple2D.printArray();


    }


}
