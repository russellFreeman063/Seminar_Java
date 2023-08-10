package Homework_6;

import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> catalog = new HashSet<>();
        catalog.add(new Notebook(1, "ASUS Vivobook Go", 8, 256, "Linux", "Black", 40999));
        catalog.add(new Notebook(2, "Lenovo IdeaPad 3", 8, 256, "Linux", "Blue", 42999));
        catalog.add(new Notebook(3, "HUAWEI MateBook D 15", 16, 512, "Linux", "Silver", 54999));
        catalog.add(new Notebook(4, "MSI Modern 15", 8, 256, "Windows", "Black", 46999));
        catalog.add(new Notebook(5, "Infinix InBook X2", 8, 512, "Windows", "Blue", 49999));
        catalog.add(new Notebook(6, "Tecno Megabook", 16, 512, "Windows", "Silver", 56499));
        PrintFilter(GetFilter(),catalog);
    }

    public static Map<String, Object> GetFilter() {
        Map<String, Object> filter = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:" +
                "\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Стоимость");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Введите размер ОЗУ:");
            num = sc.nextInt();
            filter.put("ram", num);
        } else if (num == 2) {
            System.out.println("Введите размер ЖД:");
            num = sc.nextInt();
            filter.put("disk", num);
        } else if (num == 3) {
            System.out.println("Выберите Операционную систему:\n1 - Windows\n2 - Linux");
            num = sc.nextInt();
            if (num == 1) {
                filter.put("os", "Windows");
            } else if (num == 2) {
                filter.put("os", "Linux");
            } else System.out.println("Не верный ввод");
        } else if (num == 4) {
            System.out.println("Введите цвет:");
            String color = sc.nextLine();
            color = sc.nextLine();
            filter.put("color", color);
        } else if (num == 5) {
            System.out.println("Введите цену:");
            num = sc.nextInt();
            filter.put("price", num);
        } else System.out.println("Не верный ввод");
        return filter;
    }

    public static void PrintFilter(Map<String, Object> filter, Set<Notebook> catalog) {
        for (Notebook notebook : catalog) {
            boolean match = true;
            for (String filterKey : filter.keySet()) {
                Object filterValue = filter.get(filterKey);
                switch (filterKey) {
                    case "ram" -> {
                        if (notebook.GetRam() < (int) filterValue) {
                            match = false;
                        }
                    }
                    case "disk" -> {
                        if (notebook.GetDisk() < (int) filterValue) {
                            match = false;
                        }
                    }
                    case "os" -> {
                        if (!notebook.GetOS().equals(filterValue)) {
                            match = false;
                        }
                    }
                    case "color" -> {
                        if (!notebook.GetColor().equals(filterValue)) {
                            match = false;
                        }
                    }
                    case "price" -> {
                        if (notebook.GetPrice() < (int) filterValue) {
                            match = false;
                        }
                    }
                    default ->
                            System.out.println("Не найдено " + filterKey);
                }
                if (match) {
                    System.out.println(notebook.toString());
                }
            }
        }
    }
}