import java.io.*;
class Student {
    int rollno;
    String name;
    static String College="SITE";
    static void ChangeCollege() {
        College="SASI";
    }
    Student(int r,String n) {  //parameterised constructor
    rollno=r;
    name=n;
    }
    void display() {
        System.out.println(rollno+" "+name+" "+College+" ");
    }
}
public class StaticMethodDemo1{
    public static void main(String args[]) {
        Student s1=new Student(4219,"poorna");
        Student.ChangeCollege();
        Student s2=new Student(4225,"Hema");
        System.out.println("Student details are ");
        s1.display();
        s2.display();
    }
}
