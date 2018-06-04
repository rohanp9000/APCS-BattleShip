package UI;

public class Battlefield {

	private Point[][] grid;
	private static final int LENGTH=10;
	
	
	
	public Battlefield(){
		grid=new Point[LENGTH][LENGTH];
		
		for(int i=0; i<LENGTH;i++){
			
			
			for(int j=0; j<LENGTH;j++){
				
				grid[i][j]=new Point(i,j);
			}
		}
		
		
	}
	
	public void placeShip(int row1, int column1, int row2, int column2, Ship s) throws Exception{
		if(row1>LENGTH ||row2>LENGTH ||column1>LENGTH || column2>LENGTH){
			
			throw new Exception("Enter valid coordinates to place ship");
			
			
		}
		
		if(row1==row2){
			
			if(Math.abs(column1-column2)!=s.getID()){
				
				
				throw new Exception(s.getName()+" must be "+ s.getID());
				
			}
		
			for(int i=Math.min(column1, column2);i<Math.max(column1, column2);i++){
				
				grid[row1][i].addShip(s.getID());
				
			}
		
			
			
		}
		else if(column1==column2){
			if(Math.abs(row1-row2)!=s.getID()){
				
				
				throw new Exception(s.getName()+" must be "+ s.getID());
				
			}
		
			for(int i=Math.min(row1, row2);i<Math.max(row1, row2);i++){
				
				grid[i][column1].addShip(s.getID());
			}
		
			
			
		}
		
		
		else{
			
			throw new Exception("Ship can not be placed diagonally");
			
			
		}
		

			

		
	}
	
public boolean checkHit(int x, int y) throws Exception{
	
	
	attack(x,y);
	
	return grid[x][y].getHit();
	
	
	
}
private void attack(int x, int y) throws Exception{
	
	
	
	grid[x][y].attack();
	
	
	
	
}


}
