class A {
    A() { //default constructor
    System.out.println("inside default constructor");
    }
    A(int x) {
        this();
        System.out.println("Inside the parameterised constructor invoke");
        System.out.println("x value is "+x);
    }
}
public class ThisConstructorDemo {
    public static void main(String args[]) {
        A a=new A(4219); 
    } 
}
