package javalang.loops;

public class DoWhile {

    public static void main(String[] args) {
	int count = 1;
        do {
             System.out.println("Count is: " + count);
             count++;
             if(count>10)break;
        } while (true);
    }
}
