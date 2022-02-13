package Matrix;
// Saddle Price is the value which is minimum in the row and maximum in the column, only 1 saddle price present in the matrix


import java.util.Scanner;

public class SaddlePrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] m = new int[r][c];
        for (int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < m.length; i++){
            int min = m[i][0];
            int col = 0;
            for (int j = 0; j < m[0].length; j++){
                if(m[i][j] < min){
                    min = m[i][j];
                    col = j;
                }
            }
            boolean saddle = true;
            for (int k = 0; k < m.length; k++){
                if(m[k][col] > min) {
                    saddle = false;
                    break;
                }
            }
            if(saddle == true){
                System.out.println("Saddle is: " + min);
                return;
            }
        }



    }


}
