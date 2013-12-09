public class CheckingAccount extends Account{
   
      // Attributes for checking account
   private double expenses;
   private final String accountType = "Checking Account";

      // Constructor for checking account accepts balance, account number, and expenses
   public CheckingAccount(double balance, int acctNum, double expenses){
      super(balance,acctNum);
      setExpenses(expenses);
   }

      // Setter for expenses
   public void setExpenses(double expenses){
      this.expenses = expenses;
   }
      
      // Getters for checking account
   public double getExpenses(){
      return expenses;
   }
   public String getAccountType(){
      return accountType;
   }

      // Method to deduct expenses
   public double deductExpenses() throws NegativeDollarAmountException,
                                         NegativeBalanceException{
      double balance = super.getBalance();
      balance = super.withdrawl(expenses);
      return balance;
   }
      // Tester to deduct expenses but not commit the deduction
   public double testDeduct(){
      double balance = super.getBalance();
      balance -= expenses;
      return balance;
   }

   @Override
   public String toString(){
      return "Account Type: " + accountType +
             "\n"             + super.toString() +
             "\nExpenses: "   + expenses;
   }
}
