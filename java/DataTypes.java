import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer, double and string: ");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Integer: " +i);
        
        sc.close();
    }
}
