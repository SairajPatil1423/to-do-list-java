import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        ArrayList<String> todos = new ArrayList<>();

        while (true) {
            System.out.println("\nTodo List Menu for " + userName + ":");
            System.out.println("1. Add Todo");
            System.out.println("2. Remove Todo");
            System.out.println("3. Show Todos");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a todo item: ");
                    String todoItem = scanner.nextLine();
                    todos.add(todoItem);
                    System.out.println("Todo added!");
                    break;
                case 2:
                    if (todos.isEmpty()) {
                        System.out.println("Todo list is empty. Nothing to remove.");
                    } else {
                        System.out.print("Enter the index of the todo to remove: ");
                        int indexToRemove = scanner.nextInt();
                        scanner.nextLine();  // Consume the newline character
                        if (indexToRemove >= 1 && indexToRemove <= todos.size()) {
                            String removedItem = todos.remove(indexToRemove - 1);
                            System.out.println("Removed: " + removedItem);
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;
                case 3:
                    if (todos.isEmpty()) {
                        System.out.println("Todo list is empty.");
                    } else {
                        System.out.println("Todo List:");
                        for (int i = 0; i < todos.size(); i++) {
                            System.out.println((i + 1) + ": " + todos.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Goodbye, " + userName + "!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
