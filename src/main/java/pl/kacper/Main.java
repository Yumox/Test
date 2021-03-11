package pl.kacper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Trousers trousers = new Trousers(TrousersSize.S, "Cropp");
        trousers.PrintDimensions();
        System.out.println(trousers.size.getWide());
        TrousersSize rozmiar1 = TrousersSize.L;
        TrousersSize rozmiar2 = TrousersSize.L;
        System.out.println(TrousersSize.valueOf("XL"));
        rozmiar1.PrintHello();
    }
}
