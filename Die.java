
public class Die {
	private String name;
	public Die (String s) {
		name=s;}
	public int roll() {
		int s= (int)Math.random()*6+1;
		return s;
	}

}
