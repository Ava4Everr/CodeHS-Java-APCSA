public class TicTacToe
{
    private String[][] board = new String[3][3];
    
    public TicTacToe()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = "-";
            }
        }
    }
    
    public String[][] getBoard()
    {
        return board;
    }
}
