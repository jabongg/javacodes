package hackerrank.java.datastructures;


//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class JavaMap {
  
 public static void main(String []argh)
 {
    Map<String, Integer> map = new HashMap<String, Integer>();
   
     Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    for(int i=0;i<n;i++)
    {
       String name=in.nextLine();
       int phone=in.nextInt();
       in.nextLine();
        map.put(name, phone);
    }
     
    while(in.hasNext())
    {
       String s=in.nextLine();
       for(Map.Entry<String, Integer> entry: map.entrySet()) {
          if(s.equals(entry.getKey())) {                
              System.out.println(entry.getKey() + "=" + entry.getValue());
              break; //breaking because its one to one map
          } else {
              System.out.println("Not found");
              break;
          }
      }        
  }
     
 }
}
