package hackerrank.java.datastructures;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class JavaList {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        ArrayList<Integer> L = new ArrayList<Integer>();
	        int N = scan.nextInt();
	       
	        for (int i = 0; i < N; i++) {
	            L.add(scan.nextInt());
	        }
	       //  System.out.println(L);
	        int Q = scan.nextInt();
	        
	        for (int i = 0; i <  Q; i++) {
	            String S = scan.next();
	            
	            if (S.equals("Insert")) {
	                int a = scan.nextInt();
	                int b = scan.nextInt();
	                L.add(a, b);
	            }
	           
	            if (S.equals("Delete")) {
	                int a = scan.nextInt();
	                L.remove(a);
	            }
	          
	      }
	        
	          System.out.println(L);
	    }
	}
