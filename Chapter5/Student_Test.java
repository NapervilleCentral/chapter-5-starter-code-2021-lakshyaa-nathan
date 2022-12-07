
/**
 * Write a description of class Student_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student_Test
{
   public static void main (String[] args)
   {



    Address home = new Address("456 Elm st", "Naperville", "IL", 60565);
    Address school = new Address("540 W Auora Ave", "Naperville","IL",60540);

    Student Taylor = new Student("Taylor","Swift",home);
    Student Jill = new Student("Jill","Jones",home);
    Student Tom = new Student("Tom","Jones",home);
    Student Me = null; // set an object to zero
    Student obj = Taylor;
    
    if(obj!=null){
        System.out.println(obj);
    }
    
    else
    { System.out.println("null object reference");}
    
    
    //System.out.println(Student.get_Pop());
    
    //System.out.println(Student.getSchool());
    
    //alias is when two object references the same thing
    
    

    //System.out.println(Jill.compareTo(Taylor));
    //System.out.println(Jill.compareTo(Tom));






}//end of main
}
