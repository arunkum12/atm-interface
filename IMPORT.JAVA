import java.util.Scanner;

public class ATM {
    private static int balance = 10000; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("Choose the operation you want to perform: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your money.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Your money has been successfully deposited.");
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}