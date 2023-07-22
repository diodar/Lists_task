package app.task2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        List<String> list = getData(sc);

        System.out.println("\nYour initial fruits list:");
        getOutput(list);

        updateData(list);
        System.out.println("\nYour updated fruits list:");
        getOutput(list);

        sc.close();

    }

    private static List<String> getData(Scanner sc) {
        System.out.println("\nEnter 5 different fruits to create a list: ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            counter.incrementAndGet();
            System.out.print(counter + " fruit: ");
            String str = sc.nextLine().toLowerCase();
            if (!list.contains(str)) {
                list.add(str);
            } else {
                System.out.println(str + " - is already in the list. Try another one.");
                i--;
                counter.decrementAndGet();
            }
        }
        return list;
    }

    private static void updateData(List<String> list) {

        System.out.println("\nEnter 3 fruits that you want to delete from list: ");
        counter.set(0);
        for (int i = 0; i < 3; i++) {
            counter.incrementAndGet();
            System.out.print(counter + " fruit to delete: ");
            String del = sc.next().toLowerCase();
            if (list.contains(del)) {
                list.remove(del);
            } else {
                System.out.println(del + " - is not in the list. Try again.");
                i--;
                counter.decrementAndGet();
            }
        }
    }

    private static void getOutput(List<String> list) {
        counter.set(0);
        for (String item : list) {
            counter.incrementAndGet();
            System.out.println(counter + ") " + item);
        }
    }
}