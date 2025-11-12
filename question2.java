import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        
        boolean andResult = a && b;   // Logical AND
        boolean orResult = a || b;    // Logical OR
        
        System.out.println(andResult);
        System.out.println(orResult);
        }
}
