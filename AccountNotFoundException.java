public class AccountNotFoundException extends Exception{

      // Keeping track of account number
   int acctNum;

      // Parameterless Constructor
   public AccountNotFoundException(){}

      // Constructor that takes a message
   public AccountNotFoundException(String message){
      super(message);
   }

      // Constructor that takes the entered account number
   public AccountNotFoundException(int acctNum){
      super();
      this.acctNum = acctNum;
   }

      // Method to fetch account number
   public double getAcctNum(){
      return acctNum;
   }
}
