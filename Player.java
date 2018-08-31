import java.util.ArrayList;

public class Player {
	private String name;
	ArrayList<String> order = new ArrayList <String>();
	
	public Player (String n) {
		name=n;}
	public String NOrder(String o) {
		if(o.equals("R")||o.equals("B")||o.equals("G")||o.equals("Y")) {
			if (order.size()==0)
				order.add(o);
			else if (o.equals(order.get(order.size()-1)))
				return o+" may not roll because "+o+" rolled last";
			else {
				order.add(o);
				return o+" will roll next";}
		}
		return "Not a valid die";}

}
