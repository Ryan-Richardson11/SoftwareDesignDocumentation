import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * StackReader class, contains methods to read an input for a Stack.
 */
public class StackReader {

    /**
     * addAll method, takes an input as a parameter, pushes it on to the stack,
     * and converts it to a sort stack.
     * 
     * @param allValues  Values inputted by the user
     * @param stack stack created from java collections.
     */
    void addAll(String allValues, Stack<Integer> stack) {
        ArrayList<Integer> arr = new ArrayList<>();
        String[] splitString = allValues.split(" ");
        for (String value : splitString) {
            arr.add(Integer.parseInt(value));
        }
        // Sorts stack.
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++){
            stack.push(arr.get(i));
        }
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
