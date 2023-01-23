package oops;

public class Instructions {

	
	public void print_ins() {
	
	System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"__INSTRUCTIONS__");
	System.out.println('\n');
	 System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"1)Each player has to place their 5 ships somewhere on their grid.\r\n"+"\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "2)The 5 ships are:  \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ "2.1)Carrier (occupies 5 spaces)\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ "2.2) Battleship (occupies 4 spaces)\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ "2.3) Cruiser (occupies 3 spaces)\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"2.4) Submarine (occupies 3 spaces) \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ "2.5)Destroyer (occupies 2 spaces).  \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "3)The ships can only be placed vertically or horizontally. \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "4)Diagonal placement of ships is not allowed on the grid. \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "5)No part of a ship may hang off the edge of the grid.  \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "6)Ships can touch each other, but they can't occupy the same grid space.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "7)The player can reallocate the ship and keep where ever he desires.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "8)The player cannot change the position of the ships after the game begins.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "9)The player cannot select the coordinates of the destroyed ship area.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "10)Each player gets 3 shots in one chance.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "11)The player will get the timer of 30 seconds to complete his 3 shots.\r\n"
			+ "\t"+"\t"+"\t"+"\t"+"\t"+ "12)Enter x or X to place the ship on the grid\r\n");
	 
	 System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"__SYMBOLS TO BE NOTICED__");
	 System.out.println('\n');
	 System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"1)* : It represents the area of the ship.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+"2)'X' : It is used to represent the attacked area of the ship.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "3)'&' : It represents when whole ship is destroyed. \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "4)'O' : It displays when the player miss the shot. \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "5)' ' : It represents the empty space on the grid.  \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "5)'@' : It is used to navigate on the grid.  \r\n\n");

	 
	 System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"__NAVIGATION KEYS__");
	 System.out.println('\n');
	 System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"1)'A' : Used to move to the left side on the grid.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+"2)'S' : Used to move to bottom side on the grid.\r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "3)'D' : Used to move to right side on the grid. \r\n"
			 +"\t"+"\t"+"\t"+"\t"+"\t"+ "4)'W' : Used to move to top side on the grid. \r\n"
);
	}
}
