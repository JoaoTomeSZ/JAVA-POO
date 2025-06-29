import entities.product;
import java.util.Scanner;

public class app {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        product produto;
        produto = new product();

        System.out.println("Informe o nome do produto:");
        produto.Name = scan.next();
        System.out.println("Informe o preço do produto:");
        produto.Price = scan.nextDouble();
        System.out.println("Informe a quantidade em estoque do produto:");
        produto.Quantity = scan.nextInt();

        System.out.printf(produto.Text());

        System.out.printf("%nEntrada de estoque - informe a quantidade que chegou:%n");
        int quantity = scan.nextInt();
        produto.AddProducts(quantity);

        System.out.printf(produto.AttText());

        System.out.printf("%nSaída de estoque - informe a quantidade que saiu:%n");
        quantity = scan.nextInt();
        produto.RemoveProducts(quantity);

        System.out.printf(produto.AttText());

        scan.close();
    }
}
