import java.io.*;
class Student {
    int Rollno;
    String Name;
    float Fee;
    Student(int Rollno,String Name,float Fee)
    {
        Rollno=Rollno;
        Name=Name;
        Fee=Fee;
    }
    void display() {
        System.out.println("Student details are ");
        System.out.println(Rollno+" "+Name+" "+Fee);
    }
}
public class ThisDemo1{
    public static void main(String args[]){
        Student s1=new Student(4219,"Satya",45700);
        Student s2=new Student(4225,"Hema",45700);
        s1.display();
        s2.display();
    }
}
