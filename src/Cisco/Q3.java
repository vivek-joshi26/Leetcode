package Cisco;

import java.util.Scanner;

public class Q3 {

    public static String  checkIPValidity(String addressIP)
    {
        String  resValid = "VALID";
        // Write your code here
        String  resInValid = "INVALID";

        if(addressIP == null || addressIP.isEmpty())
            return resInValid;

        String[] section = addressIP.split("\\.");
        if(section.length != 4)
            return resInValid;

        for(String single: section){
            int value = Integer.parseInt(single);
            if(value < 0 || value > 255)
                return resInValid;
        }

        if(addressIP.endsWith("."))
            return resInValid;

        return resValid;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // input for addressIP
        String addressIP = in.nextLine();

        String result = checkIPValidity(addressIP);
        System.out.print(result);

    }


}
