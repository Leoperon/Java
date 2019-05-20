
/**
 * class SuperBike here.
 *
 * @author (Leoperon)
 * @version (20.05.2019)
 */
class Bike 
{   
    int speed=50;   
}   
class Super extends Bike 
{   
   int speed=100;   
   void display() 
   { 
          System.out.println(super.speed); 
   }   
   public static void main(String args[]) 
   {   
       Super b=new Super();   
       b.display();   
   }   
}   