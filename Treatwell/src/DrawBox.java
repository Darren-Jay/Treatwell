
public class DrawBox {

	private int width; //private because these instances are only called in this class
	private int height;
	
	
	
public DrawBox(int w, int h) { //this method is stating what type of variables they are
		
	
		width = w;  //width value will be stored in "w"
		height = h; //height value will be stored in "h"
	
}

//This method is doing the actual drawing of the square/box
	public void Draw() {
		
		
		for(int i = 0; i < width; i++) { //for loop is for the amount of hyphens for the top width
			System.out.print("-"); //width top
			System.out.print("  "); //added spacing to draw a square/box
		}
		
		System.out.println();
		
		for(int i = 0; i < height; i++) { //this for loop is for the left side of height
			System.out.print("|"); // height left
						
			
			for(int j = 0; j < width; j++) { //this loop is for the right side of height
				System.out.print("  "); //this give equal spacing for the right side of the height
				
			}
			
			System.out.print("|"); //For the when w = 4 for example, this for loop matches width and prints the height "|"
			System.out.println();
			
		}
		
		for(int i = 0; i < width; i++) {
			System.out.print("-");  //width bottom 
			System.out.print("  "); //space between the dashes
		}
	
	}
	
	
}	
	
	
	
	
	
	

	
	
	
	

