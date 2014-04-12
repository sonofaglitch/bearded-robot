import ou.*;

/**
 * Daily Programmer Challenge - Easy 001
 * A class that models reddit users, with methods to ask users for their information
 * (name, age, username)
 * 
 * @author s0nOfAGlitch
 * @version 1.0
 */
public class redditUser
{
   // instance variables
   private String name;
   private int age;
   private String username;

   /**
    * Constructor for objects of class redditUser
    */
   public redditUser()
   {
      // initialise instance variables
      name = "";
      age = 0;
      username = "";
   }

   /**
    * Constructor for objects of class redditUser which initialises variables
    * name, age and username to the value of the arguments aName, anAge and aUsername
    * respectively
    */
   public redditUser(String aName, int anAge, String aUsername)
   {
      name = aName;
      age = anAge;
      username = aUsername;
   }
   
   /**
    * Sets the instance variable name to the value of the argument
    * aName
    */
   public void setName(String aName)
   {
      name = aName;
   }
   
   /**
    * Prompts the user to input their name and assigns the result 
    * to the name instance vairable
    */
   public void requestName()
   {
      name = OUDialog.request("Please enter your name.");
   }
   
   /**
    * Returns the user's name
    */
   public String getName()
   {
      return name;
   }
   
   /**
    * Sets the instance variable age to the value of the argument
    * anAge
    */
   public void setAge(int anAge)
   {
      age = anAge;
   }
   
   
   /**
    * Prompts the user to input their age and assigns the result 
    * to the age instance vairable
    */
   public void requestAge()
   {
      age = Integer.parseInt(OUDialog.request("Please enter your age."));
   }

    /**
    * Returns the user's age
    */
   public int getAge()
   {
      return age;
   }
   
   /**
    * Sets the instance variable username to the value of the argument
    * aUsername
    */
   public void setUsername(String aUsername)
   {
      username = aUsername;
   }
   
   /**
    * Prompts the user to input their Reddit username and assigns the result 
    * to the age instance vairable
    */
   public void requestUsername()
   {
      username = OUDialog.request("Please enter your Reddit username.");
   }
   
   /**
    * Returns the user's Reddit username
    */
   public String getUsername()
   {
      return username;
   }
   
   /**
    * Asks for user's name, age and Reddit username and display the information 
    * in a dialogue box.
    */
   public void getAndReturnInfo()
   {
      requestName();
      requestAge();
      requestUsername();
      
      OUDialog.alert("Gotcha. \nYour name is " + getName() + ", you're " + getAge() + 
      " years old and your username is " + getUsername() + ". \nWelcome to Reddit.");
   }
   
}
