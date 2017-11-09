package main;
/**
 * 
 */

/**
 * @author Khalid Mufti
 *
 */
public final class SodukuBoard {
	
	public final static int ROW_LENGTH = 9;
	public final static int COL_LENGTH = 9;
	
	
	public static int[][] findSolution (int[][] initialValues, boolean showProgress) 
		throws NoSolutionFoundException { 
	
		if (recursiveSolve(0, 0, initialValues, showProgress)) {
			// Solution found - output to screen
		}
		
		else {
			throw new NoSolutionFoundException();
		}
		
		return new int[ROW_LENGTH][COL_LENGTH];
		
	}
	
	private static boolean recursiveSolve (int xPos, int yPos, int[][] board, boolean showProgress) { 
		
		//TODO use showProgress
		
		//We will traverse y axis first, then move on to x.  This bit of code resets to first column if we are on a new row.
		//Checks if we have gone through the last row then a solution was found so return.
		if (yPos == COL_LENGTH) {
			yPos = 0;
			if (++xPos == ROW_LENGTH) {
				return true;
			}
		}
	
		//Make sure the value in the cell is not "0" as that should not be touched - value is already assigned.  So, skip value
		//and move on.
		if (board[xPos][yPos] != 0) {
			return recursiveSolve(xPos, yPos+1, board, showProgress);
		}
		
		//Otherwise iterate through the possible values (1..9) and recursively see if the value is okay
		for (int values=1; values <=9; values++) {
			//TODO check if VALUES (i) is even valid.  Need to check
			// 1. Across entire row, ii. Entire column  iii. within one of the 9 squares (3x3)
			
		}
		
		//If we get here then we need to reset the value of the cell back to 0 as this particular depth search failed to find
		//a solution
		board[xPos][yPos] = 0;
		return false;
	}

	private static boolean isValueValid (int xPos, int yPos, int proposedValue, int[][] board) {
		
		//Check if the proposedValue is already present in the row - which is not allowed
		for (int i=0; i<= COL_LENGTH; i++) {
			if (board[xPos][i]==proposedValue)
				return false;
		}

		//Check if the proposedValue is already present in the column - which is not allowed
		for (int i=0; i<= ROW_LENGTH; i++) {
			if (board[i][yPos]==proposedValue)
				return false;
		}
		
		//Now check the 3x3 grid to make sure number is not already there
		//TODO think about this
		
		return false;	
	}
	
	private static boolean recursiveSolve (int xPos, int yPos, int[][] board) { 

			return SodukuBoard.recursiveSolve(xPos, yPos, board, false);
		}
}
