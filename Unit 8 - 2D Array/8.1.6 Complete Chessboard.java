public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][];
        chess[0] = new String[]{"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        chess[1] = new String[]{"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        chess[2] = new String[]{"-","-","-","-","-","-","-","-"};
        chess[3] = new String[]{"-","-","-","-","-","-","-","-"};
        chess[4] = new String[]{"-","-","-","-","-","-","-","-"};
        chess[5] = new String[]{"-","-","-","-","-","-","-","-"};
        chess[6] = new String[]{"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        chess[7] = new String[]{"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
