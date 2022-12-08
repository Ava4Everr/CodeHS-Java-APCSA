public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        numerator = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denominator = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator = denominator * other.denominator; 
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = numerator * other.denominator - other.numerator * denominator;
        denominator = denominator * other.denominator;
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return numerator + "/" + denominator;
    }
}
