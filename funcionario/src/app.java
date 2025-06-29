import java.util.Scanner;
import entities.funcionario;

public class app {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        funcionario employee;
        employee = new funcionario();

        System.out.print("Name: ");
        employee.Name = scan.next();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = scan.nextDouble();

        System.out.printf("Employee: %s, $ %.2f", employee.Name, employee.NetSalary());

        System.out.print("Which percentage to increase salary?");
        double tax = scan.nextDouble();
        employee.IncreaseSalary(tax);

        System.out.printf("Updated data: %s, $ %.2f", employee.Name, employee.NetSalary());




        scan.close();

    }

}
