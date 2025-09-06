import java.util.*;
public class Task1b { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
 
        int original = n; 
 
        if (n <= 0) { 
            System.out.println(original + " is not an ugly number"); 
            return; 
        } 
        while (n % 2 == 0) { 
            n = n / 2; 
        } 
        while (n % 3 == 0) { 
            n = n / 3; 
        } 
        while (n % 5 == 0) { 
            n = n / 5; 
        } 
        if (n == 1) { 
            System.out.println(original + " is an ugly number"); 
        } else { 
            System.out.println(original + " is NOT an ugly number"); 
        } 
    } 
} 