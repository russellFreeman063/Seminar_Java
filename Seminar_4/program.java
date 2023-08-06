package Seminar_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class program {
    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();

    }

    static void Task1() {
        System.out.println("Task 1:");
        // 1 Замерьте время, за которое в ArrayList добавятся 100000 элементов.
        // 2 Замерьте время, за которое в LinkedList добавятся 100000 элементов.
        // Сравните с предыдущим.

        long time_start_1 = System.currentTimeMillis();
        ArrayList<Integer> list_1 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list_1.add(0, 0);
        }
        long time_end_1 = System.currentTimeMillis();
        System.out.println("ArrayList = " + (time_end_1 - time_start_1));

        long time_start_2 = System.currentTimeMillis();
        LinkedList<Integer> list_2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list_2.add(0, 0);
        }
        long time_end_2 = System.currentTimeMillis();
        System.out.println("LinkedList = " + (time_end_2 - time_start_2));
    }

    static void Task2() {
        System.out.println("Task 2:");
        /*Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида text
        2. Нужно сохранить text в связный список.
        3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        4. Выход - слово exit */

        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;

        while (flag) {
            System.out.println("Введите текст: ");
            String sc = scanner.nextLine();
            if (sc.startsWith("print~")) {
                String[] in = sc.split("~");
                System.out.print(list.remove(Integer.parseInt(in[1])));
            } else if (sc.equals("Exit")) {
                flag = false;
            } else {
                list.add(sc);
            }
            System.out.print(list + " ");
        }

        scanner.close();
    }

    static void Task3() {
        System.out.println("Task 3:");
        /**Реализовать консольное приложение, которое:
        1. Принимает от пользователя и “запоминает” строки.
        2. Если введено print, выводит строки так, чтобы последняя введенная была первой 
        в выводе, а первая введённая - последней в выводе и чистит структуру
        3. Выход - exit */

        Stack<String> list = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            System.out.println("Введите текст: ");
            String sc = scanner.nextLine();
            if (sc.equals("print")) {
                while (!list.empty()) {
                    System.out.println(list.pop());
                }
            } else if (sc.equals("Exit")) {
                flag = false;
            } else {
                list.push(sc);
            }
            System.out.println(list);
        }
        scanner.close();
    }

    static void Task4() {
        System.out.println("Task 4:");
        // Написать метод, который принимает массив элементов, 
        // помещает их в очередь и выводит на консоль содержимое очереди.

        int[] array = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        Queue(array);
    }

    static void Queue(int[] list) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < list.length; i++) {
            queue.add(list[i]);
        }

        System.out.println(queue);
    }
}

