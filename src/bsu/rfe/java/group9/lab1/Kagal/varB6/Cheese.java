package bsu.rfe.java.group9.lab1.Kagal.varB6;


public class Cheese extends Food 
{
    public Cheese() 
    {
        super("���");
    }
    
    public void consume() 
    {
        System.out.println(this + " ������");
    }
    
    public double calculateCalories() {
        return 300.0;
    }
    
}


