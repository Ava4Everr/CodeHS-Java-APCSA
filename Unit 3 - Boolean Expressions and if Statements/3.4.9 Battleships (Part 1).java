public class ShipTester
{
    public static void main(String[] args)
    {
        Battleship sub = new Battleship("submarine", 6);
        Battleship raft = new Battleship("raft", 2);
        Battleship destroyer = new Battleship("destroyer", 11);
     
        System.out.println(sub);
        System.out.println("Sub has power " + sub.getPower());
        
        System.out.println(raft);
        System.out.println("Raft has power " + raft.getPower());
        
        System.out.println(destroyer);
        System.out.println("Destroyer has power " + destroyer.getPower());
        
        System.out.println("\nRaft attacks Sub");
        sub.updateDamage(raft.getPower());
        System.out.println(sub);
        
        System.out.println("\nDestroyer attacks Raft");
        raft.updateDamage(destroyer.getPower());
        System.out.println(raft);
        
        System.out.println("\nSub attacks Destroyer");
        destroyer.updateDamage(sub.getPower());
        System.out.println(destroyer);


    }
}
