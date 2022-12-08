public class Battleship
{
    private String name;  // type of ship
    private int power;   // power of attack in range [1 - 10]
    private int health; // health of the ship
    
    // Constructor
    public Battleship(String shipType, int attackPower)
    {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    
    // Modifies the health of the battleship
    public void updateDamage(int attackPower)
    {
        if (attackPower >= 10){
            health = health - 10;
            } else if (attackPower < 5){
                health = health - 2;
                }else{
                    health = health - 7;
                    }
    }
    
    // Returns true if the health of
    // the ship is greater than 0
    public boolean stillFloating()
    {
        if (health > 0){
            return true;
            } else{
                return false;
                }
    }
    // Returns the power of the ship
    public int getPower()
    {
        return power;
    }
    
    // Returns string representation in the form
    // Battleship name
    public String toString()
    {
        return name + "(" + health + ")";    
    }
    
}
