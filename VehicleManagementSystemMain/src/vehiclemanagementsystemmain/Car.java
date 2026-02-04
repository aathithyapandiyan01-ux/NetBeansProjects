
package vehiclemanagementsystemmain;


public class Car extends Vehicle
{
   int seats ;
   
   Car(String Brand ,int Year,int seats)
   {
       super(Brand,Year);
       this.seats=seats;
   
   }
   void display()
    {
        System.out.println("Brand :"+Brand);
        System.out.println("Year :"+Year);
        System.out.println("Seats :"+seats);
    
    }
}
