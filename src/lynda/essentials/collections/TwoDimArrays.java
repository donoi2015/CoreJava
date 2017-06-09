package lynda.essentials.collections;

public class TwoDimArrays {

    public static void main(String[] args) {
	String[][] states = new String[3][2];
	states[0][0]= "California";
	states[0][1]= "Sacramento";
	states[1][0]= "Oregon";
	states[1][1]= "Salem";
	states[2][0]= "Washington";
	states[2][1]= "Olympia";
        for (String[] state : states) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < state.length; j++) {
                if (j == 0) {
                    sb.append("Capitol of: ");
                } else {
                    sb.append(" is ");
                }
                sb.append(state[j]);
            }
            System.out.println(sb);
        }
    }

}
