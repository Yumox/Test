package pl.kacper;

public class Animal {

    public int age;
    String name;
    String sound;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void noise(){
        System.out.println("Hau");
    }
}
