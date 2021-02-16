package pl.kacper;

public abstract class Human extends Animal{
    String name;
    String surname;

    public Human(int weight, int age, String name, String surname) {
        super(weight, age);
        this.name = name;
        this.surname = surname;
    }

    public Human() {
    }
    public void printAnimal(){
        System.out.println("Human");
    }
}
