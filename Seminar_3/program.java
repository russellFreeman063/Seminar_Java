package Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class program {
    public static void main(String[] args) {

        Task_1(10);
        Task_2();
        Task_3();

    }

    static void Task_1(int num) {
        // Task 1: Заполнить список десятью случайными числами. Отсортировать
        // список методом sort() и вывести его на экран.
        System.out.println("Task 1:");
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < num; i++) {
            list.add(rand.nextInt(10));
        }
        
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

    static void Task_2() {
        // Task 2: Заполнить список названиями планет Солнечной системы
        // в произвольном порядке с повторениями.
        // Вывести название каждой планеты и количество его повторений в списке.
        System.out.println("Task 2:");
        ArrayList<String> planets = new ArrayList<>(
                Arrays.asList("Mars", "Earth", "Mercury", "Earth", "Venera", "Mars", "Earth"));
        ArrayList<String> dublicate = new ArrayList<>();
        
        for (int i = 0; i < planets.size(); i++) {
            int count = 1;
            if (!dublicate.contains(planets.get(i))) {
                dublicate.add(planets.get(i));
                for (int j = i + 1; j < planets.size(); j++) {
                    if (planets.get(i).equals(planets.get(j))) {
                        count++;
                    }
                }
                System.out.print(planets.get(i) + " " + count + " ");
            } 
        }  
    }

    static void Task_3() {
        // Task 3: Создать список типа ArrayList<String>. Поместить в него как строки,
        // так и целые числа. Пройти по списку, найти и удалить целые числа.
        System.out.println("\nTask 3:");
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(1, 3, 5, "A", "B", "C", 9, 7));

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
            }
        }
        
        // Iterator<Object> lis = list.iterator();
        // while (lis.hasNext()) {
        //     if (lis.next() instanceof Integer) {
        //         lis.remove();
        //     }
        // }

        System.out.println(list);
    }
}
