

public class Register implements lockable, Comparable
{
    private int password;
    private boolean lock;
    //true = unlocked
    private double sales;
    private int candies;
    
    public Register(int key, boolean lock)
    {
        setkey(key);
        boolean Lock = lock;
        double sales = 0;
        int candies = 0;
    }

    
    public String getSales(){
        return sales+"";
    }
    
    public int getCandy(){
        return candies;
    }
    
    public void setkey(int key){
        int password = key;
    }
    
    public boolean locked(){
        return lock;
    }
    
    
    public void setCandy(int sold){
        candies+=sold;
    }
    
    public void setSales(int sale){
        sales+=sale;
    }
    
    
    public String toString(){
        if(this.locked())
            return "Locked, please unlock :(";
        else
            return "Sales: "+sales+"\nCandies sold: "+candies+"\nPounds of candies sold: "+(candies*20);
            
    }
    
    public void lock ( int locker){
        if(this.password==locker){
            lock = false;
        }
    }
    
    public void unlock(int unlocker){
        if(this.password==unlocker){
            lock = true;
        }
    }
    
    public int compareTo(Object obj){
        Register reg = (Register) obj;
        int difference = this.getSales().compareTo(reg.getSales());
        return difference;
    }
    
    
}
