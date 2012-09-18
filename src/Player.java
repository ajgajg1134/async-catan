import java.util.ArrayList;

public class Player {
	ArrayList<Point> ownedPoints = new ArrayList<Point>();
	ArrayList<Road> ownedRoads = new ArrayList<Road>();
	int sheep, stone, brick, wood, wheat;
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
	public void trade(String type, int num)
	{
		switch(type)
		{
		case "wood": wood -= num; break;
		case "stone": stone -= num; break;
		case "wheat": wheat -= num; break;
		case "sheep": sheep -= num; break;
		case "brick": brick -= num; break;
		default: System.err.print("ERROR: Trade attempt without proper type");
		}
	}
	public int getResourceCount(String type)
	{
		switch(type)
		{
		case "wood": return wood;
		case "stone": return stone;
		case "wheat": return wheat;
		case "sheep": return sheep;
		case "brick": return brick;
		default: System.err.print("ERROR: getResource attempt without proper type");
		}
		return -1;
	}
}
