import java.util.ArrayList;

public class Player {
	ArrayList<Point> ownedPoints = new ArrayList<Point>();
	ArrayList<Road> ownedRoads = new ArrayList<Road>();
	int sheep, stone, brick, wood, wheat;
	/*0  FOREST,
	 *1	MOUNTAIN,
	 *2	FIELDS,
	 *3	PASTURE,
	 *4	HILLS,
	 *5	DESERT  */
	public Player()
	{
		sheep = 0; 
		stone = 0;
		brick = 0;
		wood = 0;
		wheat = 0;
	}
	//PRECONDITION: Point being added must have settlement on it.
	public void addPoint(Point p)
	{
		ownedPoints.add(p);
	}
	public void addRoad(Road r)
	{
		ownedRoads.add(r);
	}
	public void diceRoll(int rolled)
	{
		for(Point p : ownedPoints)
		{
			for(Tile t: p.getAdjTiles())
			{
				if(t.getToken() == rolled && !t.hasRobber())
				{
					typeToResource(t.getType());
					if(p.getOccupation() == Point.Occupation.CITY)
						typeToResource(t.getType());
				}
			}
			
		}
	}
	private void typeToResource(Tile.tileType t)
	{
		switch(t)
		{
			case FOREST: wood++; break;
			case MOUNTAIN: stone++; break;
			case FIELDS: wheat++; break;
			case PASTURE: sheep++; break;
			case HILLS: brick++; break;
			default: break;

		}
	}
	
}
