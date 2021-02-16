package pl.kacper;

public class Main {

    public static void main(String[] args) {

        Dog testDog = new Dog("ok");
        testDog.noise();
        testDog.sound = "Miau";
        System.out.println(testDog.sound);

    }
}
