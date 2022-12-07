
public class Student //implements Comparable
{
        // create the population when you create the first obj/student
        // only one population variable is created
        
        
        
        private static int population;
        //public static int population;
    
       private String firstName, lastName;
       private Address homeAddress;
    
       
       
       // School address
       //private static Address schoolAddress = new Address("440 W. Aurora Ave.", "Naperville", "IL", 60540);
    
    
    
       /**
       //  Sets up this Student object with the specified initial values.
       */
       public Student (String first, String last, Address home)
       {
           //static var increase pop for ever student created in that school
           
           // population is shared, but GPA, ID number, etc. is encapsulated within each object
           
          //private static Address schoolAddress = new Address("440 W. Aurora Ave.", "Naperville", "IL", 60540);
           
           
           population++; 
           System.out.println(population);
    
          firstName = first;
          lastName = last;
          homeAddress = home;
    
       }
    //------------------------------------------------
    // returns the population = to the amount of student objects created
    
       public static int get_Pop ()
       {
           return population;
       }
    
    
        //public Address getSchool()
        //{
    
         //   return schoolAddress;
    
        //}
    
    
        /**
          //  implement Comparable by make the compareTo method
       */
    
       public int compareTo(Object obj)
       {
            int result = 0;
           Student temp = (Student) obj;
    
           return result;
       }
    
    
    
    
      public String get_name()
      {
           return firstName;
    
       }
    
    
    
    
    
        /*returns the amount of studnet obj created
       public static int get_pop()
       {
           return population;
    
       }
    */
    
    
       /**
       //  Returns this Student object as a string.
           @return ________
       */
       public String toString()
       {
          String result;
    
          result = firstName + " " + lastName + "\n";
          result += "Home Address:\n" + homeAddress + "\n";
          //result += "School Address:\n" + schoolAddress;
    
          return result;
   }
}//end of Student
