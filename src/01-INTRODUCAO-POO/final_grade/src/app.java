import java.util.Scanner;
import entities.grade;

public class app {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        grade student;
        student = new grade();

        student.Name = scan.nextLine();
        student.Nota1 = scan.nextDouble();
        student.Nota2 = scan.nextDouble();
        student.Nota3 = scan.nextDouble();

        System.out.printf(student.Test());

        scan.close();
    }

}
