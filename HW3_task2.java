//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class HW3_task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            list.add(rand.nextInt(0, 100));
        }
        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            if(list.get(i)%2 == 0)
                list.remove(i);
        }
        System.out.println(list);
    }
}