import java.io.*;
import java.util.*;
public class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 3 students");
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float s3=sc.nextFloat();
        float total=s1+s2+s3;
        float avg=total/3;
        System.out.println("The marks of students is "+total);
        if(avg>=75)
        {
            System.out.println("Student average is "+avg+" student passed with distinction");
        }
        else if(avg>=60 && avg<75)
        {
            System.out.println("Student average is "+avg+" student passed in first class");
        }
        else
        {
            System.out.println("Student is failed in exam");
        }
    }
}
