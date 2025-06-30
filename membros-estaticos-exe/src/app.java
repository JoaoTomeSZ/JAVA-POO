import java.util.Scanner;
import util.CurrencyConverter;

public class app {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        CurrencyConverter conversor = new CurrencyConverter();

        System.out.print("What is the dolar price? ");
        conversor.DolarPrice = scan.nextDouble();
        System.out.print("How many dollars will be bought? ");
        conversor.Quantity = scan.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", conversor.conversor());

        scan.close();
    }
}
