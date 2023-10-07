import java.io.*;
import java.util.*;
public class MatrixAddition {
    public static void main(String args[]) {
        int arr[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int c=sc.nextInt();
        System.out.println("Enter the number of column :  ");
        int r=sc.nextInt();
        int b[][]=new int[r][c];
        int a[][]=new int[r][c];
        int C[][]=new int[r][c];
        System.out.println("Total no of elements in the matrix ");
        System.out.println("Enter "+(r+c)+"elements into matrix A :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter"+(r+c)+"elements into matrix B :");
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
            C[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The resultant matrix is :");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                System.out.println(C[i][j]+" ");
            }
        }
        System.out.println();
    }
}
