import java.util.Scanner;

public class Lab_6_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of bank accounts");
        int n = sc.nextInt();
        BankAccount[] accounts = new BankAccount[n];
        int accountCount = 0;

        while (true) {
            System.out.println("1. Create Account\n2. Deposit Money\n3. Withdraw Money\n4. Check Balance\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (accountCount < n) {
                        BankAccount b = new BankAccount();
                        System.out.print("Enter account number: ");
                        b.setAccountNumber(sc.nextInt());
                        System.out.print("Enter name: ");
                        b.setName(sc.next());
                        System.out.print("Enter account holder: ");
                        b.setAccountHolder(sc.next());
                        System.out.print("Enter initial balance: ");
                        b.setBalance(sc.nextInt());
                        accounts[accountCount++] = b;
                    } else {
                        System.out.println("Account limit reached. Cannot create more accounts.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    BankAccount account = findAccount(accounts, accNum, accountCount);
                    if (account != null) {
                        System.out.print("How much money do you want to deposit: ");
                        int add = sc.nextInt();
                        account.deposit(add);
                        account.checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNum = sc.nextInt();
                    account = findAccount(accounts, accNum, accountCount);
                    if (account != null) {
                        System.out.print("How much money do you want to withdraw: ");
                        int remove = sc.nextInt();
                        if (account.getBalance() < remove) {
                            System.out.println("Withdraw amount exceeds current balance.");
                            account.checkBalance();
                        } else {
                            account.withdraw(remove);
                            account.checkBalance();
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accNum = sc.nextInt();
                    account = findAccount(accounts, accNum, accountCount);
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static BankAccount findAccount(BankAccount[] accounts, int accountNumber, int accountCount) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}

class BankAccount {
    private int accountNumber;
    private int balance;
    private String accountHolder;
    private String name;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(int add) {
        balance += add;
    }

    public void withdraw(int remove) {
        balance -= remove;
    }

    public void checkBalance() {
        System.out.println("Your current balance = " + balance);
    }
}