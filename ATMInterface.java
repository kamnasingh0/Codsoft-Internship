
import java.util.Scanner;

public class ATMInterface {
    // initial balance, PIN, and other details
    private static double balance = 10000.00;
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userPin;
        int choice;
        boolean exit = false;

        System.out.println("==================================");
        System.out.println("       💳 WELCOME TO ATM 💳        ");
        System.out.println("==================================");

        // Verify PIN
        System.out.print("Enter your PIN: ");
        userPin = sc.nextInt();

        if (userPin != PIN) {
            System.out.println("❌ Incorrect PIN! Try again later.");
            return;
        }

        // Main menu
        while (!exit) {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney(sc);
                    break;

                case 3:
                    withdrawMoney(sc);
                    break;

                case 4:
                    exit = true;
                    System.out.println("✅ Thank you for using our ATM. Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Please try again.");
            }
        }

        sc.close();
    }

    // Method to check balance
    private static void checkBalance() {
        System.out.println("💰 Your current balance is: ₹" + balance);
    }

    // Method to deposit money
    private static void depositMoney(Scanner sc) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ ₹" + amount + " deposited successfully.");
            checkBalance();
        } else {
            System.out.println("⚠️ Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    private static void withdrawMoney(Scanner sc) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
            checkBalance();
        } else if (amount > balance) {
            System.out.println("⚠️ Insufficient balance!");
        } else {
            System.out.println("⚠️ Invalid withdrawal amount!");
        }
    }
}
