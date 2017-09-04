package hackerrank.java.datastructures;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class onceInATram {

    static String onceInATram(int x) {
        // Complete this function
      int[] digit = new int[6];
      
        for (int i = digit.length - 1; i >= 0;  i--) {
            digit[i] = x % 10;
            x = x / 10;
        }

		System.out.println(digit[0] + " " + digit[1] + " " + digit[2] + " "
				+ digit[3] + " " + digit[4] + " " + digit[5]);
		
		
		return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
