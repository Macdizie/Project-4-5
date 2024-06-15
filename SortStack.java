// Torres, Mark CSC6301 Module 05: Assignment 01 - Project 05 - Planning and Executing a Maintenance Task

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class provides methods to interact with a stack of integers.
 * It includes methods to sort, push, peek, and pop elements in the stack.
 * 
 * The code demonstrates reuse of the sorting functionality implemented in Week 4.
 * Specifically, it uses the same sort method to sort the elements of a stack.
 */
public class SortStack {

    /**
     * Sorts a list of integers in ascending order.
     * Reuses the sort method from Week 4's SortLinkedList class.
     * 
     * This is an example of code reuse where the sorting logic implemented 
     * previously in the SortLinkedList class is utilized here without 
     * re-implementing it.
     * 
     * @param integerList the list of integers to be sorted
     */
    public static void sort(List<Integer> integerList) {
        // Reuse the sort method from SortLinkedList class of Week 4
        // This demonstrates code reuse by calling an existing sorting method
        SortLinkedList.sort(integerList); // Ensure SortLinkedList class is imported and accessible
    }

    /**
     * Adds an integer to a stack.
     * 
     * @param integerStack the stack to which the integer will be added
     * @param value the integer value to be added to the stack
     */
    public static void push(Stack<Integer> integerStack, int value) {
        integerStack.push(value);
    }

    /**
     * Returns the top element of a stack without removing it.
     * 
     * @param integerStack the stack from which the top element will be returned
     * @return the top element of the stack
     */
    public static int peek(Stack<Integer> integerStack) {
        return integerStack.peek();
    }

    /**
     * Removes and returns the top element of a stack.
     * 
     * @param integerStack the stack from which the top element will be removed
     * @return the removed top element of the stack
     */
    public static int pop(Stack<Integer> integerStack) {
        return integerStack.pop();
    }

    /**
     * Main method to run the program. Reads a list of integers from the console input,
     * sorts them, and demonstrates stack operations.
     * 
     * This method showcases how the sorting functionality is reused from another class.
     * It also demonstrates how a sorted list of integers can be pushed onto a stack and 
     * various stack operations can be performed.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.println("Enter integers (type 'exit' to finish):");

        // Read integers from input
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integerList.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input, please enter an integer or 'exit' to finish.");
                }
            }
        }

        scanner.close();

        // Sort the List using reused method
        sort(integerList);

        // Create a Stack and push sorted elements into it
        Stack<Integer> integerStack = new Stack<>();
        for (int value : integerList) {
            push(integerStack, value);
        }

        // Print the sorted Stack
        System.out.println("Sorted stack: " + integerStack);

        // Demonstrate stack operations
        if (!integerStack.isEmpty()) {
            System.out.println("Top element (using peek): " + peek(integerStack));
            System.out.println("Removed top element (using pop): " + pop(integerStack));
            System.out.println("Stack after pop: " + integerStack);
        } else {
            System.out.println("The stack is empty.");
        }
    }
}
