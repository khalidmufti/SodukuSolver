package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.SodukuBoard;
import main.SodukuBoardCell;

class SodukuBoardTest {

	@Test
	void testSodukuBoard() {
		
		int[][] givenBoard = new int[][]
				{{0,0,7,0,3,0,8,0,0},						
				 {0,0,0,2,0,5,0,0,0},  
				 {4,0,0,9,0,6,0,0,1},	
				 {0,4,3,0,0,0,2,1,0},
				 {1,0,0,0,0,0,0,0,5},
				 {0,5,8,0,0,0,6,7,0},
				 {5,0,0,1,0,8,0,0,9},
				 {0,0,0,5,0,3,0,0,0},
				 {0,0,2,0,9,0,5,0,0}};
				 
		SodukuBoard board = new SodukuBoard(9, 9, givenBoard);
		SodukuBoardCell[][] cells = board.getBoardAsCells();
		
		assertEquals(7, cells[0][2].getCellValue(), "incorrect value");
		assertEquals(9, cells[2][3].getCellValue(), "incorrect value");
		assertEquals(5, cells[4][8].getCellValue(), "incorrect value");
		assertEquals(4, cells[2][0].getCellValue(), "incorrect value");
		assertEquals(2, cells[8][2].getCellValue(), "incorrect value");
	}

}
