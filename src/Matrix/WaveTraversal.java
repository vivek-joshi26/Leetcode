package Matrix;

import java.util.Scanner;

public class WaveTraversal {

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

        for(int i = 0; i < m1[0].length; i++){
            if( i % 2 == 0){
                for(int j = 0; j < m1.length; j++){
                    System.out.println(m1[j][i]);
                }
            }
            else {
                for(int j = m1.length - 1; j >= 0; j--){
                    System.out.println(m1[j][i]);
                }
            }

        }


    }
}
