import java.io.*;
interface Printable{
    void print();
}
public class InterfaceDemo1 implements Printable{
    public void print(){
        System.out.println("method body");
    }
    public static void main(String args[]){
        InterfaceDemo1 id = new InterfaceDemo1();
        id.print();
    }
}
