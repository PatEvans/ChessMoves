package chessengine;

public class Queen extends Piece{

	public Queen(int startX,int startY,boolean colour){
		this.xPosition=startX;
		this.yPosition=startY;
		this.colour=colour;
	}
	public String toString() {
		return "Queen " + super.toString();
	}
}
