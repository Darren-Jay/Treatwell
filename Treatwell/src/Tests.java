import static org.junit.Assert.*;

import org.junit.Test;

public class Tests { //Using JUnit for the testing

	//JUnit testing is good to define the flow of execution of the code 
	// Tests if code is working exactly the way it should, even after changes
	
	@Test
	public void testMain() {  //This test is testing the main 
		DrawBox a = new DrawBox(4,4); 
		a.Draw(); 
	}



}
