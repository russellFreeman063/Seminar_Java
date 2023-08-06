package Seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> phonebook = new HashMap<>();
        Menu(phonebook);

    }

    public static void Menu(Map<String, ArrayList<Integer>> book) {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "Добавить контакт");
        menu.put(2, "Вывести всех");
        menu.put(3, "Выход");
        Boolean exit = false;
        Scanner input = new Scanner(System.in, "cp866");
        
        while (!exit) {
            for (var item : menu.entrySet()) {
            System.out.printf("%d: %s\n", item.getKey(), item.getValue());
            }
            System.out.println("\nВведите опцию: ");
            String num = input.nextLine();
            if (num.equals("1")) {
                System.out.print("Введите имя: ");
                String name = input.nextLine();
                System.out.print("Введите номер: ");
                int number = input.nextInt();
                AddContact(name, number, book);
            } else if (num.equals("2")) {
                System.out.println("\nВсе контакты: ");
                PrintBook(book);
                System.out.println("Нажмите Enter");
                input.nextLine();
            } else if (num.equals("3")) {
                System.out.println("Завершение программы");
                input.close(); 
                exit = true;
            }
        }
    }

    public static void AddContact(String key, int value, Map<String, ArrayList<Integer>> book){
        if (book.containsKey(key)) {
            book.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            book.put(key, list);
        }

    }

    public static void PrintBook(Map<String, ArrayList<Integer>> book){
        for (var item : book.entrySet()) {
            String numbers = "";
            for(int el: item.getValue()){
                numbers = numbers + el + "  ";
            }
            System.out.printf("%s: %s \n", item.getKey(), numbers);
        }
    } 
}
