public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println(&quot;You&#39;re awesome&quot;);
		else if (score &gt; 90)
			System.out.println(&quot;That&#39;s great&quot;);
		else if (score &gt; 60)
			System.out.println(&quot;That&#39;s good &quot;);
		else
			System.out.println(&quot;Well, what can I say?&quot;);
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}