import java.util.Scanner;
import java.util.Arrays;

public class P3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number of elements you want in an array: ");
        int n = inp.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " th number: ");
            arr[i] = inp.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        inp.close();
    }
}
