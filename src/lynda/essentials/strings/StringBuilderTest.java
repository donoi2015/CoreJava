package lynda.essentials.strings;

public class StringBuilderTest {
    // User when concatenating in a loop or something.
    public static void main(String[] args) {
        String s1 = "Hi guys!";
        char d = 'D';
        StringBuilder sb = new StringBuilder(s1);
        sb.append(" ");
        sb.append(s1);
        sb.append(" ");
        sb.append(d);
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder(s1);
        for (int i = 1; i < 5; i++) {
            sb2.append(" Wow, Deja Vu!");
        }
        System.out.println(sb2);
        System.out.println(decorateTheString(s1));
    }

    private static String decorateTheString(String orgStr) {
        StringBuilder builder = new StringBuilder();
        builder.append(orgStr);
        builder.deleteCharAt(orgStr.length() - 1);
        builder.insert(0, builder.hashCode());
        return builder.toString();
    }

}
