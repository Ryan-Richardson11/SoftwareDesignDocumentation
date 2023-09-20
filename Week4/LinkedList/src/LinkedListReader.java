import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListReader {

    void addAll(String allValues, LinkedList<String>) {
        LinkedList splitString = allValues.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            add(splitString[i]);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        ListIterator<String> it = list.listIterator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers followed by a space (Ex: 1 4 3 9): ");
        String ans = input.nextLine();
    }
}
