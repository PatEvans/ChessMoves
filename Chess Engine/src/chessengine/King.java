package chessengine;

public class King extends Piece{

	public King(int startX,int startY,boolean colour){
		this.xPosition=startX;
		this.yPosition=startY;
		this.colour=colour;
	}
	public String toString() {
		return "King " + super.toString();
	}
}
