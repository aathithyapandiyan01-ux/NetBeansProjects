
package stringbuilderkfc;


public class Burger 
{
    
    private String bun;
    private String patty;
    private boolean cheese;
    private boolean lettuce;
    private boolean sauce;

    Burger()
    {
        
    }
    
    
    private Burger(BurgerBuilder bb) 
    {
        this.bun = bb.bun;
        this.patty = bb.patty;
        this.cheese = bb.cheese;
        this.lettuce = bb.lettuce;
        this.sauce = bb.sauce;
    }
    
    void display()
    {
        System.out.println("Bun : "+bun);
        System.out.println("Patty : "+patty);
        System.out.println("Cheese : "+cheese);
        System.out.println("Lettuce : "+lettuce);
        System.out.println("Sauce : "+sauce);
    }
    
    static class BurgerBuilder
    {
        private String bun;
        private String patty;
        private boolean cheese;
        private boolean lettuce;
        private boolean sauce;

        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder addLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public BurgerBuilder addSauce(boolean sauce) {
            this.sauce = sauce;
            return this;
        }
        
        Burger build()
        {
            return new Burger(this);
        }
        
        
        
    }


}
