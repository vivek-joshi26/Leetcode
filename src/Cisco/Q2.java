package Cisco;

import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    public static String  expandedString(String inputStr)
    {
        //String  answer = "hello";
        // Write your code here
        Stack<String> stack = new Stack<>();
        String cur = "";
        String num = "";
        for(int i = 0; i < inputStr.length(); i++){
            System.out.println(stack);
            char c = inputStr.charAt(i);
            if(Character.isDigit(c)){
                num = num + c;
                continue;
            }

            if(Character.isAlphabetic(c)){
                cur = cur + c;
                continue;
            }

            if(c == '('){
                stack.push(cur);
                cur = "";
                continue;
            }

            if(c == '}'){
                int count = Integer.valueOf(num);
                num = "";
                String oldString = stack.pop();
                StringBuilder sb = new StringBuilder();
                while(count > 0){
                    sb.append(cur);
                    count--;
                }
                cur = oldString + sb.toString();
                System.out.println(sb);
            }



        }
        StringBuilder answer = new StringBuilder();
        System.out.println(stack);

        while(!stack.isEmpty()){
            System.out.println("Inside answer" + answer);
            answer.append(stack.pop());
        }
        answer.append(cur);

        return answer.toString();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // input for inputStr
        String inputStr = in.nextLine();

        String result = expandedString(inputStr);
        System.out.print(result);

    }
}
