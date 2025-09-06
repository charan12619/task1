import java.util.*; 
public class Task1a { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt(); 
 
        int result = (int) Math.sqrt(x); 
 
        System.out.println("Square root of " + x + " (rounded down) = " + result); 
    } 
} 
