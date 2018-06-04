package UI;

public class Ship {

	
	private String name;
	
	private int ID;//serves as ID the ship and the length
	

	
	
	
	private int lives;
	

	


	
	
	public Ship(int id){
		
		ID=id;
		
		switch(ID){
		
		case 2: name= "Destroyer";
		
		case 3: name="Submarine";
		
	
		
		case 4: name="Battleship";
		
		case 5: name="Carrier";
		
		case 6: name="Ultimate Patrol Boat";
		
		
		}
		

			
		lives=ID;
	}
	
public String getName(){
		
		
		
		return name;
	}
	
	public boolean sunk(){
		
		if (lives<=0)
		
			return true;
		
		else
			return false;
		
	}
	
public void hitShip(){
	
	
	lives--;
	
}
public int getID(){
	
	return ID;
	
	
}
	
	
	
	
	
	
}
