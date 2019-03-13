package chessengine;

public class Piece {
  //these are represented as cartesian coords
  // in which x and y are represented 
  // are 0-7
  int xPosition;
  int yPosition;
  boolean colour;
  
  public String toString() {
	  return xPosition + " " + yPosition + " " + colour;
  }
  
}
