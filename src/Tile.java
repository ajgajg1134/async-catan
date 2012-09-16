

public class Tile {
	public enum tileType
	{
		FOREST,
		MOUNTAIN,
		PLAINS,
		FIELDS,
		PASTURE,
		HILLS,
		DESERT	
	}
	private tileType type;
	public Tile(tileType tp)
	{
		type = tp;
	
	}
}
