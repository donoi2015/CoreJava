package lynda.advanced.collections.olives;

public class Olive implements Comparable<Olive> {

    public OliveName oliveName;
    public OliveColor color;

    public Olive() {
    }

    public Olive(OliveName oliveName, OliveColor color) {
        this.oliveName = oliveName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "oliveName: " + this.oliveName.toString() +
                ", color: " + this.color.toString();
    }

    @Override
    public int compareTo(Olive aO) {
        String s1 = this.getClass().getSimpleName();
        String s2 = aO.getClass().getSimpleName();
        return s1.compareTo(s2);
    }

}
