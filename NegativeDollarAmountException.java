public class NegativeDollarAmountException extends Exception{

      // Exception will have an amount parameter
   double amount;

      // Parameterless constructor
   public NegativeDollarAmountException(){}

      // Constructor that accepts a message
   public NegativeDollarAmountException(String message){
      super(message);
   }

      // Constructor that accepts a dollar amount
   public NegativeDollarAmountException(double amount){
      super();
      this.amount = amount;
   }

      // Fetches the amount that was passed to the exception
   public double getAmount(){
      return amount;
   }
}
