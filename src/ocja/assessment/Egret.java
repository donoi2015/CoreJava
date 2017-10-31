package ocja.assessment;

/**
 * @author ts-tuluv.battulga
 */
public class Egret {
    private String color; //since it's instance variable, default value is set and no compiler error

    public Egret() {
        this("white");
    }

    public Egret(String color) {
        color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}
