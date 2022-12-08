//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address
{

   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }
   
   
   
   
   /**
    * Will return +1 if the Street name is > or <
    * if they are the same then check the street number
    * 123 Elm < 123 Maple
    * 1200 Elm > 245 Elm
    */
   
   
   public int compareTo(Object obj)
   {
       Address object = (Address) obj;
       
       String streetadd = this.streetAddress;
       String street = streetadd.substring(streetadd.indexOf(" "), streetadd.length());
       
       String otherstreet = obj.streetAddress;
       String otherStreet = otherstreet.substring(otherstreet.indexOf(" "), otherstreet.length());
       
       int street1num = parseInt(street);
       int street2num = parseInt(otherStreet);
   }

   
   
   
   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
