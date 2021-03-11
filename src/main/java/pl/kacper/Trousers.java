package pl.kacper;

public class Trousers {
    public TrousersSize size;
    public String name;

    public Trousers(TrousersSize size, String name) {
        this.size = size;
        this.name = name;
    }
    public void PrintDimensions(){
        System.out.println(size.height);
        System.out.println(size.wide);
    }
}
