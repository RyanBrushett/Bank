public class NegativeBalanceException extends Exception{

      // Exception will have an amount parameter
   double balance;

      // Parameterless constructor
   public NegativeBalanceException(){}

      // Constructor that accepts a message
   public NegativeBalanceException(String message){
      super(message);
   }

      // Constructor that accepts a dollar balance
   public NegativeBalanceException(double balance){
      super();
      this.balance = balance;
   }

      // Fetches the balance that was passed to the exception
   public double getBalance(){
      return balance;
   }
}
