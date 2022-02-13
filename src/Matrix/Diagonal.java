package Matrix;

import java.util.Scanner;

public class Diagonal {

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

            for( int j = i, k = 0; j < m1[0].length ; j++,k++){
                System.out.print(m1[k][j] + ", ");
            }
        }

    }


}
