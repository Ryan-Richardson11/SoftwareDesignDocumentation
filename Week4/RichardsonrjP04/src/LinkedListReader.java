import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
 * LinkedListReader class, contains methods to read an input for a linked list.
 */
public class LinkedListReader {

    /**
     * addAll method, takes an input as a parameter and converts it to a sorted
     * linked list.
     * 
     * @param allValues  Integer values inputed by the user, each separated by a
     *                   space.
     * @param linkedList linked list created from java collections where the
     *                   integers are sorted.
     */
    void addAll(String allValues, LinkedList<Integer> linkedList) {
        String[] splitString = allValues.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            linkedList.add(Integer.parseInt(splitString[i]));
        }
        // Sorts linked list.
        Collections.sort(linkedList);
    }

    public static void main(String[] args) {
        // LinkedList instance created.
        LinkedList<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers followed by a space (Ex: 1 4 3 9): ");
        String ans = input.nextLine();
        LinkedListReader reader = new LinkedListReader();
        // Calls the addAll method to create a sorted linked list from user input
        try {
            reader.addAll(ans, list);
            input.close();
            System.out.println(list);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect. Follow the example input format.");
        }
    }
}
