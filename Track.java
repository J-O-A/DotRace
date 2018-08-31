
public class Track {
	private Tile[] raceTrack;
	
	public Track() {
		raceTrack=new Tile[32];
		raceTrack[0].chR();
		raceTrack[0].chB();
		raceTrack[0].chG();
		raceTrack[0].chY();}
	
	public void moveR(int x){
		int p=pos("R");
		raceTrack[p].chR();
		raceTrack[p+x].chR();}
	public void moveB(int x){
		int p=pos("B");
		raceTrack[p].chB();
		raceTrack[p+x].chB();}
	public void moveG(int x){
		int p=pos("G");
		raceTrack[p].chG();
		raceTrack[p+x].chG();}
	public void moveY(int x){
		int p=pos("Y");
		raceTrack[p].chY();
		raceTrack[p+x].chY();}
	
	public int pos(String s) {
		if (s.equals("R"))
			for(int i=0;i<raceTrack.length;i++)
				if (raceTrack[i].getR())
					return i;
		else if (s.equals("B"))
			for(int j=0;j<raceTrack.length;j++)
				if (raceTrack[j].getB())
					return j;
		else if (s.equals("G"))
			for(int k=0;k<raceTrack.length;k++)
				if (raceTrack[k].getG())
					return k;
		else if (s.equals("Y"))
			for(int l=0;l<raceTrack.length;l++)
				if (raceTrack[l].getY())
					return l;
		return -1;}

}
