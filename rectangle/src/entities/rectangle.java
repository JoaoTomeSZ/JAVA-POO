package entities;

public class rectangle {
    public double Width, Height;

    public double Area(){
        return Width * Height;
    }
    public double Perimeter(){
        return 2 * (Width + Height);
    }
    public double Diagonal(){
        double diagonal = (Width * Width) + (Height * Height);
        return Math.sqrt(diagonal);
    }
}
