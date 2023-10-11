import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * StackReader class, contains methods to read an input, push it to a stack,
 * then sort it.
 */
public class StackReader {

    /**
     * addAll method, takes an input as a parameter, sorts the inputs,
     * then pushes them to the stack in ascending order.
     * 
     * @param allValues Integer values inputed by the user, each separated by a
     *                  space.
     * @param stack     Stack created from java collections, integers are sorted in
     *                  an array
     *                  then pushed to the stack.
     */
    void addAll(String allValues, Stack<Integer> stack) {
        ArrayList<Integer> arr = new ArrayList<>();
        String[] splitString = allValues.split(" ");
        for (String value : splitString) {
            arr.add(Integer.parseInt(value));
        }
        // Sorts an array to be pushed to the stack.
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            // Values pushed to stack
            stack.push(arr.get(i));
        }
    }

    public static void main(String[] args) {
        // Stack instance created.
        Stack<Integer> list = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers followed by a space (Ex: 1 4 3 9): ");
        String ans = input.nextLine();
        StackReader reader = new StackReader();
        // Call the addAll method to create a sorted stack from user input
        try {
            reader.addAll(ans, list);
            input.close();
            System.out.println(list);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect. Follow the example input format.");
        }
    }
}
