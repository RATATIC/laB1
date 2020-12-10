package bsu.rfe.java.group9.lab1.Kagal.varB6;

public class Apple extends Food 
{
    private String size;

    public Apple(String size)
    {   	
    	super("������");

        this.size = size;
    }
    
    public void consume()
    {
        System.out.println(this + " �������");
    }
    public double calculateCalories() 
    {
        if(this.size.equals("�������"))
            return 150.0;
        
        else if(this.size.equals("�������"))
            return 100.0;
        
        else if(this.size.equals("�����"))
            return 50.0;
        
        else return 0.0;
    }
    public String getSize() { return size; }
    
    public void setSize(String size)
    {
        this.size = size;
    }
     public boolean equals(Object arg0) 
     {
        if (super.equals(arg0))
        { 
            if (!(arg0 instanceof Apple)) return false; 
            
            return size.equals(((Apple)arg0).size); 
        } 
        else
            return false;
    }
       public String toString() 
       {
        return super.toString() + " ������� '" + size.toUpperCase() + "'";
    }
}