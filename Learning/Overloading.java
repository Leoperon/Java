
/**
 * class Overloading here.
 *
 * @author (Leoperon)
 * @version (20.05.2019)
 */
class Overloading
{   
    void sum(int a,int b)  
    {  
        System.out.println(a+b);  
    }     
    void sum(double a,double b)   
    {  
        System.out.println(a+b);  
    }   
    public static void main(String args[])  
    {   
        Overloading obj=new Overloading();    
        obj.sum(10.5,10.5);    
        obj.sum(20,20);   
    }   
 } 