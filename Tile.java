
public class Tile {
	private boolean R;
	private boolean B;
	private boolean G;
	private boolean Y;
	public Tile() {
		R=B=G=Y=false;}
	
	public void chR() {
		R=!R;}
	public void chB() {
		B=!B;}
	public void chG() {
		G=!G;}
	public void chY() {
		Y=!Y;}
	public boolean getR() {
		return R;}
	public boolean getB() {
		return B;}
	public boolean getG() {
		return G;}
	public boolean getY() {
		return Y;}
	public String toString() {
		String s="";
		if (R)
			s+="R";
		else
			s+="*";
		if (B)
			s+="B";
		else
			s+="*";
		if (G)
			s+="G";
		else
			s+="*";
		if (Y)
			s+="Y";
		else
			s+="*";
		return s;}

}
