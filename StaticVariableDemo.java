import java.io.*;
class Student {
    int rollno; //this is instance variable
    String name;
    static String college="SITE";
    Student(int r,String n) {
        rollno=r;
        name=n;
    }
    void display() {
        System.out.println(rollno+" "+name+" "+college+" ");
    }
}
public class StaticVariableDemo {
    public static void main(String args[]) {
        Student s1=new Student(4219,"poorna");
        Student s2=new Student(4225,"hema");
        System.out.println("student details are");
        s1.display();
        s2.display();
    } 
}
