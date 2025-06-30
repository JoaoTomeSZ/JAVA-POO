import java.util.Scanner;
import util.Calculator;
public class app {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Enter radius:");
        double radius = scan.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.PI);

        scan.close();
    }


}
