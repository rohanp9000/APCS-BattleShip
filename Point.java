
public class Point {

	
	
	private boolean hasShip;

	private boolean hit;

	private boolean isAvailable;
	
	private int x;
	private int y;
	
	
	
	public Point(int xc, int yc){
		
		
		x=xc;
		
		y=yc;
		hasShip=false;

		hit=false;

		isAvailable=false;


	}
	public void addShip() throws Exception{

		if(hasShip){
			
			throw new Exception("Ship already placed here");
			
			
		}
		
		
		hasShip=true;



	}

	public void attack() throws Exception{

		if(isAvailable==false){
			throw new Exception("Point has already been attacked");
		}
		else{
			isAvailable=false;
			if(hasShip){

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

