import java.io.*;
public class ArrayDemo {
    public static void main(String args[]) {
        int a[];
        a=new int[5];
        a[0]=11;
        a[1]=22;
        a[2]=33;
        a[3]=44;
        a[4]=55;
        System.out.println("the array elements are ");
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
