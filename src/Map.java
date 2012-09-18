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
		int[] tileTypes = {4, 3, 4, 4, 3, 1};
		int[] tokens = {0, 1, 2, 2, 2, 2, 0, 2, 2, 2, 2, 1};
		
		for(int i = 0; i < 3; i++)
		{
			int type = (int)(Math.random()*6);

			while(tileTypes[type] <= 0)
				type = (int)(Math.random()*6);	
			
			tileTypes[type]--;
	
			int tok = (int)(Math.random()*11) + 1;//Random # between 1 and 12(incl)
			while(tokens[tok] <= 0)
				tok = (int)(Math.random()*11) + 1;
			
			if(type != 5)
				tokens[tok]--;
			else
				tok = 0;
			
			temp.add(new Tile(type, tok));
			
		}

		tiles.add(temp);

		for(int i = 0; i < 4; i++)
		{
			int type = (int)(Math.random()*6);

			while(tileTypes[type] <= 0)
			{
				type = (int)(Math.random()*6);
			}
			tileTypes[type]--;
			
			int tok = (int)(Math.random()*11) + 1;
			while(tokens[tok] <= 0)
				tok = (int)(Math.random()*11) + 1;
			
			if(type != 5)
				tokens[tok]--;
			else
				tok = 0;
			
			temp2.add(new Tile(type, tok));
		}

		tiles.add(temp2);
		for(int i = 0; i < 5; i++)
		{
			int type = (int)(Math.random()*6);

			while(tileTypes[type] <= 0)
			{
				type = (int)(Math.random()*6);					
			}
			tileTypes[type]--;
			
			int tok = (int)(Math.random()*11) + 1;
			while(tokens[tok] <= 0)
				tok = (int)(Math.random()*11) + 1;
			
			if(type != 5)
				tokens[tok]--;
			else
				tok = 0;
			
			temp3.add(new Tile(type, tok));
		}
		tiles.add(temp3);

		for(int i = 0; i < 4; i++)
		{
			int type = (int)(Math.random()*6);

			while(tileTypes[type] <= 0)
			{
				type = (int)(Math.random()*6);					
			}
			tileTypes[type]--;
			
			int tok = (int)(Math.random()*11) + 1;
			while(tokens[tok] <= 0)
				tok = (int)(Math.random()*11) + 1;
			
			if(type != 5)
				tokens[tok]--;
			else
				tok = 0;
			
			temp4.add(new Tile(type, tok));
		}
		tiles.add(temp4);

		for(int i = 0; i < 3; i++)
		{
			int type = (int)(Math.random()*6);

			while(tileTypes[type] <= 0)
			{
				type = (int)(Math.random()*6);					
			}
			tileTypes[type]--;
			
			int tok = (int)(Math.random()*11) + 1;
			while(tokens[tok] <= 0)
				tok = (int)(Math.random()*11) + 1;
			
			if(type != 5)
				tokens[tok]--;
			else
				tok = 0;
			
			temp5.add(new Tile(type, tok));
		}
		tiles.add(temp5);

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
		/*
		 * This part manually adds adjacent tiles to points
		 */
		for(int i = 0; i < 11; i++)
		{
			if(i < 3)
			{
				//Top and Bot
				temp.get(i).addAdjTile(tiles.get(0).get(0));
				temp5.get(i).addAdjTile(tiles.get(4).get(0));
				//Next Inner
				temp1.get(i).addAdjTile(tiles.get(1).get(0));
				temp4.get(i).addAdjTile(tiles.get(3).get(0));
				//Innermost
				temp2.get(i).addAdjTile(tiles.get(2).get(0));
				temp3.get(i).addAdjTile(tiles.get(2).get(0));
			}
			if(i > 1 && i < 5)
			{
			
				temp.get(i).addAdjTile(tiles.get(0).get(1));
				temp5.get(i).addAdjTile(tiles.get(4).get(1));
				
				temp1.get(i).addAdjTile(tiles.get(1).get(1));
				temp4.get(i).addAdjTile(tiles.get(3).get(1));
				
				temp2.get(i).addAdjTile(tiles.get(2).get(1));
				temp3.get(i).addAdjTile(tiles.get(2).get(1));
			}
			if(i > 3 && i < 7)
			{
				temp.get(i).addAdjTile(tiles.get(0).get(2));
				temp5.get(i).addAdjTile(tiles.get(4).get(2));
				
				temp1.get(i).addAdjTile(tiles.get(1).get(2));
				temp4.get(i).addAdjTile(tiles.get(3).get(2));
				
				temp2.get(i).addAdjTile(tiles.get(2).get(2));
				temp3.get(i).addAdjTile(tiles.get(2).get(2));
			}
			if(i > 5 && i < 9)
			{
				temp1.get(i).addAdjTile(tiles.get(1).get(3));
				temp4.get(i).addAdjTile(tiles.get(3).get(3));
				
				temp2.get(i).addAdjTile(tiles.get(2).get(3));
				temp3.get(i).addAdjTile(tiles.get(2).get(3));
			}
			if(i > 7)
			{
				temp2.get(i).addAdjTile(tiles.get(2).get(4));
				temp3.get(i).addAdjTile(tiles.get(2).get(4));
			}
			
			//Now to add exterior portion
			if(i > 0 && i < 4)
			{
				temp1.get(i).addAdjTile(tiles.get(0).get(0));
				temp4.get(i).addAdjTile(tiles.get(4).get(0));
				
				temp2.get(i).addAdjTile(tiles.get(1).get(0));
				temp3.get(i).addAdjTile(tiles.get(3).get(0));
			}
			if(i > 2 && i < 6)
			{
				temp1.get(i).addAdjTile(tiles.get(0).get(1));
				temp4.get(i).addAdjTile(tiles.get(4).get(1));
				
				temp2.get(i).addAdjTile(tiles.get(1).get(1));
				temp3.get(i).addAdjTile(tiles.get(3).get(1));
			}
			if(i > 4 && i < 8)
			{
				temp1.get(i).addAdjTile(tiles.get(0).get(2));
				temp4.get(i).addAdjTile(tiles.get(4).get(2));
				
				temp2.get(i).addAdjTile(tiles.get(1).get(2));
				temp3.get(i).addAdjTile(tiles.get(3).get(2));
			}
			if(i > 6 && i < 10)
			{
				temp2.get(i).addAdjTile(tiles.get(1).get(3));
				temp3.get(i).addAdjTile(tiles.get(3).get(3));
			}
			
		}//This ends for loop
		
		
		
		
		points.add(temp);
		points.add(temp1);
		points.add(temp2);
		points.add(temp3);
		points.add(temp4); 
		points.add(temp5);
		
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
		s += points.get(2).get(0).toString();
		return s;	
	}
}
