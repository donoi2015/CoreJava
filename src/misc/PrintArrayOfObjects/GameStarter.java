package misc.PrintArrayOfObjects;

public class GameStarter {

    public static void main(String[] args) {
	GameEntry one = new GameEntry("Joanna", 240);
	GameEntry three = new GameEntry("Harvey", 1000);
	GameEntry two = new GameEntry("Donna", 640);
	Scores scorelist = new Scores();
	scorelist.add(one);
	scorelist.add(two);
	scorelist.add(three);
	System.out.println(scorelist);
    }
}
