package app.task1;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        List<String> list = getData();
        getOutput(list);
        getSortedOutput(list);

        sc.close();

    }

    private static List<String> getData() {
        System.out.println("\nEnter 5 names to create a list: ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            counter.incrementAndGet();
            System.out.print(counter + " name: ");
            list.add(sc.next());
        }
        return list;
    }

    private static void getOutput(List<String> list) {
        System.out.println("\nYour initial list:");
        counter.set(0);
        for (String name : list) {
            counter.incrementAndGet();
            System.out.println(counter + ") " + name);
        }
    }

    private static void getSortedOutput(List<String> list) {
        Collections.sort(list);
        System.out.println("\nYour sorted list:");
        counter.set(0);
        for (String name : list) {
            counter.incrementAndGet();
            System.out.println(counter + ") " + name);
        }
    }

}