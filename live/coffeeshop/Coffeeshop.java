import java.util.Scanner;

public class Coffeeshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ask the user for their balance
        //ask the user if they want expresso or americano
        //ask the user how many they want
        //if the user inputs - or a negative number, produce no output
        //if the user cannot afford the number of coffee requested, produce no output
        //if user should get a different message depending on the type of coffee they purchased

        System.out.println("whats your balance");
        String balanceInput = sc.nextLine();
        double balance = Double.parseDouble(balanceInput);
        System.out.println("what type of coffee do you want?");
        String coffeeInput = sc.nextLine();
        System.out.println("how many do you want?");
        String amountInput = sc.nextLine();
        int amount = Integer.parseInt(amountInput);

    }
}