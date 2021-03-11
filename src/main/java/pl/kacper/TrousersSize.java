package pl.kacper;

public enum TrousersSize {
    S(20,25),
    M(30,35),
    L(40,45),
    XL(50,55);
    public int wide;
    public int height;

    TrousersSize(int height, int wide) {
        this.height = height;
        this.wide = wide;
    }
    void PrintHello(){
        System.out.println("Hello");
    }

    public int getWide() {
        return wide;
    }

    public int getHeight() {
        return height;
    }
}
