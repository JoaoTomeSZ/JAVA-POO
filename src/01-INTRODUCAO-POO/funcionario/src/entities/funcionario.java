package entities;

public class funcionario {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }
    public void IncreaseSalary(double percentage){
        double aumento = (this.GrossSalary / 100) * percentage;
        this.GrossSalary = this.GrossSalary + aumento;

    }
}
