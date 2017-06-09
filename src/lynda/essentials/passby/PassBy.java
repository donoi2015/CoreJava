package lynda.essentials.passby;

public class PassBy {
//Always pass by copy
    public static void main(String[] args) {
	//primitive
	System.out.println("\tPrimitive");
	int x = 10;
	System.out.println("Before function:"+x);
	increment(x);
	System.out.println("After function:"+x+"\n");

	//complex object (int[])
	System.out.println("\tComplex object");
	int[] y ={10};
	System.out.println("Before function:"+y[0]);
	increment(y);
	System.out.println("After function:"+y[0]+"\n");
	
	//String
	System.out.println("\tString");
	String str = "String!";
	System.out.println("Before function:"+str);
	increment();
	System.out.println("After function:"+str+"\n");
    }
    private static void increment(int x){
	x++;
	System.out.println("Inside function: "+x);
    }
    private static void increment(int[] y){
	y[0]++;
	System.out.println("Inside function: "+y[0]);
    }
    private static void increment(){
		String str = "In function!";
	System.out.println("Inside function: "+ str);
    }

}
