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

    
    
    
    public double getSales(){
        return sales;
    }
    
    public double getCandiesSold(){
        return candies;
    }
    
    
    public void setkey(int key){
        int password = key;
    }
    
    public boolean locked(){
        return lock;
    }
    
    
    public void setpoundsCandy(double pounds){
        
        candies+=pounds/20;
        sales+=1*pounds; //1 dollar per pound
    }
    
    public double getpoundsCandy(){
        return candies*20;
    }
    
    /**
     * two setters for setting candy because apparently 
     * the kiddos like the ability to choose
     */
    public void setpieceCandy(int pieces){
        candies+=pieces; //adding pieces of candy to the total
        sales+=.05*pieces; //updates sales too
    }
    
    
    public String getSalesReport(){
        if(this.locked())
            return "Locked, please unlock :(";
        else
            return "Sales: "+sales+"\nCandies sold: "+candies+"\nPounds of candies sold: "+(candies*20);
            
    }
    
    public void lock ( int locker){
        if(key==locker){
            lock = true;
        }
    }
    
    public void unlock(int unlocker){
        if(key==unlocker){
            lock = false;
        }
    }
    
    
    
    public int compareTo(Object obj){
        Register reg = (Register) obj;
        
        int difference = Double.valueOf(this.getSales()).compareTo(Double.valueOf(reg.getSales()));
        return difference;
    }
    
    
}
