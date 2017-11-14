package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Khalid Mufti
 *
 */
public class SodukuSolver {

	/**
	 * @param args
	 * @throws NoSolutionFoundException 
	 */
	public static void main(String[] args) throws NoSolutionFoundException {
		
        final JFrame theFrame = new JFrame();
        theFrame.setTitle("Soduku Solver");
        theFrame.setSize(1900, 800);
        theFrame.setLocation(1600, 600);

        JPanel mainPanel = new JPanel();

        JTextArea theText = new JTextArea(20,40); //create the text area
        theText.setText("Solving ...");
        mainPanel.add(theText); //add the text area to the panel

        theFrame.getContentPane().add(mainPanel); //add the panel to the frame
        theFrame.pack();
        theFrame.setVisible(true);
        
		int[][] givenBoardHard= new int[][]
				{{0,0,5,3,0,0,0,0,0},						
				 {8,0,0,0,0,0,0,2,0},  
				 {0,7,0,0,1,0,5,0,0},	
				 {4,0,0,0,0,5,3,0,0},
				 {0,1,0,0,7,0,0,0,6},
				 {0,0,3,2,0,0,0,8,0},
				 {0,6,0,5,0,0,0,0,9},
				 {0,0,4,0,0,0,0,3,0},
				 {0,0,0,0,0,9,7,0,0}};
		SodukuBoard.findSolution(givenBoardHard, theText);
				 

	}
}
