package NWD;

import java.math.BigInteger;

class NWD{
    public static long gcd(long a, long b)
    {
        return
                BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }
}
public class Main {
    public static void main(String[] args)
    {
        String a1 = "484654168646816"; //dwa obiekty typu string
        String a2 = "987568618462456"; //przechowuja wartosci do obliczenia gcd.

        BigInteger a = new BigInteger(a1); //tworzymy dwa obiekty typu BigInteger
        BigInteger b = new BigInteger(a2);

        System.out.println("NWD("+ a + ", " + b + ") = " + a.gcd(b) + "."); //obliczamy gcd
    }
}
