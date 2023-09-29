import java.io.*;

class ArrayDemo3 {
    static void Min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("The minimum element in the array is " + min);
    }

    public static void main(String args[]) {
        int a[] = { 99, 44, 22, 33, 77 };
        Min(a);
    }
}
