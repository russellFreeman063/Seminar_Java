package Seminar_6;

public class Cat {
    // public     - виден везде
    // private    - виден только в этом классе
    // protected  - виден в этом классе и в классах-наследниках

    private String name;
    private String poroda = "dom";
    private Integer age = 1;

    public Cat(String name, String poroda, Integer age){
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public Cat(String name, Integer age){
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }




    
    public void info(){
        System.out.println(this.name + " " + this.poroda + " " + this.age);
    }

    @Override
    public String toString(){
        return this.name + " <-Имя Возраст-> " + this.age;
    }
}
