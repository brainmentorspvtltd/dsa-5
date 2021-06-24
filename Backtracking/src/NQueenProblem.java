public class NQueenProblem {
	
	static int countWays(boolean [][]board, int currentRow) {
		int count = 0;
		if(currentRow == board.length) {
			return 1;
		}
		// traverse all columns of board
		for(int col = 0; col < board[currentRow].length; col++) {
			if(isOnSafeArea(board, currentRow, col)) {
				board[currentRow][col] = true;
				count = count + countWays(board, currentRow + 1);
				board[currentRow][col] = false;
			}
		}
		return count;
	}
	
	static boolean isOnSafeArea(boolean [][]board, int row, int col) {
		// Case 1 : checking on above row on same column
		for(int i = row; i >= 0; i--) {
			if(board[i][col]) {
				return false;
			}
		}
		// Case 2 : Checking on upper left diagonal
		for(int i = row, j = col; i >= 0 && j >= 0; i--,j--) {
			if(board[i][j]) {
				return false;
			}
		}
		// Case 3 : Checking on upper right diagonal
		for(int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if(board[i][j]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][]board = new boolean[4][4];
		System.out.println(countWays(board, 0));
	}

}
