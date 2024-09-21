package com.pstag;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//
//        for (int i = 0; i < 3; i++) {
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            //Complete this line
//            String leftJust = s1;
//            while (leftJust.length() < 15) {
//                leftJust = leftJust + " ";
//            }
//
//            String num = Integer.toString(x);
//            while(num.length() < 3) {
//                num = "0" + num;
//
//            }
//
//            System.out.println(leftJust + num);
//        }
//
//        System.out.println("================================");

        // Complete the function
    calculateAnagram("ANAGRAM","anagram");
    }

    private static void calculateAnagram(String a, String b) {
        String lowA = a.toLowerCase();
        String lowB = b.toLowerCase();

        char[] aArray = lowA.toCharArray();
        char[] bArray = lowB.toCharArray();
        System.out.println(lowB);


        int count =0;
        for(int i =0;i<a.length();i++)
        {
            for(int j= 0;j<b.length();j++)
            {
                if(aArray[i]==bArray[i])
                {
                    count++;
                }
            }
        }
        if(count==aArray.length)
        {
            System.out.println("ANAGRAM");
        }
        else{

            System.out.println("Not ANAGRAM");
        }

    }
    }



