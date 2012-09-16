//Controls Major Map Functions and Stores both tiles and maps
import java.util.ArrayList;
public class Map {
	ArrayList<ArrayList<Tile>> tiles = new ArrayList<ArrayList<Tile>>();
	public Map()
	{
		
		
		createTiles();
		
	}
	private void createTiles()
	{
		ArrayList<Tile> temp = new ArrayList<Tile>();
		int[] setup = {4, 3, 4, 4, 4, 3, 1};
		for(int i = 0; i < 3; i++)
		{
			int type = (int)Math.random()*7;
			if(setup[type] > 0)
			{
				temp.add(new Tile(type));
				setup[type]--;
			}s
			
		}
			
		
	}
}
