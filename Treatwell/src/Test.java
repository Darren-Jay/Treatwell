
public class Test {

	public static void main(String[] args) {
		
		GridExample(); //calling the grid method 
		
		

	}

	
	public static void GridExample() {
		
		StdDraw.setScale(0,5); // setting the scale of the grid, 0,5 means it will fit a 5 by 5

		int[][] GridSize = new int [4][4]; //enter grid size here

		for (int x = 0; x < GridSize.length; x++) 
		{
		  for (int y = 0; y < GridSize.length; y++)
		  {
		   // GridSize[x][y] =255;
		  }
		}

		for (int x = 0; x < GridSize.length; x++)
		{
		  for (int y = 0; y <GridSize.length; y++)
		  {
		    StdDraw.square(x, y, 1); //drawing the scale according to the input of grid size 
		  }
		}
		
		
		
	}
	
	
	
	
	
}
