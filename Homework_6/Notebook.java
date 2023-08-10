package Homework_6;

public class Notebook {
    private final int id;
    private final String name;
    private int ram;
    private int disk;
    private String os;
    private String color;
    private Integer price;

    public Notebook(int id, String name, int ram, int disk, String os, String color, Integer price) {
        this.id = id;
        this.name = name;
        this.ram = ram;
        this.disk = disk;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public Integer GetRam() {
        return ram;
    }

    public void SetRam(Integer ram) {
        this.ram = ram;
    }

    public Integer GetDisk() {
        return disk;
    }

    public void SetDisk(Integer disk) {
        this.disk = disk;
    }

    public String GetOS() {
        return os;
    }

    public void SetOS(String os) {
        this.os = os;
    }

    public String GetColor() {
        return color;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public Integer GetPrice() {
        return price;
    }

    public void SetPrice(Integer price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "\nid: " + id + "\nМодель: " + name + "\nОЗУ: " + ram + "\nЖД: " +
                disk + "\nОС: " + os + "\nЦвет: " + color + "\nЦена:" + price;
    }
    

}
