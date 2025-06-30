import java.util.Scanner;
import entities.rectangle;

 class app {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        rectangle value;
        value = new rectangle();

        System.out.println("Enter rectangle width and height:");
        System.out.print("Width: ");
        value.Width = scan.nextDouble();
        System.out.print("Heigth: ");
        value.Height = scan.nextDouble();

        System.out.printf("AREA = %.2f%n", value.Area());
        System.out.printf("PERIMETER = %.2f%n", value.Perimeter());
        System.out.printf("DIAGONAL = %.2f", value.Diagonal());
        scan.close();
    }
}
