package UI;

public class Point {

	
	
	private int shipID;
	private boolean hit;

	private boolean isAvailable;
	
	private int x;
	private int y;
	
	
	
	public Point(int xc, int yc){
		
		
		x=xc;
		
		y=yc;
		shipID=0;

		hit=false;

		isAvailable=false;


	}
	public void addShip(int ID) throws Exception{

		if(shipID!=0){
			
			throw new Exception("Ship already placed here");
			
			
		}
		
		
		shipID=ID;



	}

	public void attack() throws Exception{

		if(isAvailable==false){
			throw new Exception("Point has already been attacked");
		}
		else{
			isAvailable=false;
			if(shipID!=0){

				hit=true;
			}
		}



	}


	public boolean getGuessed(){

		return isAvailable;

	}
	public boolean getHit(){


		return hit;
	}


}
