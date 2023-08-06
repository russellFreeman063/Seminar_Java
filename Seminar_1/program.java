import java.util.Arrays;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Task1();
        System.out.println();
        Task2();
        System.out.println();
        Task3();

    }

    public static void Task1() {
        // Написать программу, которая запросит пользователя ввести <Имя> в консоли.
        // Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
        System.out.println("Задача 1:");
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите ваше имя: ");
        String name = iScanner.next();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
        System.out.println();
    }

    public static void Task2() {
        // Дан массив двоичных чисел, например [1,1,0,1,1,1],
        // вывести макимальное количество подряд идущих 1.

        System.out.println("Задача 2:");
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int num = 1;
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                count++;
            else {
                max = count;
                count = 0;
            }
        }
        if (max < count)
            max = count;
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }

    public static void Task3() {
        // Дан массив nums = [3,2,4,3,1,3,3,5] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
        // конец массива.
        // Таким образом, первые несколько (или все) элементов массива
        // должны быть отличны о заданного, а остальные - равны ему.

        System.out.println("Задача 3:");
        int[] nums = { 3, 2, 4, 3, 1, 3, 3, 5};
        int val = 3;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        } 
        System.out.println(Arrays.toString(nums));
    }
}
