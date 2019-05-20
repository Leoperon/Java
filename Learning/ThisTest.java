
/**
 * class ThisTest here.
 *
 * @author (Leoperon)
 * @version (20.05.2019)
 */
class ThisTest 
{   
    int id;       
    String name;   
    ThisTest(int id,String name)  
    {       
        this.id = id;      
        this.name = name;     
    }   
    void display()  
    {
        System.out.println(id+" "+name); 
    }    
    public static void main(String args[])  
    {     
        ThisTest s1 = new ThisTest(142,"Shamshad");     
        ThisTest s2 = new ThisTest(452,"John");    
        s1.display();     
        s2.display();     
    }  
}   