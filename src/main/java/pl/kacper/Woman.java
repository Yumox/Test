package pl.kacper;

public class Woman extends Human{
    int beautyScale;
    String ring;

    public Woman(int weight, int age, String name, String surname, int beautyScale, String ring) {
        super(weight, age, name, surname);
        this.beautyScale = beautyScale;
        this.ring = ring;
    }

    public Woman(int beautyScale, String ring) {
        this.beautyScale = beautyScale;
        this.ring = ring;
    }
}
