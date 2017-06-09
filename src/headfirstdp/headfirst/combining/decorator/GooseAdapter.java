package headfirstdp.headfirst.combining.decorator;

public class GooseAdapter implements Quackable {
	private Goose goose;
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
  
	public void quack() {
		goose.honk();
	}
 
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
