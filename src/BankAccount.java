import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Vinícius Moraes";
        String accountType = "Checking account";
        double balance = 2500.00;
        int option = 0;

        String showMenu = """
                \nOperations:
                
                1 - Check balance
                2 - Receive value
                3 - Transfer value
                4 - Exit
                """;

        System.out.println("\n--------------------------------------------");
        System.out.println("Initial customer data:\n");
        System.out.println("Name:                   " + name);
        System.out.println("Account Type:           " + accountType);
        System.out.println("Opening Balance:        $" + balance);
        System.out.println("--------------------------------------------");

        while (option != 4) {
            System.out.println(showMenu);
            System.out.print("Enter your option: ");
            option = input.nextInt();

            if (option == 1) {
                System.out.println("\nYour current balance is: " + balance);
            } else if (option == 2) {
                System.out.print("\nEnter the amount to be received: ");
                int amountReceived = input.nextInt();
                balance += amountReceived;
            } else if (option == 3) {
                System.out.print("\nEnter the amount you want to transfer: ");
                int amountTransferred = input.nextInt();
                if (amountTransferred > balance) {
                    System.out.println("\nYou don't have that amount of money!");
                }
                balance -= amountTransferred;
            } else if (option != 4) {
                System.out.println("\nInvalid option!");
            }
        }
    }
}
