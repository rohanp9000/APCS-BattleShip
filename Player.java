package UI;

public class Player {

	Battlefield b;
	
	Ship[] ships;
	
	public Player(){
		
		
		b=new Battlefield();
		
		ships = new Ship[5];
		ships={new Ship(2),new Ship(3),new Ship(4),new Ship(5),new Ship(6)};
		
			
	}
	
	
}
