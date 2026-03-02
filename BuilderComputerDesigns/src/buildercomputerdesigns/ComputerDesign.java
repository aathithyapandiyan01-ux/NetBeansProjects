
package buildercomputerdesigns;


public class ComputerDesign 
{
    
    
        private String CPU;
        private String RAM ;
        private String HDD ;
        private String graphics;

        public ComputerDesign(ComputerDesignBuilder cdb) 
        {
            this.CPU = cdb.CPU;
            this.RAM = cdb.RAM;
            this.HDD =cdb.HDD;
            this.graphics = cdb.graphics;
        }
        
        void display()
        {
            System.out.println("CPU  : "+CPU);
            System.out.println("RAM  : "+RAM);
            System.out.println("HDD  : "+HDD);
            System.out.println("graphics  : "+graphics);
        }
        
        static class ComputerDesignBuilder
        {
             private String CPU;
             private String RAM ;
             private String HDD ;
             private String graphics;
             
             
             ComputerDesignBuilder addCPU(String CPU)
             {
               this.CPU=CPU;
               return this ;
             }
             ComputerDesignBuilder addRAM(String RAM)
             {
               this.RAM=RAM;
               return this ;
             }
             ComputerDesignBuilder addHDD(String HDD)
             {
               this.HDD=HDD;
               return this ;
             }
             ComputerDesignBuilder addGraphics(String graphics)
             {
               this.graphics=graphics;
               return this ;
             }
             
             
             ComputerDesign build()
             {
             
             return new ComputerDesign(this);
             }
        }
        
}
