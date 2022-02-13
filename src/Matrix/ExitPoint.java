package Matrix;

import java.util.Scanner;

public class ExitPoint {

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

        char dir = 'e';
        int i = 0, j = 0;
        while (true){
            int cur = m1[i][j];
            if(dir == 'e'){
                if(cur == 1){
                    dir = 's';
                    i++;
                }
                else j++;
            }
            else if(dir == 's'){
                if(cur == 1){
                    dir = 'w';
                    j--;
                }
                else i++;
            }
            else if(dir == 'w'){
                if(cur == 1){
                    dir = 'n';
                    i--;
                }
                else j--;
            }
            else if(dir == 'n'){
                if(cur == 1){
                    dir = 'e';
                    j++;
                }
                else i--;
            }
            if( i < 0){
                i++;
                break;
            }
            else if( i == r1){
                i--;
                break;
            }
            else if(j < 0){
                j++;
                break;
            }
            else if(j == c1){
                j--;
                break;
            }
        }

        System.out.println(i + "," + j);
    }

}
