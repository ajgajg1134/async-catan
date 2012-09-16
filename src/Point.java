
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
	
	boolean hasHarbor;
	private Occupation occ;
	private Owner owner;
	
	public Point()
	{
		owner = Owner.EMPTY;
		occ = Occupation.EMPTY;
		hasHarbor = false;
	}
	public void setOccupation(Occupation o)
	{
		occ = o;
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
}
