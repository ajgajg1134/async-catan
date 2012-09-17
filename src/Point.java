
//Tips of Hexagons
public class Point {
	public enum Occupation
	{
		EMPTY,
		TOWN,
		CITY
	}
	public enum Owner
	{
		EMPTY,
		RED,
		BLUE,
		ORANGE,
		WHITE
	}
	
	Tile[] adjTiles = new Tile[3];
	
	boolean hasHarbor;
	private Occupation occ;
	private Owner owner;
	
	public Point()
	{
		owner = Owner.EMPTY;
		occ = Occupation.EMPTY;
		hasHarbor = false;
		for(int i = 0; i < 3; i++)
			adjTiles[i] = null;
	}
	public Point(Tile t0, Tile t1, Tile t2)
	{
		super();
		adjTiles[0] = t0;
		adjTiles[1] = t1;
		adjTiles[2] = t2;
	}
	public void setOccupation(Occupation o)
	{
		occ = o;
	}
	public void addAdjTile(Tile t)
	{
		for(int i = 0; i < 3; i++)
		{
			if(adjTiles[i] == null)
			{
				adjTiles[i] = t;
				return;
			}
		}		
		System.err.print("ERROR: Adding tile to full point failed: " + this.toString());
	}
	public  Occupation getOccupation()
	{ return occ; }
	public void setOwner(Owner ow)
	{
		owner = ow;
	}
	public void toggleHarbor()
	{
		hasHarbor = !hasHarbor;
	}
	public boolean getHarborStatus()
	{ return hasHarbor; }
	public String toString()
	{
		String s = "";
		for(Tile t: adjTiles)
		{
			if(t != null)
				s += t.toString() + "\n";
		}
		return s;
	}
}
