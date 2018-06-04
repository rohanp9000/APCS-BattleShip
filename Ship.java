
public class Ship {


	private String name;


	private int size;


	private boolean isVertical;

	private int lives;

	private Point head;
	private Point tail;

	public Ship(String nm, int s){
		name=nm;
		size=s;
		lives=size;
	}

	public String getName(){

		return name;
	}
	public int getLength(){



		return size;
	}
	public boolean sunk(){
		if (lives == 0)
			return true;
		else
			return false;
	}

	public void setDirection(boolean dir){
		isVertical=dir;
	}
	
	public void setCoordinates(int row1, int row2, int column1, int column2){
		head=new Point(row1, column2);
		tail=new Point(row2, column1);
	}
	
	public Point getHead(){

		return head;
	}
	public Point getTail(){

		return tail;
	}






}








