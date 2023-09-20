import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class LinkedListReader {

    void addAll(String allValues, LinkedList<Integer> linkedList) {
        String[] splitString = allValues.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            linkedList.add(Integer.parseInt(splitString[i]));
        }
        Collections.sort(linkedList);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers followed by a space (Ex: 1 4 3 9): ");
        String ans = input.nextLine();
        LinkedListReader reader = new LinkedListReader();
        reader.addAll(ans, list);
        input.close();
        System.out.println(list);
    }
}
