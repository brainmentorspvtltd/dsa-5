public class SudokuSolver {
	
	static int board[][] = {
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{}
			};
	static int MAX_BOARD_SIZE = 9;
	
	static boolean solveIt(int row, int col) {
		if(col == MAX_BOARD_SIZE) {
			
		}
		if(row == MAX_BOARD_SIZE) {
			
		}
		if(board[row][col] != 0) {
			return solveIt(row, col + 1);
		}
		
		for(int i = 1; i <= MAX_BOARD_SIZE; i++) {
			if(isOkToPlace(row, col, i)) {
				
			}
		}	
		return true;
	}
	
	static boolean isPresentInRow(int row, int data) {
		return true;
	}
	static boolean isPresentInCol(int col, int data) {
		return true;
	}
	static boolean isPresentInBox(int row, int col, int data) {
		return true;
	}
	
	static boolean isOkToPlace(int row, int col, int data) {
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = solveIt(0, 0) ? "Solved" : "Not Solved";
		System.out.println(res);
	}

}
