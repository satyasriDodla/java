import java.io.*;
class Adder {
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class MethodOverLodingDemo1 {
    public static void main(String args[]) {
        Adder ad=new Adder();
        int x=ad.add(5,0);
        int y=ad.add(10,20,30);
        int z=ad.add(x,y);
        System.out.println("x value is"+x);
        System.out.println("y value is"+y);
        System.out.println("z value is"+z);
    }
}
