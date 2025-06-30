package entities;

public class grade {
    public String Name;
    public double Nota1, Nota2, Nota3;

    public double GradeCalc(){
        return Nota1 + Nota2 + Nota3;
    }
    public double Rest(){
        return 60.00 - GradeCalc();
    }
    public String Test() {
        if (GradeCalc() >= 60.00) {
            return String.format("FINAL GRADE = %.2f%nPASS", GradeCalc());
        } else {
            return String.format("FINAL GRADE = %.2f%nFAILED %nMISSING %.2f POINTS", GradeCalc(), Rest());
        }
    }
}
