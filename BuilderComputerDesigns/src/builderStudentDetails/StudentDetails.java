
package builderStudentDetails;

import buildercomputerdesigns.ComputerDesign;


public class StudentDetails 
{
    
    
        private String ID;
        private String Name ;
        private String emailID ;
        private String Address;

        public StudentDetails(StudentDeatilsbuilder sdb)
        {
            this.ID = sdb.ID;
            this.Name = sdb.Name;
            this.emailID = sdb.emailID;
            this.Address = sdb.Address;
        }

        
        
        void display()
        {
            System.out.println("ID  : "+ID);
            System.out.println("Name  : "+Name);
            System.out.println("Email ID  : "+emailID);
            System.out.println("Address  : "+Address);
        }
        
        static class StudentDeatilsbuilder
        {
            private String ID;
            private String Name ;
            private String emailID ;
            private String Address;
             
             
             StudentDeatilsbuilder addID(String ID)
             {
               this.ID=ID;
               return this ;
             }
             StudentDeatilsbuilder addName(String Name)
             {
               this.Name=Name;
               return this ;
             }
             StudentDeatilsbuilder addEmailID(String emailID)
             {
               this.emailID=emailID;
               return this ;
             }
             StudentDeatilsbuilder addAddress(String Address)
             {
               this.Address=Address;
               return this ;
             }
             
             
             StudentDetails build()
             {
                 return new StudentDetails(this);
             }
        }

}
