import java.io.*;

class ArrayDemo4 {
    static int[] getarray() {
        int a[] = { 99, 44, 22, 33, 55, 77 };
        return (a);
    }

    public static void main(String args[]) {
        int arr[] = getarray();
        System.out.println("The array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
