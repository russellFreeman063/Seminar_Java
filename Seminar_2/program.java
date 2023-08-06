package Seminar_2;

import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        
        System.out.println(Task1(8, 'E', 'Z'));
        System.out.println(Task2("aaaabbbcddaa"));
        System.out.println(Task3("Потоп"));
        Task4("TEST", 10);

    }

    static String Task1(int n, char c1, char c2) {
        System.out.println("Task 1: ");
        // Дано четное число N (>0) и символы с1 и с2.
        // Написать метод, который вернет строку длины N,
        // которая состоит из чередующихся символов c1 и с2, начиная с с1.
        
        StringBuilder words2 = new StringBuilder();
        for (int i = 0; i < n / 2; i++)
            words2.append(c1).append(c2);
        return words2.toString();
    }

    static String Task2(String word) {
        System.out.println("Task 2");
        // Напишите метод, который сжимает строку. Пример: вход aaaabbbcddaa
        // a4b3cd2a2
        
        StringBuilder words2 = new StringBuilder();
        Character temp = null;
        Character last = null;
        int countTemp = 1;

        for (int i = 1; i < word.length(); i++) {
            temp = word.charAt(i); // d
            last = word.charAt(i - 1); // c
            if (temp == last) {
                countTemp++;
            } else {
                if (countTemp == 1) {
                    words2.append(last);
                } else {
                    words2.append(last).append(countTemp);
                    countTemp = 1;
                }
            }
        }
        if (countTemp == 1) {
            words2.append(temp);
        } else {
            words2.append(temp).append(countTemp);
        }
        return words2.toString();
    }

    static Boolean Task3(String word) {
        System.out.println("Task 3");
        // Напишите метод, который принимает на вход строку (String) и определяет 
        // является ли строка палиндромом (возвращает boolean значение).
        
        for (int i = 0; i < word.length() / 2; i++)
           if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - i - 1))
                return false;

        return true;    
    }

    static void Task4(String text, int n) {
        System.out.println("Задача 4: ");
        // Задача 4: Напишите метод, который составит строку, состоящую из 10 повторений слова TEST
        // и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
       
        try{
            FileWriter writer = new FileWriter("Seminar_2/file.txt",true);
            System.out.println("Получилось");
            for (int i = 0; i < n; i++) {
                writer.write(text);
            }
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
