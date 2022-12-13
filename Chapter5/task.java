public class task implements Priority, Comparable  
{
    private String Task;
    private double Priority;
    
    
    public double getpriority(){
        return Priority;
    }
    
    public task(String task, double priority){
        Task = task;
        Priority = priority;
    }
    
    public String toString(){
        return Task;
    }
    
    
    public void setPriority(double p){
        Priority = p;
    }
    
        }
