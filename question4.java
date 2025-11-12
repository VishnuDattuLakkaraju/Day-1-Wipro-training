import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //write your answer here
         Scanner scanner = new Scanner(System.in);

       
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.print("No is Even");
        } else {
            System.out.print("No is odd");
        }

        scanner.close();
        }
}
