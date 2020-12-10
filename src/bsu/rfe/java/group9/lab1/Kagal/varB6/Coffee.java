package bsu.rfe.java.group9.lab1.Kagal.varB6;


public class Coffee extends Food
{
    private String aroma;

    public Coffee(String aroma)
    {
        super("����");
        
        this.aroma = aroma;
    }
   
    public void consume() 
    {
        System.out.println(this + " ������");
    }
    public double calculateCalories()
    {
        if(this.aroma.equals("�������"))
            return 90.0;
        
        else if(this.aroma.equals("����������"))
            return 75.0;
        
        else if(this.aroma.equals("���������"))
            return 60.0;
        
        else return 0.0;
    }
    
    public String getAroma() 
    {
        return aroma;
    }
   
    public void setAroma(String aroma) 
    {
        this.aroma = aroma;
    }
    
    public boolean equals(Object arg0)
    {
        if (super.equals(arg0)) 
        { 
            if (!(arg0 instanceof Coffee)) return false; 
            
            return aroma.equals(((Coffee)arg0).aroma); 
        }
        else
            return false;
    }
    
    public String toString()
    {
        return super.toString() + " ������� '" + aroma.toUpperCase() + "'";
    }

}
