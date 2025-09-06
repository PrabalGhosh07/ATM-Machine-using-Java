package setUp;

import java.io.IOException;
import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Menu extends Account {
    private Scanner menuInput = new Scanner(System.in);
    private DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    private HashMap<Integer, Integer> data = new HashMap<>();
    private int selection;

    // Constructor to initialize login data
    public Menu() {
        data.put(70630239, 1234);
        data.put(75869163, 4321);
    }

    /* Validate login information customer number and pin number */
    public void getLogin() throws IOException {
        while (true) {
            try {
                System.out.println("Welcome to the ATM!");

                System.out.print("Enter your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your Pin Number: ");
                setPinNumber(menuInput.nextInt());

            } catch (Exception e) {
                System.out.println("\nInvalid input. Only numbers allowed.\n");
                menuInput.nextLine(); 
                continue;
            }

            // Validate credentials
            for (Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey().equals(getCustomerNumber()) &&
                        entry.getValue().equals(getPinNumber())) {
                    getAccountType();
                    return;
                }
            }

            System.out.println("\nWrong Customer Number or Pin Number.\n");
        }
    }

    // Display Account Type Menu With Selection
    public void getAccountType() {
        while (true) {
            System.out.println("\nSelect the Account you want to Access:");
            System.out.println("Type 1 - Checking Account");
            System.out.println("Type 2 - Saving Account");
            System.out.println("Type 3 - Exit");
            System.out.print("Choice: ");

            if (!menuInput.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                menuInput.next();
                continue;
            }

            selection = menuInput.nextInt();

            switch (selection) {
                case 1 -> getChecking();
                case 2 -> getSaving();
                case 3 -> {
                    System.out.println("Thank you for using this ATM, Have a nice Day.");
                    return;
                }
                default -> System.out.println("\nInvalid Choice\n");
            }
        }
    }

    // Display Checking Account Menu
    public void getChecking() {
        while (true) {
            System.out.println("\nChecking Account:");
            System.out.println("Type 1 - View Balance");
            System.out.println("Type 2 - Withdraw Funds");
            System.out.println("Type 3 - Deposit Funds");
            System.out.println("Type 4 - Exit");
            System.out.print("Choice: ");

            if (!menuInput.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                menuInput.next();
                continue;
            }

            selection = menuInput.nextInt();

            switch (selection) {
                case 1 -> System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
                case 2 -> getCheckingWithdrawInput();
                case 3 -> getCheckingDepositInput();
                case 4 -> {
                    return; // exit back to account type menu
                }
                default -> System.out.println("\nInvalid Choice\n");
            }
        }
    }

    // Display Saving Account Menu
    public void getSaving() {
        while (true) {
            System.out.println("\nSaving Account:");
            System.out.println("Type 1 - View Balance");
            System.out.println("Type 2 - Withdraw Funds");
            System.out.println("Type 3 - Deposit Funds");
            System.out.println("Type 4 - Exit");
            System.out.print("Choice: ");

            if (!menuInput.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                menuInput.next();
                continue;
            }

            selection = menuInput.nextInt();

            switch (selection) {
                case 1 -> System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
                case 2 -> getSavingWithdrawInput();
                case 3 -> getSavingDepositInput();
                case 4 -> {
                    return; // exit back to account type menu
                }
                default -> System.out.println("\nInvalid Choice\n");
            }
        }
    }
}
