import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Bitcoin to USD exchange rate?");
        double btc  = scanner.nextDouble();
        System.out.println("How much USD do you want to change?");
        double usd = scanner.nextDouble();
        System.out.println("You can buy:  " + usd/btc + " BTC");
    }
}
