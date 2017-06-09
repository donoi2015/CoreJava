package lynda.essentials.debugging;

import java.net.URI;
import java.net.URISyntaxException;

public class LibeBreakTest {

    public static void main(String[] args) {
	
	try {
	    URI uri = new URI("http:\\happyfaces.com");
	} catch (URISyntaxException e) {
	    System.err.println(e.getMessage());
	}
	System.out.println("I'm alive!");
	
    }

}
