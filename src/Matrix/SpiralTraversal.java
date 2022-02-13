package Matrix;

import java.util.Scanner;

public class SpiralTraversal {

    public static void main(String[] args) {

        System.out.println("Provide input for matrix");
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        int[][] m1 = new int[r1][c1];

        for (int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                m1[i][j] = scanner.nextInt();
            }
        }


        int minrow = 0;
        int maxrow = m1.length - 1;
        int mincol = 0;
        int maxcol = m1[0].length - 1;
        int counterElements = 0;
        int totalElements = r1 * c1;

        while (counterElements < totalElements){
            // Left Side
            for(int i = minrow, j = mincol; i <= maxrow && counterElements < totalElements ; i++){
                System.out.println(m1[i][j]);
                counterElements++;
            }
            mincol++;

            // Bottom Side
            for(int i = maxrow, j = mincol; j <= maxcol && counterElements < totalElements; j++){
                System.out.println(m1[i][j]);
                counterElements++;
            }
            maxrow--;


            // Right Side
            for(int i = maxrow, j = maxcol; i >= minrow && counterElements < totalElements; i--){
                System.out.println(m1[i][j]);
                counterElements++;
            }
            maxcol--;


            // Top Side
            for(int i = minrow, j = maxcol; j >= mincol && counterElements < totalElements; j--){
                System.out.println(m1[i][j]);
                counterElements++;
            }
            minrow++;

        }


    }

}
