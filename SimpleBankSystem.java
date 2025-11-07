import java.util.Scanner;

class Bank {
    private double balance;

    public Bank(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount is: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn amount is: " + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        Bank b1 = new Bank(initialBalance);

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        b1.deposit(dep);
        System.out.println("Balance after deposit: " + b1.getBalance());

        System.out.print("Enter amount to withdraw: ");
        double with = sc.nextDouble();
        b1.withdraw(with);
        System.out.println("Balance after withdrawal: " + b1.getBalance());
    }
}
