public class PersonNotFoundException extends Exception{

      // Parameterless constructor
   public PersonNotFoundException(){}

      // Constructor that accepts a message
   public PersonNotFoundException(String message){
      super(message);
   }
}
