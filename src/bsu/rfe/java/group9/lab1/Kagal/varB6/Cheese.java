package bsu.rfe.java.group9.lab1.Kagal.varB6;


public class Cheese extends Food 
{
    public Cheese() 
    {
        super("ׁûנ");
    }
    
    public void consume() 
    {
        System.out.println(this + " סתוהום");
    }
    
    public double calculateCalories() {
        return 300.0;
    }
    
}


