package com.joysistvi.stage2.activity.day24;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nTasks:");

                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.print("Enter task index to update: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        if (index >= 0 && index < tasks.size()) {
                            System.out.print("Enter new task: ");
                            String newTask = scanner.nextLine();

                            tasks.set(index, newTask);

                            System.out.println("Task updated successfully.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.print("Enter task index to remove: ");
                        int removeIndex = scanner.nextInt();
                        scanner.nextLine();

                        if (removeIndex >= 0 && removeIndex < tasks.size()) {
                            tasks.remove(removeIndex);
                            System.out.println("Task removed successfully.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks cleared.");
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}