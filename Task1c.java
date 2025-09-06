import java.util.*;

public class Task1c { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }

        System.out.println("The product of the array is: " + product);

        sc.close();
    }
}
