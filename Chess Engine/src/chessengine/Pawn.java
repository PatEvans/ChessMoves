package chessengine;

public class Pawn extends Piece{
	boolean unmoved=true;
	
	public Pawn(int startX,int startY,int colour){
		this.xPosition=startX;
		this.yPosition=startY;
		this.colour=colour;
	}
	@Override
    public void possibleMoves() {
    	 this.addToPossibleLocations(xPosition,(yPosition+(1*colour)));
    	if(unmoved) {
    		 this.addToPossibleLocations(xPosition,(yPosition+(2*colour)));
    	}
    }
	public String toString() {
		return "Pawn " + super.toString();
	}
}
