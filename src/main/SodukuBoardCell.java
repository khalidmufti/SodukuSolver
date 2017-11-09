package main;
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
	public SodukuBoardCell() {
		this.numberInCell = 0;
		this.fixedValue = false;
	}
	
	public void setFixedValue (int cellValueGiven) {
		numberInCell = cellValueGiven;
		this.fixedValue = true;
	}

	public int getCellValue () {
		return numberInCell;
	}

}
