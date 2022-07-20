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
        Boolean changed = true;
        // bubble sort
        while (changed) {
            changed = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    changed = true;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        inp.close();
    }
}
