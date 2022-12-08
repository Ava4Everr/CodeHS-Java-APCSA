public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private char board[][] = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
   
   //this method returns the current turn
   public int getTurn()
   {
       return this.turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("\n 0 1 2");
       for (int i = 0; i < 3; i++)
       {
           System.out.println(i + " " + this.board[i][0] + " " + this.board[i][1] + " "+ this.board[i][2]);
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       return this.board[row][col] == '-';
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       char sym;
       if (this.turn % 2 == 0)
       {
           sym = 'X';
       }
       else 
       {
           sym = 'O';
       }
       this.turn++;
       this.board[row][col] = sym;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       for (int i = 0; i < 3; i++)
       {
           if (this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2] && board[i][0] != '-')
           {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int i = 0; i < 3; i++)
       {
           if (this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i] && board[i][0] != '-')
           {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       if ((this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2] && board[0][0] != '-') || (this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0] && board[0][2] != '-'))
       {
           return true;
       }
       return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       return (checkCol() || checkRow() || checkDiag());
   }

}
