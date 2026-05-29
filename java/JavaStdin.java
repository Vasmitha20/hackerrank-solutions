import java.util.Scanner;

public class JavaStdin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}
