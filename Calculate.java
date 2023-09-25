import java.io.*;
public class Calculate {
    static int Cube(int x) {
        return x*x*x;
    }
    public static void main(String args[]) {
        int result=Calculate.Cube(2);    //int result=Cube(2);
        System.out.println("Cube of 2 is "+result);
    }
}
