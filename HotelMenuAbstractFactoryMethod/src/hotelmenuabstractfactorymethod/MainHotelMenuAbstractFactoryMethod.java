
package hotelmenuabstractfactorymethod;

import java.util.Scanner;


public class MainHotelMenuAbstractFactoryMethod {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        do
        {
            System.out.println("WELCOME TO AP UNAVAGAM");
            System.out.println("0 TO KNOW ABOUT THE MENU");
            System.out.println("1 TO KNOW ORDER IDLY");
            System.out.println("2 TO KNOW ORDER DOSA");
            System.out.println("3 TO KNOW ORDER CHAPATHI");
            System.out.println("4 TO KNOW ORDER PAROTTA");
            System.out.println("5 TO KNOW ORDER ICECREAM");
            System.out.println("6 TO KNOW ORDER BEEDA");
            System.out.println("7 TO KNOW ORDER TEA");
            System.out.println("8 TO exit");
            System.out.println("ENTER UR CHOICE");
            choice = sc.nextInt();
            
            switch(choice)
            {
                
                case 0 :
                {
                    System.out.println("MENU PORTAL");
                    
                    
                
                
                break;
                }
                
                case 1 :
                {
                    System.out.println("IDLY ORDER PORTAL");
                    Supplier idly = new DosaNIdlyPreparer();
                    idly.serveDish("idly");
                    
                break;
                }
                case 2 : 
                {
                    System.out.println("DOSA ORDER PORTAL");
                    Supplier Dosa = new DosaNIdlyPreparer();
                    Dosa.serveDish("dosa");
                
                
                
                break;
                }
                case 3 :
                {
                    System.out.println("CHAPATHI ORDER PORTAL");
                    Supplier chapathi = new ChapathiNParottaMaster();
                    chapathi.serveDish("chapathi");
                
                
                
                break;
                }
                case 4 :
                {
                    System.out.println("PAROTTA ORDER PORTAL");
                    Supplier parotta = new ChapathiNParottaMaster();
                    parotta.serveDish("parotta");
                
                
                
                break;
                }
                case 5 :
                {
                    System.out.println("ICE CREAM ORDER PORTAL");
                    Supplier iceCream = new BeedaNIcecreamPreparer();
                    iceCream.serveDish("iceCream");
                
                
                
                
                break;
                }
                case 6 :
                {
                    System.out.println("TEA ORDER PORTAL");
                    Supplier tea = new TeaMaster();
                    tea.serveDish("tea");
                    
                
                
                
                break;
                }
                case 7 :
                {
                    System.out.println("BEEDA ORDER PORTAL");
                    Supplier beeda = new BeedaNIcecreamPreparer();
                    beeda.serveDish("beeda");
                
                
                
                break;
                }
                case 8 :
                {
                    System.out.println("EXITING , THANK YOU");
                break;
                }
            }
            
        }while(choice!=8);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
