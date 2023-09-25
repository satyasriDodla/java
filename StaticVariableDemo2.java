import java.io.*;
class CounterDemo {
    static int count=0;
    CounterDemo() { //Default constructor
    count++;
    System.out.println("count ="+count);
    } //constructor close
} //class close
public class StaticVariableDemo2 {
    public static void main(String args[]) {
        CounterDemo cd=new CounterDemo();
        CounterDemo cd1=new CounterDemo();
        CounterDemo cd2=new CounterDemo();
    }
}
