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
	public Tile(int tp)
	{
		type = tileType.values()[tp];
	}
	public Tile(tileType tp, int tk)
	{
		type = tp;
		token = tk;
	}
	public tileType getType()
	{ return type; }
	public void setToken(int t)
	{ token = t; }
	public int getToken()
	{ return token; }
	public String toString()
	{
		String s = "";
		s += type.toString() + ":" + token;
		return s;
	}
}
