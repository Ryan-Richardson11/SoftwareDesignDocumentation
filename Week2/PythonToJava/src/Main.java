import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program computes the square of an Integer");
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int n = input.nextInt();
        int acc = 0;
        int odd = 1;
        for (int i = 0; i < n; i++) {
            acc += odd;
            odd += 2;
        }
        System.out.println("The square root of " + n + " is " + acc);
        input.close();
    }
}
