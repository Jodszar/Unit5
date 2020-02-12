/*
Jodie Azar
February 10, 2020
This class performs arithmetics and fractions.
This class also includes the use of private classes.
 */

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this. numerator= numerator;
        this.denominator= denominator;

        int gcd = gcd(numerator, denominator);
        this.numerator/=gcd;
        this.denominator/=gcd;

        if((numerator>0 && denominator<0)||(numerator<0&&denominator<0)){
            this.numerator= -numerator;
            this.denominator= - denominator;
        }

    }
    public Fraction(){
        this(1,1);
        /* A default constructor with a denominator of 1a dna numerator of 1 */
    }
    public static int gcd(int numerator, int denominator){
        int m= numerator;
        int n= denominator;

        if(m%n == 0){
            return n;
        }
        while(m%n!=0){
            int oldm=m;
            int oldn=n;
            m=oldn;
            n=oldm%oldn;
        }
        return n;
    }

    public static Fraction add(Fraction a, Fraction b){
        int newDenominator= a.denominator*b.denominator;
        int newNumerator= (a.numerator*b.denominator) - (b.numerator*a.denominator);
        Fraction subtractedFraction= new Fraction(newNumerator, newDenominator);
        return subtractedFraction;
        /*Subtracted fraction in reduced forms*/
    }
    public static Fraction multiply(Fraction a, Fraction b){
        int newDenominator= a.denominator*b.denominator;
        int newNumerator= (a.numerator*b.denominator) - (b.numerator*a.denominator);
        Fraction multipliedFraction= new Fraction(newNumerator, newDenominator);
        return multipliedFraction;
        /* Multiplied fraction in reduced forms*/
    }
    public static Fraction divide(Fraction a, Fraction b){
        int newDenominator= a.denominator*b.denominator;
        int newNumerator= (a.numerator*b.denominator) - (b.numerator*a.denominator);
        Fraction dividedFraction= new Fraction(newNumerator, newDenominator);
        return dividedFraction;
        /* Divided fraction in reduced forms*/
    }
    public String toString() {
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;

        if ((numerator > 0 && denominator < 0) || (numerator < 0 && denominator < 0)) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        }
        return numerator + "/" + denominator;
    }
}
