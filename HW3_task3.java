//Задан целочисленный список ArrayList.
//Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HW3_task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>(15);

        for (int i = 0; i < 15; i++) {
            list.add(rand.nextInt(0, 100));
        }
        System.out.println(list);

        System.out.println("Минимальное значание: "+Collections.min(list));
        System.out.println("Максмальное значание: "+Collections.max(list));

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Среднее арифметическое: "+(double)sum/ list.size());
    }
}