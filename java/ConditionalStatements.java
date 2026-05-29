import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 100: ");
        int N = sc.nextInt();
        if (N % 2 != 0) {
            System.out.println("Weird i.e N is odd");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird i.e N is even and in between 2 to 5");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird i.e N is even and in between 6 & 20");
        } else {
            System.out.println("Not Weird i.e N is even and greater than 20");
        }
        sc.close();
    }
}
