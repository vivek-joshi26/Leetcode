package Matrix;

import java.util.Scanner;

public class Rotate90 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        int[][] m1 = new int[r1][c1];

        for (int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                m1[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        // We have to first transpose the matrix, where m1[i][j] = m1[j][i], or we can say it is symmetric along the diagonal
        for(int i = 0; i < m1.length; i++){
            for(int j = i; j < m1[0].length; j++){
                int temp = m1[i][j];
                m1[i][j] = m1[j][i];
                m1[j][i] = temp;
            }
        }

        // After transposing
        for(int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        // Now step 2 once we transpose the matrix then we can revers each array individually
        for(int i = 0; i < m1.length; i++){
            int lo = 0;
            int hi = m1[0].length - 1;
            while (lo < hi){
                int temp = m1[i][lo];
                m1[i][lo] = m1[i][hi];
                m1[i][hi] = temp;
                lo++;
                hi--;
            }
        }

        // After Rotating
        for(int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
    }


}
