package Cisco;

import java.util.Scanner;

public class Q1 {

    public static int  maximumDifference(int[] inputArr)
    {
        int  answer = 0;
        int n = inputArr.length;
        // Write your code here
        if(n == 1)
            return answer;

        answer = inputArr[1] - inputArr[0];
        int min_element = inputArr[0];

        for(int i = 1; i < n; i++){
            if(inputArr[i] - min_element > answer)
                answer = inputArr[i] - min_element;
            if(inputArr[i] < min_element)
                min_element = inputArr[i];
        }


        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //input for inputArr
        int inputArr_size = in.nextInt();
        int inputArr[] = new int[inputArr_size];
        for(int idx = 0; idx < inputArr_size; idx++)
        {
            inputArr[idx] = in.nextInt();
        }

        int result = maximumDifference(inputArr);
        System.out.print(result);

    }
}
