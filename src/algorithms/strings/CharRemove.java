package algorithms.strings;

public class CharRemove {

	public static void main(String[] args) {
		remove("how are you, abc");
	}
	
	private static void remove(String line){
		String[] s = line.split(",");
		String str = s[0];
		String sub = s[1];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<str.length();i++){
			if (sub.indexOf(str.charAt(i))==-1||str.charAt(i)==' ') sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
	}
}