//Torres, Mark CSC6301; Module 04: Assignment 01 - Project 04 - Linked List and Collections Framework

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * The SortLinkedList program is a console application that reads a series of 
 * integer inputs from the user, stores them in a LinkedList, and then sorts 
 * the LinkedList in ascending order.
 *
 * Usage: 
 * To compile the program, use: javac SortLinkedList.java
 * To run the program, use: java SortLinkedList
 *
 * To generate Javadoc, use: javadoc SortLinkedList.java
 *
 * This program utilizes the Java Collections Framework to achieve its functionality:
 * - The List interface is used to define a collection for storing integers.
 * - The LinkedList class provides a doubly-linked list implementation of the List interface.
 * - The Collections class is used to sort the LinkedList.
 */
public class SortLinkedList {
    /**
     * Sorts a LinkedList of integers in ascending order.
     *
     * @param integerList LinkedList of integers to be sorted.
     */
    public static void sort(List<Integer> integerList) {
        Collections.sort(integerList);
    }

    /**
     * The main method reads integers from the standard input,
     * stores them in a LinkedList, sorts the LinkedList,
     * and prints the sorted list.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new LinkedList<>();

        System.out.println("Enter integers (type 'exit' to finish):");

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

        SortLinkedList.sort(integerList);

        System.out.println("Sorted list: " + integerList);
    }
}
