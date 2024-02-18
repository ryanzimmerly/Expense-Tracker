import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseTracker {

    // List to store the expense amounts
    private List<Double> expenses;

    // Constructor to initialize the list
    public ExpenseTracker() {
        expenses= new ArrayList<>();
    }

    // Method to add an expense to the list
    public void addExpense(double amount) {
        expenses.add(amount);
    }

    // Method to calculate the total of all expenses in the list
    public double calculateTotalExpenses() {
        double total = 0;
        for (double expense : expenses){
            total += expense;
        }
        return total;
    }

    // Main method for user interaction
    public static void main(String[] args) {
        // Create an instance of ExpenseTracker
        ExpenseTracker expenseTracker = new ExpenseTracker();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // User interaction loop
        while (true) {
            System.out.println("Expense Tracker Menu");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice");

            // Read user choice
            int choice = scanner.nextInt();

            // Handle user choices
            switch (choice){
                // Case 1: Add Expense
                case 1:
                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scanner.nextDouble();
                    expenseTracker.addExpense(expenseAmount);
                    System.out.println("Expense added successfully!\n");
                    break;

                // Case 2: View Total Expense
                case 2:
                    double totalExpenses = expenseTracker.calculateTotalExpenses();
                    System.out.println("Total Expenses: $" + totalExpenses + "\n");
                    break;

                // Case 3: Exit
                case 3:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);

                // Default: Invalid choice
                default:
                    System.out.println("Invalid choice. Please enter a valid option\n");
            }
        }
    }
}