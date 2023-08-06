package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class program {
    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();

    }

    static void Task1() {
        System.out.println("Task 1:");
        // Создать структуру для хранения номеров паспортов и Фамилий сотрудников организации.
        // 123456 Иванов
        // 321456 Васильев
        // 234561 Петрова
        // 234432 Иванов
        // 654321 Петрова
        // 345678 Иванов
        // Вывести данные по сотрудникам с фамилией Иванов.

        Map<Integer, String> mp1 = new HashMap<>();
        mp1.put(123456, "Иванов");
        mp1.put(321456, "Васильев");
        mp1.put(234561, "Петрова");
        mp1.put(234432, "Иванов");
        mp1.put(654321, "Петрова");
        mp1.put(345678, "Иванов");
        String name = "Иванов";
        for (var item : mp1.entrySet()) {
            if (item.getValue().equals(name)) {
                System.out.printf("%d: %s\n", item.getKey(), item.getValue());
            }
        }
    }

    static void Task2() {
        System.out.println("\nTask 2:");
        // Даны 2 строки, написать метод, который вернет true, если эти строки являются 
        // изоморфными и false, если нет.Строки изоморфны, если одну букву в первом слове можно
        // заменить на некоторую букву во втором слове, при этом
        // 1. повторяющиеся буквы одного слова меняются на одну и
        // ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
        // 2. буква может не меняться, а остаться такой же. (Например, note - code)
        // Пример 1:
        // Input: s = "foo", t = "bar"
        // Output: false
        // Пример 2:
        // Input: s = "paper", t = "title"
        // Output: true
        // boolean flag1 = true;

        String name1 = "paper";
        String name2 = "eeeee";
       
        boolean flag1 = Izomorphe(name1, name2);
        System.out.println(flag1);
        boolean flag2 = Izomorphe(name2, name1);
        System.out.println(flag2);
        System.out.println(flag1 && flag2);
    }

    static boolean Izomorphe(String name1, String name2) {
        if (name1.equals(name2)) {
            return false;
        } else if (name1.length() != name2.length()) {
            return false;
        } else {
            Map<Character, Character> map1 = new HashMap<>();
            char[] chr1 = name1.toCharArray();
            char[] chr2 = name2.toCharArray();

            for (int i = 0; i < chr1.length; i++) {
                if (!map1.containsKey(chr1[i])) {
                    map1.put(chr1[i], chr2[i]);
                } else {
                    if (map1.get(chr1[i]) != chr2[i]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    static void Task3() {
        System.out.println("Task 3:");
        // Написать программу, определяющую правильность расстановки скобок в выражении.
        // Пример 1: a+(d*3) - истина
        // Пример 2: [a+(1*3) - ложь
        // Пример 3: [6+(3*3)] - истина
        // Пример 4: {a}[+]{(d*3)} - истина
        // Пример 5: <{a}+{(d*3)}> - истина
        // Пример 6: {a+]}{(d*3)} - ложь
        // [(]) - ложь
    
        String str1 = "[]";
        System.out.println(str1);
        boolean flag14 = SortSkobok(str1);
        System.out.println(flag14);
    }

    public static boolean SortSkobok(String str1) {
        Stack<Character> data1 = new Stack<>();

        Map<Character, Character> map1 = new HashMap<>();
        map1.put(']', '[');
        map1.put('}', '{');
        map1.put(')', '(');
        map1.put('>', '<');

        char[] chr = str1.toCharArray();

        for (int i = 0; i < chr.length; i++) {
            if (map1.containsValue(chr[i])) {
                data1.push(chr[i]);
            } else if (map1.containsKey(chr[i])) {
                if (data1.empty() || map1.get(chr[i]) != data1.pop()) {
                    return false;
                }
            }
        }
        return data1.empty();
    }
}
