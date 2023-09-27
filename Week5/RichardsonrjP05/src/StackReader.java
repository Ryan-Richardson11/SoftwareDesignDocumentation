import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;

/**
 * LinkedListReader class, contains methods to read an input for a linked list.
 */
public class StackReader {

    /**
     * addAll method, takes an input as a parameter and converts it to a sorted
     * linked list.
     * 
     * @param allValues  Values inputted by the user
     * @param linkedList linked list created from java collections.
     */
    void addAll(String allValues, Stack<Integer> stack) {
        String[] splitString = allValues.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            stack.add(Integer.parseInt(splitString[i]));
        }
        // Sorts linked list.
        Collections.sort(stack);
    }

    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers followed by a space (Ex: 1 4 3 9): ");
        String ans = input.nextLine();
        StackReader reader = new StackReader();
        try {
            reader.addAll(ans, list);
            input.close();
            System.out.println(list);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect. Follow the example input format.");
        }
    }
}
