import java.util.Scanner;

public class Main {

    public static double calculateAmount(double amount) {
        if (amount >= 1000)
            return amount - (amount * 0.10);
        else
            return amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.println("Final Amount = "
                + calculateAmount(amount));
    }
}