

package buildercomputerdesigns;

import java.util.Scanner;


public class MainBuilderComputerDesigns {

  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE CPU ");
        String CPU = sc.nextLine();
        System.out.println("ENTER THE RAM ");
        String RAM = sc.nextLine(); 
        System.out.println("ENTER THE HDD ");
        String HDD = sc.nextLine(); 
        System.out.println("ENTER THE GRAPHICS ");
        String Graphics = sc.nextLine(); 
        
        ComputerDesign cd = new ComputerDesign.ComputerDesignBuilder().addRAM(RAM).addCPU(CPU).addGraphics(Graphics).addHDD(HDD).build();
        cd.display();

        
        
        


    }

}
