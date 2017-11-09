/**
 * 
 */

/**
 * @author Khalid Mufti
 *
 */
public class SodukuBoardCell {
	
	int numberInCell;
	boolean fixedValue;

	/**
	 * @param numberInCell
	 * @param fixedValue
	 */
	public SodukuBoardCell(int givenValueInCell) {
		this.numberInCell = givenValueInCell;
		this.fixedValue = true;
	}

	/**
	 * @param numberInCell
	 * @param fixedValue
	 */
	public SodukuBoardCell() {
		this.numberInCell = 0;
		this.fixedValue = false;
	}
}
