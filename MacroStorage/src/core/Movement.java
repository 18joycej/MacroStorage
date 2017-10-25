package core;

public class Movement extends Step{
	protected int mouseX;
	protected int mouseY;
	public Movement(int someX, int someY){
		mouseX=someX;
		mouseY=someY;
	}
	public int getX(){
		return mouseX;
	}
	public int getY(){
		return mouseY;
	}
}
