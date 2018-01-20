// By: Prahlad Panthi
// to calculate the number of moves of a queen in a chess board

package problem;

import java.util.Scanner;

public class QueenMoves{
	
	private int positionX, positionY;
	private static final int FIXED_MOVES = 14;
	
	private void getPosition(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position of the queen: ");
		positionX = sc.nextInt();
		positionY = sc.nextInt();
		sc.close();
	} 
	
	private int totalMoves(int positionX, int positionY){
		int move1 = 0, move2 = 0, move3 = 0, move4 = 0;
		// min distance for 1st quadrant
		if(positionX > 1 && positionY > 1)
			move1 = (positionY-1 < positionX-1)?positionY-1:positionX-1;
		
		// min distance for 2nd quadrant
		if(positionX < 8 && positionY > 1)
			move2 = (positionY-1 < 8-positionX)?positionY-1:8-positionX;
		
		// min distance for 3rd quadrant
		if(positionX > 1 && positionY < 8)
			move3 = (8-positionY < positionX-1)?8-positionY:positionX-1;
		
		// min distance for 4th quadrant
		if(positionX < 8 && positionY < 8)
			move4 = (8-positionY < 8-positionX)?8-positionY:8-positionX;
		
		// adding all the moves and returning
		return (FIXED_MOVES+move1+move2+move3+move4);
	}
	
	public static void main(String[] args){
		QueenMoves qm = new QueenMoves();
		qm.getPosition();
		int total = qm.totalMoves(qm.positionX, qm.positionY);
		System.out.println("Total Moves: "+total);
	}
}
