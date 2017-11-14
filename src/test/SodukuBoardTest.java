package test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.SodukuBoard;

class SodukuBoardTest {

	@Test
	void testSodukuBoardEasy() {
		
		int[][] givenBoard1 = new int[][]
				{{7,9,0,0,0,0,3,0,0},						
				 {0,0,0,0,0,6,9,0,0},  
				 {8,0,0,0,3,0,0,7,6},	
				 {0,0,0,0,0,5,0,0,2},
				 {0,0,5,4,1,8,7,0,0},
				 {4,0,0,7,0,0,0,0,0},
				 {6,1,0,0,9,0,0,0,8},
				 {0,0,2,3,0,0,0,0,0},
				 {0,0,9,0,0,0,0,5,4}};

		int[][] givenBoard1Solved = new int[][]
				{{7,9,6,8,5,4,3,2,1},						
				 {2,4,3,1,7,6,9,8,5},  
				 {8,5,1,2,3,9,4,7,6},	
				 {1,3,7,9,6,5,8,4,2},
				 {9,2,5,4,1,8,7,6,3},
				 {4,6,8,7,2,3,5,1,9},
				 {6,1,4,5,9,7,2,3,8},
				 {5,8,2,3,4,1,6,9,7},
				 {3,7,9,6,8,2,1,5,4}};

		try {
			int solution1[][] = SodukuBoard.findSolution(givenBoard1, null);
			assertEquals(true, SodukuBoard.areTwoBoardsEqual(givenBoard1Solved, solution1));	

		}
		
		catch (Exception e) {
			fail("Error detected " + e.getMessage());
		}
	}

	@Test
	void testSodukuBoardHard() {
		
		int[][] givenBoard2 = new int[][]
				{{0,0,5,3,0,0,0,0,0},						
				 {8,0,0,0,0,0,0,2,0},  
				 {0,7,0,0,1,0,5,0,0},	
				 {4,0,0,0,0,5,3,0,0},
				 {0,1,0,0,7,0,0,0,6},
				 {0,0,3,2,0,0,0,8,0},
				 {0,6,0,5,0,0,0,0,9},
				 {0,0,4,0,0,0,0,3,0},
				 {0,0,0,0,0,9,7,0,0}};

		int[][] givenBoard2Solved = new int[][]
				{{1,4,5,3,2,7,6,9,8},						
				 {8,3,9,6,5,4,1,2,7},  
				 {6,7,2,9,1,8,5,4,3},	
				 {4,9,6,1,8,5,3,7,2},
				 {2,1,8,4,7,3,9,5,6},
				 {7,5,3,2,9,6,4,8,1},
				 {3,6,7,5,4,2,8,1,9},
				 {9,8,4,7,6,1,2,3,5},
				 {5,2,1,8,3,9,7,6,4}};
				 
		try {
			int solution2[][] = SodukuBoard.findSolution(givenBoard2, null);
			assertEquals(true, SodukuBoard.areTwoBoardsEqual(givenBoard2Solved, solution2));	
		}
		
		catch (Exception e) {
			fail("Error detected " + e.getMessage());
		}
	}
}
