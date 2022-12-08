
/**
 * Write a description of class notes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class notes
{
    
    public static void main(String []args)
    {
        //mathy solver = new mathy(3 windows);
        
        System.out.println(mathy.PI); //this is  a static variable 
        
        // we can have a static method
        // we just need to use some of the stuff that math class is using
        // we don't need to make multiple objects
        
        // blueprint = house, class = object
        
        // make some of this stuff static
        
        double number = mathy.round(2.3456789, 3);
        
        System.out.println("number: "+number);
        
        
        Account one = new Account ("Me", 1001, 1000);
        Account two = new Account("You", 2001, 2000);
        Account three = new Account("Them", 3001, 3000);
        Account four = new Account("Us", 4001, 4000);
        
        
        // will not be tested on this part
        Account [] bank = {four, two, one, three};
        
        
        
        Sorts.insertionSort(bank); //not a comparable object because comparable wasn't implemented
        for(Account a: bank)
            System.out.println(a);
            
        
    }
}
