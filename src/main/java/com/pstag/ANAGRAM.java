package com.pstag;

import java.util.Scanner;

public class ANAGRAM {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean isAnagram = false;
        if(a!=null && b!=null && a.length()==b.length())
        {
            //use string builder and check if string builder index
            StringBuilder sb = new StringBuilder(a);
            char[] chrb= b.toCharArray();

            for(Character c:chrb)
            {
                int index = sb.indexOf(""+c);
                if(index!= -1)
                {
                    sb.deleteCharAt(index);
                }
            }
            if(sb.length()==0)
            {
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}