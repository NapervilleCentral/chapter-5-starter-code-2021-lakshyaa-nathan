public class task implements Priority  
{
    private String Task;
    private double Priority;
    
    public task(String task, double priority){
        Task = task;
        Priority = priority;
    }
    
    
    
    public double getPriority(){
        return Priority;
    }
    
    
    
    public String toString(){
        return Task;
    }
    
    
    public void setPriority(double p){
        Priority = p;
    }
    
    
    public double compareTo(Object T){
        task aTask = (task) T;
        
        double compare = this.Priority - aTask.Priority;
        
        return compare;
    }
    
    public static void insertionSort (task [] mytasks)
   {
      for (int index = 1; index < 9; index++)
      {
         Comparable key = mytasks[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && objects[position-1].compareTo(key) > 0)
         {
            objects[position] = objects[position-1];
            position--;
         }

         objects[position] = key;
      }
   }
}
