package lynda.advanced.enums;

public class Olive {
    public static final long BLACK = 0x000000;
    public OliveName oliveName;
    public long color = BLACK;

    // const1
    public Olive() {
    }

    // const2
    public Olive(OliveName aOliveName) {
        oliveName = aOliveName;
    }

    // const3
    public Olive(OliveName aOliveName, long aColor) {
        this(aOliveName);
        color = aColor;
    }

    // getters & setters
    public OliveName getOliveName() {
        return oliveName;
    }

    public long getColor() {
        return color;
    }

    public void setOliveName(OliveName aOliveName) {
        oliveName = aOliveName;
    }

    public void setColor(long aColor) {
        color = aColor;
    }
}
