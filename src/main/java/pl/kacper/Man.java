package pl.kacper;

public class Man extends Human {
    int muscleScale;
    String car;
    public static int count = 0;

    public Man(int weight, int age, String name, String surname, int muscleScale, String car) {
        super(weight, age, name, surname);
        this.muscleScale = muscleScale;
        this.car = car;
    }

    public Man(int muscleScale, String car) {
        this.muscleScale = muscleScale;
        this.car = car;
    }

    public Man() {
        count++;
    }

    @Override
    public void printSth() {
        System.out.println("jestem w klasie");
    }

    public void printAnimal(){
        System.out.println("Man");
    }
}
