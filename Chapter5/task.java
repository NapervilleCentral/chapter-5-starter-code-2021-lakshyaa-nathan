public class task implements Priority, Comparable 
{
    private String Task;
    private double Priority;
    
    
    /**
     * Constructs instances of class
     */
    public task(String task, double priority){
        Task = task;
        Priority = priority;
    }
    
    
    /**
     * gets priority
     */    
    public double getPriority(){
        return Priority;
    }
    
    
    /**
     * returns output  
     */ 
    public String toString(){
        return Task+" "+Priority;
    }
    
    /**
     * changes the priority of the task 
     */ 
    public void setPriority(double p){
        Priority = p;
    }
    
    
    
    /**
     * compares the priorities 
     */ 
    public int compareTo(Object obj){
        task aTask = (task) obj;
        
        if(this.getPriority()>aTask.getPriority()){
            return 1;
        }
        
        else if(this.getPriority()<aTask.getPriority()){
            return -1;
        }
        else
            return 0;
        
        
        
        
    }
    
}

