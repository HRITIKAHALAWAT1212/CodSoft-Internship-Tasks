// ATM:

import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    public void displayMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your balance: $" + balance);
    }

    public void depositMoney(double amount) {
        balance += amount;
    }


    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = 1000;
        ATM atm = new ATM(initialBalance);

        int choice;

        do {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    atm.depositMoney(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    atm.withdrawMoney(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Goodbye! Have a Nice Day.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("----------------------");
        } while (choice != 4);
    }
}
