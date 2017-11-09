package main;
/**
 * 
 */

/**
 * @author Khalid Mufti
 *
 */
public class SodukuBoard {
	
	private int rowSize;
	private int columnSize;
	private SodukuBoardCell[][] board;
		
	/**
	 * @param rowSize
	 * @param columnSize
	 * @param board
	 */
	public SodukuBoard(int rowSize, int columnSize, int[][] toSolveBoard) {
		this.rowSize = rowSize;
		this.columnSize = columnSize;
		this.board = new SodukuBoardCell[rowSize][columnSize];
		
		importBoard(toSolveBoard);
	}

	public SodukuBoardCell[][] getBoardAsCells () {
		return this.board;
	}

	private void importBoard(int[][] toSolveBoard) {
		for (int rowIndex=0; rowIndex<rowSize; rowIndex++) {
			for (int colIndex=0; colIndex<columnSize; colIndex++) {
				this.board[rowIndex][colIndex] = new SodukuBoardCell();
				
				if (toSolveBoard[rowIndex][colIndex] != 0) {
					this.board[rowIndex][colIndex].setFixedValue(toSolveBoard[rowIndex][colIndex]);
				}
			}
		}
	}
}
