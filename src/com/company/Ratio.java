package com.company;

public class Ratio {

    protected int numerator;   // numerator of ratio
    protected int denominator; // denominator of ratio

    public Ratio(int top, int bottom)
    // pre: bottom != 0
    // post: constructs a ratio equivalent to top::bottom
    {
//        System.out.println("top"+top+"");
//        System.out.println("bottom"+bottom+"");
        numerator = top;
        denominator = bottom;
        reduce();
    }

    public int getNumerator()
    // post: return the numerator of the fraction
    {
        return numerator;
    }

    public int getDenominator()
    // post: return the denominator of the fraction
    {
        return denominator;
    }

    public double getValue()
    // post: return the double equivalent of the ratio
    {
        return (double) numerator / (double) denominator;
    }


    public Ratio add(Ratio other)
    // pre: other is nonnull
    // post: return new fraction--the sum of this and other
    {
        return new Ratio(this.numerator * other.denominator +
                this.denominator * other.numerator,
                this.denominator * other.denominator);
    }

    protected void reduce()
// post: numerator and denominator are set so that
// the greatest common divisor of the numerator and denominator is 1
    {
        int divisor = gcd(numerator, denominator);

        System.out.print(divisor+"-A");

        if (denominator < 0) divisor = -divisor;
        numerator /= divisor;
        denominator /= divisor;
    }


    protected static int gcd(int a, int b)
// post: computes the greatest integer value that divides a and b
    {
        System.out.print(" "+a  +""+   b+"   ");
        if (a < 0) return gcd(-a, b);
        if (a == 0) {
            if (b == 0) return 1;
            else return b;
        }
        if (b < a) return gcd(b, a);

        return gcd(b % a, a);
    }

    public String toString()
    // post: returns a string that represents this fraction.
    {
        return getNumerator() + "/" + getDenominator();
    }

    public static void main(String[] args) {
        Ratio r = new Ratio(1, 1);  /// r = 1.0
//        r = new Ratio(1, 2);  /// r = 0.5
//        System.out.print("1  "+r+"   ");
        r.add(new Ratio(1, 3)); // sum 0.5
//        System.out.print("2  "+r+"  ");
//        r = r.add(new Ratio(2, 8)); /// r= 0.75

//        System.out.print("3  "+r+"  ");

//        System.out.println(r.getValue()); // 0.75 printed
//
//
//        System.out.println(r.toString());  // calls toString()
//        System.out.println(r);  // calls toString()
    }


}

