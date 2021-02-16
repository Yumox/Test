package pl.kacper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Man kacper = new Man(scanner.nextInt(), scanner2.nextLine());
        System.out.println(kacper.muscleScale);
        System.out.println(kacper.car);
        kacper.printAnimal();
    }
}
