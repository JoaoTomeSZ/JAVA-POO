package util;

public class Calculator {

    public final double PI = 3.24159; //padrão para constantes é letra maiúscula ou JOAO_TOME

    public double circumference(double radius){ //NAO CONSEGUE USAR UM METODO Q NÃO É STATIC, DENTRO DE UM METDO QUE É STATIC
        return 2.0 * PI * radius;
    }
    public double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
