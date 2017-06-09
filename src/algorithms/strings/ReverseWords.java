package algorithms.strings;

public class ReverseWords {

	public static void main(String[] args) {
		reverse("Dogs are for men");
	}
	
	private static void reverse(String s){
		String[] words = s.split(" ");
		for(int i =words.length-1; i>=0;i--){
			System.out.print(words[i]);
			if(i!=0) System.out.print(" ");
		}
		System.out.println();
	}

}
