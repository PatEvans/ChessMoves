package chessengine;

public class Pawn extends Piece{
	boolean twoMove=true;
	
	public Pawn(int startX,int startY,boolean colour){
		this.xPosition=startX;
		this.yPosition=startY;
		this.colour=colour;
	}

	public String toString() {
		return "Pawn " + super.toString();
	}
}
