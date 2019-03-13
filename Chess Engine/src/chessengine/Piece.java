package chessengine;
import java.util.ArrayList;
public class Piece {
  //these are represented as cartesian coords
  // in which x and y are represented 
  // are 0-7
  int xPosition;
  int yPosition;
  ArrayList<String> possibleLocations = new ArrayList<String>();;
  int colour;
  public void addToPossibleLocations(int x,int y) {
	  if(x>7 || y>7 || x<0 || y<0 ) return;
	  possibleLocations.add(x+""+y);
  }
  public String toString() {
	  return xPosition + " " + yPosition + " " + colour + "   " +possibleLocations;
  }
  
}
