public class task implements Priority, Comparable  
{
    private String Task;
    private double Priority;
    
    public task(String task, double priority){
        Task = task;
        Priority = priority;
    }
    
    
    
    public String getPriority(){
        return Priority+"";
    }
    
    
    
    public String toString(){
        return Task;
    }
    
    
    public void setPriority(double p){
        Priority = p;
    }
    
    
    public int compareTo(Object T){
        task aTask = (task) T;
        
        int compare = this.getPriority().compareTo(aTask.getPriority());
        
        return compare;
    }
    
}

