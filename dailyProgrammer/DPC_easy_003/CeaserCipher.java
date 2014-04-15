import ou.*;
/**
 * Daily Programming Challenges - [Easy] #003
 * 
 * @author s0nOfAGlitch 
 * @version 2014.04.14
 */
public class CeaserCipher
{
   // instance variables - replace the example below with your own
   private int cipherRotation;
   private String inputString;
   private String outputString;

   /**
    * Constructor for objects of class CeaserCipher
    */
   public CeaserCipher()
   {
      // initialise instance variables
   }

   
   
   /**
    * Main method for the Ceaser Cipher program
    */
   public void main()
   {
      this.requestInputString();
      this.requestCipherRotation();
      this.encodeMessage();
      this.displayOutput();
   }
   
   
   /**
    * Sets inputString to the value of the argument anInputString
    */
   public void setInputString(String anInputString)
   {
      this.inputString = anInputString;
   }
   
   /**
    * Returns the value of inputString
    */
   public String getInputString()
   {
      return this.inputString;
   }
   
    /**
    * Sets outputString to the value of the argument anOutputString
    */
   public void setOutputString(String anOutputString)
   {
      this.outputString = anOutputString;
   }
   
   /**
    * Returns the value of outputString
    */
   public String getOutputString()
   {
      return this.outputString;
   }
   
    /**
    * Sets cipherRotation to the value of the argument aCipher
    */
   public void setCipherRotation(int aCipher)
   {
      this.cipherRotation = aCipher;
   }
   
   /**
    * Returns the value of cipherRotation
    */
   public int getCipherRotation()
   {
      return this.cipherRotation;
   }
   
   /**
    * Requests the input to be encoded/decoded from the user
    * and stores in inputString, then converts the input string into lowercase
    */
   public void requestInputString()
   {
      this.setInputString(OUDialog.request("Please enter your message."));
      this.setInputString(this.inputString.toLowerCase());
   }
   
   /**
    * Requests the number of cipher rotations to be used
    * and stores in cipherRotation
    */
   public void requestCipherRotation()
   {
      this.setCipherRotation(Integer.parseInt(OUDialog.request("Please enter cipher key to be used \n(1 - 26)")));
   }
   
   /**
    * Encodes the inputStrng and stores the coded message in outputString
    * as uppercase
    */
   public void encodeMessage()
   {
      //Creates char array to store input and output characters
      char[] inputChars = new char[inputString.length()];
      char[] outputChars = new char[inputString.length()];


      //Fills inputChar array with each character from input string
      for (int i = 0; i < inputString.length(); i++)
      {
         inputChars[i] = inputString.charAt(i);
      }


      //Increments each character by cipher and fills outputChars array
      for(int i = 0; i < inputString.length(); i++)
      {  
        
         if 	((inputChars[i] + cipherRotation) > 122 || (inputChars[i] + cipherRotation) < 0)
         {
            outputChars[i] = (char) (96 + (cipherRotation -(122 - inputChars[i])));
         }
         else
         {
            outputChars[i] = (char) (inputChars[i] + cipherRotation);
         }
      }
      
      this.setOutputString(String.valueOf(outputChars).toUpperCase());
   }
   
   /**
    * Displays the outputString in an alert dialogue
    */
   public void displayOutput()
   {
      OUDialog.alert("Your message has been encoded as is as follows:\n\n" + this.getOutputString());
   }
   
}
