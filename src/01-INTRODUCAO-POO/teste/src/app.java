import java.sql.SQLOutput;
import java.util.Scanner;

public class app {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idadeEmAno;
        int idadeEmMeses;
        int IdadeEmDia;

        System.out.println("Insira um numero");
        int numero = sc.nextInt();

        idadeEmAno = numero / 365;
        numero %= 365;

        idadeEmMeses = numero / 30;
        numero %= 30;

        IdadeEmDia = numero;

        System.out.println(idadeEmAno + " ano (s)");
        System.out.println(idadeEmMeses + " mes (es)");
        System.out.println(IdadeEmDia + " dia (s)");
    }
}
