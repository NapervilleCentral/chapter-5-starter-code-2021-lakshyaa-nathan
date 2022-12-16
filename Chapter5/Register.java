public class Register implements lockable, Comparable
{
    private int key=1234;
    private boolean lock; //lock status
    //true = unlocked
    private int password;
    
    private double sales; //total sales
    private double candies; //pieces of candies in total
    
    public Register(int key, boolean lock)
    {
        this.password = key;
        this.lock = lock;
        this.sales = 0;
        this.candies = 0;
    }

    
    
    //returns sales
    public double getSales(){
        return sales;
    }
    
    
    //returns number of candies sold
    public double getCandiesSold(){
        return candies;
    }
    
    //sets the key
    public void setkey(int key){
        int password = key;
    }
    
    
    //returns true or false depending on if the register is locked or not 
    public boolean locked(){
        return lock;
    }
    
    //changes the total pounds of candy
    public void setpoundsCandy(double pounds){
        
        candies+=pounds/20;
        sales+=1*pounds; //1 dollar per pound
    }
    
    
    //gets total pounds of candy sold
    public double getpoundsCandy(){
        return candies*20;
    }
    
    /**
     * sets pieces of candy sold
     */
    public void setpieceCandy(int pieces){
        candies+=pieces; //adding pieces of candy to the total
        sales+=.05*pieces; //updates sales too
    }
    
    //returns sales report
    public String getSalesReport(){
        if(this.locked())
            return "Locked, please unlock :(";
        else
            return "Sales: "+sales+"\nCandies sold: "+candies+"\nPounds of candies sold: "+(candies*20);
            
    }
    
    
    //locks registers
    public void lock ( int locker){
        if(key==locker){
            lock = true;
        }
    }
    
    
    
    //unlocks registers
    public void unlock(int unlocker){
        if(key==unlocker){
            lock = false;
        }
    }
    
    
    //compares sales 
    public int compareTo(Object obj){
        Register reg = (Register) obj;
        
        int difference = Double.valueOf(this.getSales()).compareTo(Double.valueOf(reg.getSales()));
        return difference;
    }
    
    
}
