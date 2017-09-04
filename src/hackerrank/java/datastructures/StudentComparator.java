package hackerrank.java.datastructures;


import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class StudentSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() > s2.getCgpa()) {
            return -1;
        } else if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        } else {
            if (s1.getFname().equals(s2.getFname())) {
               if (s1.getId() > s2.getId()) {
                   return 1;
               } else if (s1.getId() < s2.getId()) {
                   return -1;
               } else {
                   return 0;
               }
            } else {
                return s1.getFname().compareTo(s2.getFname());
            }
        }
    }
}

//Complete the code
public class StudentComparator {

   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      
      Collections.sort(studentList, new StudentSort());
       
         for(Student st: studentList){
         System.out.println(st.getId() + " " + st.getFname() + " " + st.getCgpa());
      }
   }
}
