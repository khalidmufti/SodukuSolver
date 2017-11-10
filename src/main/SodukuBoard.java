package main;
/**
 * 
 */

/**
 * @author Khalid Mufti
 *
 */
public final class SodukuBoard {
	
	public final static int NUM_ROWS = 9;
	public final static int NUM_COLS = 9;
	
	private static int[][] solution;
	
	public static int[][] findSolution (int[][] initialValues, boolean showProgress) 
		throws NoSolutionFoundException { 
	
		if (recursiveSolve(0, 0, initialValues, showProgress)) {
			return solution;
		}
		
		else {
			throw new NoSolutionFoundException("No solution found!");
		}
	}
	
	private static boolean recursiveSolve (int xPos, int yPos, int[][] board, boolean showProgress) { 
		
		//TODO use showProgress
		
		//We will traverse row across first.  This bit of code resets to first column if we are on a new row.
		//Checks if we have gone through the last row then a solution was found so return.
		if (yPos == NUM_COLS) {
			yPos = 0;
			
			//Move on to next row
			xPos = xPos + 1;
			if (xPos == NUM_ROWS) {
				//Solution has been found as no more rows to iterate
				solution = board;
				return true;
			}
		}
	
		//Make sure the value in the cell is "0"; otherwise skip.
		if (board[xPos][yPos] != 0) {
			return recursiveSolve(xPos, yPos + 1, board, showProgress);
		}
		
		//Otherwise iterate through the possible values (1..9) and recursively see if the value is okay
		for (int value = 1; value <= 9; value++) {
			boolean check = isValueValid(xPos, yPos, value, board);
			//if check passed then set value for cell and move on to next column
			if (check == true) {
				board[xPos][yPos] = value;
				if (recursiveSolve(xPos, yPos + 1, board, showProgress) == true) {
					return true;
				}
			}
		}
		
		//If we get here then we need to reset the value of the cell back to 0 as this particular depth search failed to find
		//a solution
		board[xPos][yPos] = 0;
		return false;
	}

	private static boolean isValueValid (int xPos, int yPos, int proposedValue, int[][] board) {
		
		//Check if the proposedValue is already present in the row - which is not allowed
		for (int i=0; i < NUM_COLS; i++) {
			if (board[xPos][i] == proposedValue) {
				//Value is not valid - check failed
				return false;
			}
		}

		//Check if the proposedValue is already present in the column - which is not allowed
		for (int i=0; i < NUM_ROWS; i++) {
			if (board[i][yPos] == proposedValue) {
				//Value is not valid - check failed
				return false;
			}
		}
		
		//Now check the 3x3 grid to make sure number is not already there
		//Calculation will determine the appropriate 3x3 grid and calculate the top left corner grid pos.
		int rowTopCorner = Math.floorDiv(xPos, 3) * 3;
		int colTopCorner = Math.floorDiv(yPos, 3) * 3;
		for (int x=0; x<3; x++) {
			for (int y=0; y<3; y++) {
				if (board[rowTopCorner+x][colTopCorner+y] == proposedValue) {
					//Value is not valid - check failed
					return false;
				}
			}
		}
		
		//All checks passed
		return true;	
	}
	
	public static boolean areTwoBoardsEqual (int[][] board1, int[][] board2) {
		for (int x = 0; x < NUM_ROWS; x++) {
			for (int y = 0; y < NUM_COLS; y++) {
				if (board1[x][y] != board2[x][y]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}
