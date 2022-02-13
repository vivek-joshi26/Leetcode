package Matrix;

import java.util.Scanner;

public class RingRotate {

    /*

        Find the Shell, similar to the Spiral traversal question, and return 1 d array with shell elements.
        - If we analyse the shell the minr and minc is always s-1 and maxr and maxc is arr.len -1 and arr[0].len - 1

     */



    public static void Rotate(int[][] arr, int s, int r){
        int[] oneD = FindOneDFromShell(arr,s);
        RotateOneD(oneD,r);
        UpdateShellFromOneD(arr,s,oneD);
    }

    public static int[] FindOneDFromShell(int[][] arr, int s){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int oneDLen = 2 *((maxr - minr) + (maxc - minc));
        int[] oneD = new int[oneDLen];
        int index = 0;
        // populate the oneD array

        for(int i = minr, j = minc; j <= maxc; j++ ){
            oneD[index] = arr[i][j];
            index++;
        }
        for(int i = minr + 1, j = maxc; i <= maxr; i++){
            oneD[index] = arr[i][j];
            index++;
        }
        for( int i = maxr, j = maxc - 1; j >= minc; j--){
            oneD[index] = arr[i][j];
            index++;
        }
        for (int i = maxr - 1, j = minc; i >= minr + 1; i--){
            oneD[index] = arr[i][j];
            index++;
        }
        return oneD;
    }


    public static void RotateOneD(int[] oneD, int r){
        r = r % (oneD.length);
        reverse(oneD, 0 , oneD.length - 1 -r);
        reverse(oneD, oneD.length - r, oneD.length - 1);
        reverse(oneD,0, oneD.length);
    }

    public static void reverse(int[] oneD, int lo, int hi){
        while (lo < hi){
            int temp = oneD[lo];
            oneD[lo] = oneD[hi];
            oneD[hi] = temp;
            lo++;
            hi--;
        }
    }


    public static void UpdateShellFromOneD(int[][] arr, int s, int[] oneD){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int index = 0;
        // populate the oneD array

        for(int i = minr, j = minc; j <= maxc; j++ ){
            arr[i][j] = oneD[index] ;
            index++;
        }
        for(int i = minr + 1, j = maxc; i <= maxr; i++){
            arr[i][j] = oneD[index] ;
            index++;
        }
        for( int i = maxr, j = maxc - 1; j >= minc; j--){
            arr[i][j] =  oneD[index] ;
            index++;
        }
        for (int i = maxr - 1, j = minc; i >= minr + 1; i--){
            arr[i][j] =  oneD[index] ;
            index++;
        }
    }


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

        System.out.println("Provide Shell and rotations");
        int s = scanner.nextInt();
        int r = scanner.nextInt();


    }


}
