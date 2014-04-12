import ou.*;
/**
 * Daily Programmer Challenge - Easy, 002
 * 
 * Calculator which displays Force, given Mass and Acceleration
 * 
 * @author  s0nOfAGlitch
 * @version 2014.04.12
 */
public class DPC002
{
   // instance variables - replace the example below with your own
   private int mass;
   private int acceleration;
   private int force;

   /**
    * Constructor for objects of class DPC002
    */
   public DPC002()
   {
      mass = 0;
      force = 0;
      acceleration = 0;
   }

   /**
    * Requests mass and acceleration from user, then calculates 
    * and displays force in an alert dialog.
    */
   public void calcForce()
   {
      mass = Integer.parseInt(OUDialog.request("Please enter mass."));
      acceleration = Integer.parseInt(OUDialog.request("Please enter acceleration."));
      
      force = mass * acceleration;
      
      OUDialog.alert("If mass is " + mass + "and acceleration is " + acceleration
                     + " then force is " + force + ".");
   }
}
