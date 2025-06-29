package entities;

public class product {
    public String Name;
    public double Price;
    public int Quantity;

    public double TotalValueInStock(){
        return Price * Quantity;
    }
    public void AddProducts(int quantity){
        this.Quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.Quantity = this.Quantity - quantity;
    }
    public String Text(){
        return String.format("Informações do produto:%nNome: %s%nPreço: R$%.2f%nQuantidade em estoque: %d%nValor total em estoque: R$%.2f%n", Name, Price, Quantity, TotalValueInStock());
    }
    public String AttText(){
        return String.format("Informações atualizadas do produto:%nNome: %s%nPreço: R$%.2f%nQuantidade em estoque: %d%nValor total em estoque: R$%.2f%n", Name, Price, Quantity, TotalValueInStock());
    }
}
