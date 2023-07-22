package app.task3;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner sc;
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        LinkedList<String> fruitsList = new LinkedList<>(Arrays.asList("orange", "kiwi", "mango", "lemon"));

        System.out.println("\nYour initial fruits list:");
        getOutput(fruitsList);

        addFirstLast(fruitsList);
        System.out.println("\nYour updated fruits list:");
        getOutput(fruitsList);

        sc.close();

    }

    private static void addFirstLast(LinkedList<String> list) {
        sc = new Scanner(System.in);
        System.out.println("\nEnter 2 fruits that you want to add at FIRST and LAST position: ");
        System.out.print("FIRST position: ");
        list.addFirst(sc.nextLine().toLowerCase());
        System.out.print("LAST position: ");
        list.addLast(sc.nextLine().toLowerCase());
    }

    private static void getOutput(List<String> list) {
        counter.set(0);
        for (String item : list) {
            counter.incrementAndGet();
            System.out.println(counter + ") " + item);
        }
    }
}
