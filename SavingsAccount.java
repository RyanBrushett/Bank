public class SavingsAccount extends Account{
   
      // Attributes for savings account
   private double interestRate;
   private final String accountType = "Savings Account";

      // Constructor
   public SavingsAccount(double balance, int acctNum, double interestRate){
      super(balance, acctNum);
      setInterestRate(interestRate);
   }

      // Setters for savings account
   public void setInterestRate(double interestRate){
      this.interestRate = interestRate;
   }

      // Getters for savings account
   public double getInterestRate(){
      return interestRate;
   }
   public String getAccountType(){
      return accountType;
   }

      // Added method to add interest to account balance
   public double addInterest() throws NegativeBalanceException{
      double balance = super.getBalance();
      balance += balance * interestRate;
      super.setBalance(balance);
      return balance;
   }
      // Added method to check the effects of adding interest without commiting it
   public double testInterest(){
      double balance = super.getBalance();
      balance += balance * interestRate;
      return balance;
   }

   @Override
   public String toString(){
      return "Account Type: "    + accountType + 
             "\n"                + super.toString() +
             "\nInterest Rate: " + interestRate;
   }
}
