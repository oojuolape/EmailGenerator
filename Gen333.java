public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("Youre awesome");
		else if (score &gt; 90)
			System.out.println("That's great");
		else if (score &gt; 60)
			System.out.println("That's good");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}
