public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private String[][] board = new String[3][3];
    
    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-";
            }
        }
    }
    
   //this method returns the current turn
   public int getTurn()
   {
        return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
    {   
        System.out.println("  0 1 2");
        int row = 0;
        for(String[] array : board)
        {
            System.out.print(row + " ");
            for(String item : array)
            {
                System.out.print(item + " ");
                
            }
            row++;
            System.out.println();
        }
    }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
        if (board[row][col] == "-") {
           return true;
        } /*else {
            return false;  
        }*/
        return false;
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
        if (turn % 2 == 0) {
            board[row][col] = "X";
        } else {
            board[row][col] = "O";
        }
        turn++;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
        for (int i = 0; i < board.length; i++){
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != "-") {
                return true;
            }
        }
        return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int j = 0; j < board.length; j++){
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != "-") {
                return true;
            }
        }
        return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != "-" || board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != "-" ) {
           return true;
        }
        return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       if (checkRow() || checkCol() || checkDiag()) {
           return true;
       }
       return false;
   }

}
