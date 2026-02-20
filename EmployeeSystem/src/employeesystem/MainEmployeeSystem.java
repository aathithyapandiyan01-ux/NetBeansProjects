
package employeesystem;
import java.util.Scanner;

public class MainEmployeeSystem
{
        public static final String ERROR ="\u001B[31m";
        public static final String RESET ="\u001B[0m";
        public static final String BLACK  = "\u001B[30m";
        public static final String RED    = "\u001B[31m";
        public static final String GREEN  = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE   = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN   = "\u001B[36m";
        public static final String WHITE  = "\u001B[37m";
        public static final String BOLD = "\u001B[1m";
        public static final String UNDERLINE = "\u001B[4m";
        public static final String GREEN_BG = "\u001B[42m";
        public static final String BLACK_TEXT = "\u001B[30m";
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println(CYAN+"EMPLOYEE SALARY SYSTEM"+RESET);
            System.out.println(YELLOW+"1 FOR CREDITING PERMANENT EMPLOYEE SALARY"+RESET);
            System.out.println(GREEN+"2 FOR CREDITING CONTRACT EMPLOYEE SALARY"+RESET);
            System.out.println(RED+"3 FOR CREDITING BOTH EMPLOYEE SALARY"+RESET);
            System.out.println(BLUE+"4 FOR EXIT"+RESET);
            System.out.println(PURPLE+"ENTER UR CHOICE"+RESET);
            choice=sc.nextInt();
            
            switch (choice)
            {
                case 1:
                {
                   System.out.println(YELLOW+"  CREDITING PERMANENT EMPLOYEE SALARY PORTAL"+RESET);

                    boolean salaryFound = false;
                    double salary = 0.0d;
                    while(!salaryFound)
                    {
                        try
                        {
                            System.out.println("ENTER THE SALARY");
                            salary=sc.nextDouble();
                            salaryFound=true;
                        }
                        catch(Exception e)
                        {
                            System.out.println("ENTER ONLY THE VALID INPUTS");
                            sc.nextLine();
                        }
                    }
                    PermanentEmployee pe = new PermanentEmployee();
                    pe.getSalary(salary);
                    pe.start();
                try {
                    pe.join();
                } catch (InterruptedException ex) {
                    System.getLogger(MainEmployeeSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
                break;
                }
                case 2:
                {
                    System.out.println(GREEN+" CREDITING CONTRACT EMPLOYEE SALARY PORTAL"+RESET);

                    boolean salaryFound = false;
                    double salary = 0.0d;
                    while(!salaryFound)
                    {
                        try
                        {
                            System.out.println("ENTER THE SALARY");
                            salary=sc.nextDouble();
                            salaryFound=true;
                        }
                        catch(Exception e)
                        {
                            System.out.println("ENTER ONLY THE VALID INPUTS");
                            sc.nextLine();
                        }
                    }
                    ContractEmployee ce = new ContractEmployee();
                    ce.getSalary(salary);
                    ce.start();
                try {
                    ce.join();
                } catch (InterruptedException ex) {
                    System.getLogger(MainEmployeeSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
                break;
                }
                
                case 3:
                {
                    System.out.println(RED+" CREDITING BOTH EMPLOYEE SALARY PORTAL"+RESET);


                    boolean salaryFound = false;
                    double salary = 0.0d;
                    while(!salaryFound)
                    {
                        try
                        {
                            System.out.println("ENTER THE SALARY");
                            salary=sc.nextDouble();
                            salaryFound=true;
                        }
                        catch(Exception e)
                        {
                            System.out.println("ENTER ONLY THE VALID INPUTS");
                            sc.nextLine();
                        }
                    }
                    PermanentEmployee pe = new PermanentEmployee();
                    ContractEmployee ce = new ContractEmployee();
                    pe.getSalary(salary);
                    ce.getSalary(salary);
                    pe.start();
                    ce.start();
                    try
                    {
                        pe.join();
                        ce.join();
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println("SALARY CREDITED WAS INTERUPTED");
                    }
                break;
                }
                
                
                    
                   
                
            }
            
            
        }while(choice!=4);
        
        
        
        
        
        
        
        
    }
    
}
