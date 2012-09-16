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
		ArrayList<Tile> temp2 = new ArrayList<Tile>();
		ArrayList<Tile> temp3 = new ArrayList<Tile>();
		ArrayList<Tile> temp4 = new ArrayList<Tile>();
		ArrayList<Tile> temp5 = new ArrayList<Tile>();
		
		int[] setup = {4, 3, 4, 4, 3, 1};
		
		for(int i = 0; i < 3; i++)
		{
			int type = (int)(Math.random()*6);

			while(setup[type] <= 0)
			{
				type = (int)(Math.random()*6);					
			}
			temp.add(new Tile(type));
			setup[type]--;
		}

		tiles.add(temp);

		for(int i = 0; i < 4; i++)
		{
			int type = (int)(Math.random()*6);

			while(setup[type] <= 0)
			{
				type = (int)(Math.random()*6);
			}
			temp2.add(new Tile(type));
			setup[type]--;
		}

		tiles.add(temp2);
		for(int i = 0; i < 5; i++)
		{
			int type = (int)(Math.random()*6);

			while(setup[type] <= 0)
			{
				type = (int)(Math.random()*6);					
			}
			temp3.add(new Tile(type));
			setup[type]--;
		}
		tiles.add(temp3);

		for(int i = 0; i < 4; i++)
		{
			int type = (int)(Math.random()*6);

			while(setup[type] <= 0)
			{
				type = (int)(Math.random()*6);					
			}
			temp4.add(new Tile(type));
			setup[type]--;
		}
		tiles.add(temp4);

		for(int i = 0; i < 3; i++)
		{
			int type = (int)(Math.random()*6);

			while(setup[type] <= 0)
			{
				type = (int)(Math.random()*6);					
			}
			temp5.add(new Tile(type));
			setup[type]--;
		}
		tiles.add(temp5);

	}
	public String toString()
	{
		String s = "";
		
		for(ArrayList<Tile> arr : tiles)
		{
			for(Tile t : arr)
			{
				s += " " + t.toString();
			}
			s += "\n";
		}
		return s;	
	}
}
