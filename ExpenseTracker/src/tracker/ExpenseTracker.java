package tracker;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
	

	    ArrayList<String> categories = new ArrayList<>();
	    ArrayList<String> descriptions = new ArrayList<>();
	    ArrayList<Double> amounts = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);

	    public void addExpense() {
	        System.out.print("Category: ");
	        String category = scanner.nextLine();
	        System.out.print("Description: ");
	        String description = scanner.nextLine();
	        System.out.print("Amount: ");
	        double amount = scanner.nextDouble();
	        scanner.nextLine(); // Clear the newline

	        categories.add(category);
	        descriptions.add(description);
	        amounts.add(amount);

	        System.out.println("Expense added.");
	    }

	    public void viewExpenses() {
	        if (categories.isEmpty()) {
	            System.out.println("No expenses yet.");
	            return;
	        }

	        System.out.println("Expenses:");
	        for (int i = 0; i < categories.size(); i++) {
	            System.out.println(categories.get(i) + " - " + descriptions.get(i) + " - $" + amounts.get(i));
	        }

	        double total = 0;
	        for (double amount : amounts) {
	            total += amount;
	        }
	        System.out.println("Total: $" + total);
	    }

	    public void run() {
	        int choice;
	        do {
	            System.out.println("\nExpense Tracker");
	            System.out.println("1. Add Expense");
	            System.out.println("2. View Expenses");
	            System.out.println("3. Exit");
	            System.out.print("Choice: ");

	            if (scanner.hasNextInt()) {
	                choice = scanner.nextInt();
	                scanner.nextLine(); // Clear newline
	            } else {
	                System.out.println("Invalid input. Please enter a number.");
	                scanner.nextLine(); // Clear invalid input
	                choice = -1; // To loop again
	                continue; // Skip the rest of the loop
	            }

	            switch (choice) {
	                case 1:
	                    addExpense();
	                    break;
	                case 2:
	                    viewExpenses();
	                    break;
	                case 3:
	                    System.out.println("Bye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 3);
	        scanner.close();
	    }

	    public static void main(String[] args) {
	        ExpenseTracker tracker = new ExpenseTracker();
	        tracker.run();
	    }
	}


