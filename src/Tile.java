public class Tile {
	public enum tileType
	{
		FOREST,
		MOUNTAIN,
		FIELDS,
		PASTURE,
		HILLS,
		DESERT	
	}
	private tileType type;
	private int token;
	private boolean hasRobber;
	public Tile(int tp)
	{
		type = tileType.values()[tp];
		hasRobber = false;
	}
	public Tile(int tp, int tk)
	{
		type = tileType.values()[tp];
		token = tk;
		hasRobber = false;
	}
	public tileType getType()
	{ return type; }
	public void setToken(int t)
	{ token = t; }
	public int getToken()
	{ return token; }
	public boolean hasRobber()
	{ return hasRobber; }
	public void toggleRobber()
	{ hasRobber = !hasRobber; }
	public String toString()
	{
		String s = "";
		s += type.toString() + ":" + token;
		return s;
	}
}
