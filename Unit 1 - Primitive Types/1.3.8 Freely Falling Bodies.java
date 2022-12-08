public class FallingBodies
{
    public static void main(String[] args)
    {
        double grav = 9.8;
        int tim = 23;
        double solveH = 0.5 * grav * (tim*tim);
        double solveV = grav * tim;
        System.out.println("Height: " + solveH);
        System.out.println("Velocity: " + solveV);
    }
}
