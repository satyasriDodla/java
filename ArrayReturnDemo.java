public class ArrayReturnDemo {
    static int[] max() {
        return new int[] {10,60,40,50,70};
    }
    public static void main(String args[]) {
        int arr[] = max();
        int m = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(m<arr[i]) {
                m=arr[i];
            }
        }
        System.out.println("The largest element in array is "+m);
    }
}
