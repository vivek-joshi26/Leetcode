package Matrix;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        System.out.println("Provide input for first matrix");
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        int[][] m1 = new int[r1][c1];

        for (int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                m1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Provide input for second matrix");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        int[][] m2 = new int[r2][c2];

        for (int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[0].length; j++){
                m2[i][j] = scanner.nextInt();
            }
        }

        if( c1 != r2)
           System.out.println("The column of first matrix does not match the rows of second matrix");
        else {
            int[][] res = new int[r1][c2];

            for( int i = 0; i < m1.length; i++){
                for(int j = 0; j < m2[0].length; j++){
                    int count = 0;
                    for(int k = 0; k < m2.length; k++){
                       count += m1[i][k] * m2[k][j];
                    }
                    res[i][j] = count;
                }
            }

            for(int i = 0; i < res.length; i++){
                for (int j = 0; j < res[0].length; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }

        }


    }
}
