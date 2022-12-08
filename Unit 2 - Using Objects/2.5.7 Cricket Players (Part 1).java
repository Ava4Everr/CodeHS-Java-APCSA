public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       CricketPlayer player1 = new CricketPlayer("Brian Lara");
       System.out.println("Brian Lara's Stats:");
       player1.addMatch(9, 1);
       player1.addMatch(7, 3);
       player1.addMatch(9, 3);
       player1.addMatch(5, 2);
       player1.printRunsScored();
       player1.printBallsBowled();
       System.out.println(player1.toString());
       
       System.out.println();
       
       CricketPlayer player2 = new CricketPlayer("Fabian Allen", "Loose Gooses");
       System.out.println("Fabian Allen Stats:");
       player2.addMatch(6, 2);
       player2.addMatch(9, 4);
       player2.addMatch(2, 1);
       player2.addMatch(10, 9);
       player2.printRunsScored();
       player2.printBallsBowled();
       System.out.println(player2.toString());
    }
}
