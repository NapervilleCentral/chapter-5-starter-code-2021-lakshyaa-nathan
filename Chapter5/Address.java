//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address implements Comparable 
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
       String otherstreet = object.streetAddress;
       String street = streetadd.substring(streetadd.indexOf(" "), streetadd.length());
       
       
       String otherStreet = otherstreet.substring(otherstreet.indexOf(" "), otherstreet.length());
       
       int street1num = Integer.parseInt(street);
       int street2num = Integer.parseInt(otherStreet);
       
       if(street.equals(otherstreet)){
           
           String address1num = streetadd.substring(0,3);
           String address2num = otherStreet.substring(0,3);
           
           int num1 = Integer.parseInt(address1num);
           int num2 = Integer.parseInt(address2num);
    
           return num1-num2;
       }
       
       
       else{
           return street1num-street2num;
       }
       
       
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
