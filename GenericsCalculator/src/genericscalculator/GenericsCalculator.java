
package genericscalculator;

import java.util.Scanner;


public class GenericsCalculator {

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int choice =0;
        
        
        
        do
        {
            System.out.println("1 FOR ADD");
            System.out.println("2 FOR SUBTRACTION");
            System.out.println("3 FOR EXIT");
            System.out.println("ENTER UR CHOICE");
            choice=sc.nextInt();
            
            switch (choice) 
            {
                case 1:
                {
                    int choices =0;
                    System.out.println("ADDITION PORTAL");
                    
                    System.out.println(" 1 FOR INTEGERS ADDITION");
                    System.out.println(" 2 FOR DOUBLE ADDITION");
                    System.out.println("ENTER UR CHOICE");
                    choices=sc.nextInt();
                    switch (choices) 
                    {
                        case 1:
                        {
                            System.out.println("INTEGER ADDITION PORTAL");
                            System.out.println("Enter First Number");
                            int a = sc.nextInt();

                            System.out.println("Enter Second Number");
                            int b = sc.nextInt();
                            
                            Calculator<Integer,Integer> c = new Calculator();
                            c.ADDINTdisplay(a, b);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("DOUBLE ADDITION PORTAL");
                            System.out.println("Enter First Number");
                            double a = sc.nextDouble();

                            System.out.println("Enter Second Number");
                            double b = sc.nextDouble();
                            
                            Calculator<Double,Double> c = new Calculator();
                            c.ADDDoubledisplay(a, b);
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    int choices =0;
                    System.out.println("SUBTARCTION PORTAL");
                    
                    System.out.println(" 1 FOR INTEGERS SUBTARCTION");
                    System.out.println(" 2 FOR DOUBLE SUBTARCTION");
                    System.out.println("ENTER UR CHOICE");
                    choices=sc.nextInt();
                    switch (choices) 
                    {
                        case 1:
                        {
                            System.out.println("INTEGER SUBTARCTION PORTAL");
                            System.out.println("Enter First Number");
                            int a = sc.nextInt();

                            System.out.println("Enter Second Number");
                            int b = sc.nextInt();
                            
                            Calculator<Integer,Integer> c = new Calculator();
                            c.SUBINTdisplay(a, b);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("DOUBLE SUBTARCTION PORTAL");
                            System.out.println("Enter First Number");
                            double a = sc.nextDouble();

                            System.out.println("Enter Second Number");
                            double b = sc.nextDouble();
                            
                            Calculator<Double,Double> c = new Calculator();
                            c.SUBdoubledisplay(a, b);
                            break;
                        }
                    }
                    break;
                }
                case 3 :
                {
                    System.out.println("EXITING , THANK YOU");
                }
            }
            
        }while(choice!=3);
    }
    
}
