
/**
 * Write a description of class task_driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class task_driver
{
    
    public static void main(String [] args)
    {
        task wife = new task("Christmas gift for Wife", 3);
        task kids = new task("Christmas gift for Kids", 6);
        task trash = new task("Trash lots of stuff in shop down stairs", 5.1);
        task organize = new task("Organize shop down stairs", 5.4);
        task tile = new task("Tile Downstairs landing ", 2.1);
        task aoc = new task("Print Vinyl decal for Advent of Code", 4);
        task decal = new task("Print Vinyl decal Wall downstairs", 4);
        task oil = new task("Change Oil in Toyota", 1.1);
        task beat = new task("Beat Mike in Advent of Code ", 1);
        task grade = new task("Grade", 10);
        
        
        task [] mytasks = {wife, kids, trash, organize, tile, aoc, decal, oil, beat, grade};
        
    
        for(task t: mytasks){
            double P = task.getPriority();
            
        }
    }
}
