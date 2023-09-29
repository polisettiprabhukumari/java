import java.io.*;

class ArrayDemo5 {
    static void Max(int arr[]) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (m < arr[i])
                m = arr[i];
        }
        System.out.println("The maximum element in the array is " + m);
    }

    public static void main(String args[]) {
        Max(new int[] { 99, 44, 22, 33, 77 });
        // anonymous int array : new int[] { 1, 2, 3, 4};
        // int a[]={99,44,22,33,77};
        // Max(a);
    }
}
