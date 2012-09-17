//Controls Major Map Functions and Stores both tiles and maps
import java.util.ArrayList;
public class Map {
	ArrayList<ArrayList<Tile>> tiles = new ArrayList<ArrayList<Tile>>();
	ArrayList<ArrayList<Point>> points = new ArrayList<ArrayList<Point>>();
	public Map()
	{
		
		
		createTiles();
		createPoints();
	}
	private void createPoints()
	{
		//6 rows
		//Top and bottom have 7pts
		//then add 2
		//middle 2 rows have 11pts
		ArrayList<Point> temp = new ArrayList<Point>();
		ArrayList<Point> temp1 = new ArrayList<Point>();
		ArrayList<Point> temp2 = new ArrayList<Point>();
		ArrayList<Point> temp3 = new ArrayList<Point>();
		ArrayList<Point> temp4 = new ArrayList<Point>();
		ArrayList<Point> temp5 = new ArrayList<Point>();
		//Fills temps with empty points
		for(int i = 0; i < 7; i++)
		{
			temp.add(new Point());
			temp1.add(new Point());
			temp2.add(new Point());
			temp3.add(new Point());
			temp4.add(new Point());
			temp5.add(new Point());
		}
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{			
				temp2.add(new Point());
				temp3.add(new Point());
			}
			temp1.add(new Point());
			temp4.add(new Point());
		}
		//end fill
		//start associating points with tiles
		//Top and Bottom row
		for(int i = 0; i < 7; i++)
		{
			if(i < 3)
			{
				temp.get(i).addAdjTile(tiles.get(0).get(0));
				temp5.get(i).addAdjTile(tiles.get(4).get(0));
			}
			if(i > 1 && i < 5)
			{
				temp.get(i).addAdjTile(tiles.get(0).get(1));
				temp5.get(i).addAdjTile(tiles.get(4).get(1));
			}
			if(i > 3)
			{
				temp.get(i).addAdjTile(tiles.get(0).get(2));
				temp5.get(i).addAdjTile(tiles.get(4).get(2));
			}
		}
		
		
		
		
	}
	public static void main(String[] args)
	{
		Map test = new Map();
		System.out.print(test.toString());
	}
	private void createTiles()
	{
		ArrayList<Tile> temp = new ArrayList<Tile>();
		ArrayList<Tile> temp2 = new ArrayList<Tile>();
		ArrayList<Tile> temp3 = new ArrayList<Tile>();
		ArrayList<Tile> temp4 = new ArrayList<Tile>();
		ArrayList<Tile> temp5 = new ArrayList<Tile>();
		
		//This array relates to enum in Tile class
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
