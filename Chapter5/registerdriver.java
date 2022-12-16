import java.util.Scanner;

public class registerdriver
{
    
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Register reg1 = new Register(1234, true);
        Register reg2 = new Register(1234, true);
       
        int hours; 
        
        while(reg1.locked() && reg2.locked()){
        System.out.println("The registers are locked. What's the pin? ");
        int pintrial = scan.nextInt();
        
        reg1.unlock(pintrial);
        reg2.unlock(pintrial);
    }
        
        System.out.println("Nice job! Registers are unlocked!");
        
        for(hours=0;hours<8;hours++){
            //assuming business hours are 8 hours, one sale every hour
        
        
            
            System.out.println("Would you like to check out by weight or piece? (w or p) ");
            
            String choice = scan.nextLine();
            
            if(choice.equalsIgnoreCase("w"))
            {
                
                System.out.println("How many pounds of candy were bought? ");
                double amount = scan.nextDouble();
                reg1.setpoundsCandy(amount); //adding to total of candies
                
                double owed = amount;
                System.out.println("You owe us $"+owed+". Pay up now!!");
                
                System.out.println("How much cash was given? ");
                double change  = scan.nextDouble()-owed;
                
                if(change<0)
                    System.out.println("This is not enough cash!");
                else
                    System.out.println("Your change is $"+change);
                
                
            }
            
            
            
            else if(choice.equalsIgnoreCase("p")){
                
                System.out.println("How many pieces of candy were bought? ");
                int amount = scan.nextInt();
                reg2.setpieceCandy(amount);
                
                double owed = amount*.05;
                System.out.println("You owe us $"+owed+". Pay up now!!");
                
                System.out.println("How much ca$h was given? ");
                double change  = scan.nextDouble()-owed;
                
                System.out.println("Your change is $"+change);
                
                
            }
            
        
    }
      
    
    System.out.println("\nRegister 1 report: "+reg1.getSalesReport());
    System.out.println("\nRegister 2 report: "+reg2.getSalesReport());
        
    System.out.println("\nTotal sales: [Total candies sold:"+(reg1.getCandiesSold()+reg2.getCandiesSold())+" | Total pounds: "+(reg1.getpoundsCandy()+reg2.getpoundsCandy())+" | Total sales : $"+(reg1.getSales()+reg2.getSales())+"]");
    
    reg1.lock(1234);
    reg2.lock(1234);
    System.out.println("\nNice day at work! Both registers have been locked");
    }
}
