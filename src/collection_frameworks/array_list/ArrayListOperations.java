package collection_frameworks.array_list;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Creating a non-generic ArrayList to demonstrate mixed data types (commented out)
        // ArrayList list = new ArrayList(); // Any type of data can be added
        // list.add(Integer.valueOf(1)); // Adding an Integer
        // list.add(String.valueOf("one")); // Adding a String
        // list.add(Boolean.valueOf(false)); // Adding a Boolean

        // Creating a generic ArrayList that contains only Integer non-primitive types
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the list
        list.add(1); // Adding 1 to the list
        list.add(2); // Adding 2 to the list
        list.add(4); // Adding 4 to the list
        list.add(5); // Adding 5 to the list
        list.add(6); // Adding 6 to the list

        // Displaying list items using iteration
        System.out.print("List items using iteration: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // Printing each element
        }

        System.out.println();
        // Displaying list items directly using toString() method
        System.out.println("List items using toString():");
        System.out.println(list); // Printing the entire list

        // Adding value at a specific index (index 2)
        list.add(2, 3); // Adds 3 at index 2, shifting subsequent elements to the right
        System.out.println("List after adding 3 at index 2:");
        System.out.println(list); // Printing the updated list

        list.remove(2); // Removes the element at index 2
        System.out.println("List after removing element at index 2:");
        System.out.println(list); // Printing the updated list

        // Removing a specific value (first occurrence of 4)
        list.remove(Integer.valueOf(4)); // Removes the first occurrence of 4
        System.out.println("List after removing the first occurrence of 4:");
        System.out.println(list); // Printing the updated list

        // Checking if an element exists in the list
        boolean ans = list.contains(Integer.valueOf(4)); // Checks if 4 exists in the list
        System.out.println("Does the list contain 4? " + ans); // Printing the result
    }
}
