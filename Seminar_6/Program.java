package Seminar_6;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

         Task1();
        // Task2(120, 100);
       

        
        Cat barsic = new Cat("barsic", "vesloyx", 3);
        // barsic.age;
        System.out.println(barsic.getName());
        // barsic.name = "barsic";
        // barsic.poroda = "vesloyx";
        barsic.info();
        barsic.setAge(4);
        barsic.info();


        Cat leo = new Cat("leo", 5);
        // leo.age = 5;
        // leo.name = "leo";
        // leo.poroda = "siamsk";

        leo.info();
        System.out.println(leo);
        
    }

    public static void Task1() {
        System.out.println("Task 1: ");
        // 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 3, 2, 4, 5, 6, 3}. 
        // 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 3, 2, 4, 5, 6, 3}.  
        // 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 3, 2, 4, 5, 6, 3}.  
        // Распечатайте содержимое данного множества.

        Set<Integer> hset = new HashSet<>(Arrays.asList(1, 2, 30000, 3, 2, 4, 5, 6, 3));
        System.out.println("HashSet: " + hset);

        Set<Integer> lset = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 3, 2, 4, 5, 6, 3));
        System.out.println("LinkedHashSet: " + lset);

        Set<Integer> tset = new TreeSet<>(Arrays.asList(1, 2, 30000, 3, 2, 4, 5, 6, 3));
        System.out.println("TreeSet: " + tset);
    }

    public static void Task2(int size, int range) {
        System.out.println("Task 2: ");
        // 1. Напишите метод, который заполнит массив из 120 элементов случайными цифрами от 0 до 100.
        // 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в
        // данном массиве и верните его в виде числа с плавающей запятой.
        // Для вычисления процента используйте формулу:
        // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

        Random rand = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(range);     
        }
        System.out.println(Arrays.toString(array));
        System.out.println(UniqueNum(array));
    }

    public static float UniqueNum(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        float num = (float)set.size() * 100 / array.length;
        return num;
    }
}
