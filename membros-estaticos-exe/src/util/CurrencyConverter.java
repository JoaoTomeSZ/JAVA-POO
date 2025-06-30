package util;

public class CurrencyConverter {
    public final double IOF = 0.06;
    public double DolarPrice, Quantity;

    public double conversor(){
        return (DolarPrice * IOF + DolarPrice) * Quantity;
    }
}
