package Modul05.soal1;

public class Paint
{
    private double coverage; //number of square feet per gallon

    public Paint(double c)
    {
        coverage = c;
    }

    public double amount(Shape s)
    {
        System.out.println("Computing amount for " + s);
        return Math.ceil(s.area()/coverage);
    }
}