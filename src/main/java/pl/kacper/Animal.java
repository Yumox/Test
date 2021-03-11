package pl.kacper;

public abstract class Animal implements Interfejs {
    int weight;
    int age;

    public Animal(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public Animal() {
    }
    public void printAnimal(){
        System.out.println("Animal");
    }
}
