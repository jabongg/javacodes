package hackerrank.java.datastructures;




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueueUsingTwoStacks {

        private static Stack<Integer> stack1 = new Stack<Integer>();
        private static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            switch(value) {
                case 1: int x = scan.nextInt(); 
                        insertToQueue(x);
                         break;
                case 2: deleteFromQueue(); break;
                case 3: printHeadElement(); break;
            }
        }            
     }
    
    
    private static void insertToQueue(int x) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push((Integer) x);
    }
    
    private static void deleteFromQueue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        
        /* while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        } */
    }
    
    private static void printHeadElement() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
 
        System.out.println(stack2.peek());
    }
    
    
 /*       private static void insertToQueue(int x) {
            stack1.push((Integer) x);
        }
        
        private static void deleteFromQueue() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            stack1.pop();
            
            while (stack2.size() > 0) {
                stack1.push(stack2.pop());
            }
        }
        
        private static void printHeadElement() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            System.out.println(stack1.peek());
        }*/
}