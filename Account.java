public abstract class Account{

      // Set up the account attributes
   private double balance;
   private int    acctNum;
   private Person owner;

      // Parameterless constructor
      // Followed by full constructor accepting balance and account number.
   public Account(){
      balance = 0;
      acctNum = 0;
   }
   public Account(double balance, int acctNum){
      this.balance = balance;
      this.acctNum = acctNum;
   }

      // Setters for balance and account number
   public void setBalance(double balance) throws NegativeBalanceException{
      if (balance <= 0)
         throw new NegativeBalanceException(balance);
      this.balance = balance;
   }
   public void setAcctNum(int acctNum){
      this.acctNum = acctNum;
   }
   public void setOwner(Person owner){
      this.owner = owner;
      owner.attachAccount(this);
   }
   public void attachOwner(Person owner){
      this.owner = owner;
   }

      // Withdrawl and deposit methods
      // Note that these use custom exception handling
   public double withdrawl(double amount) throws NegativeDollarAmountException,
                                                 NegativeBalanceException{
      if (amount <= 0)
         throw new NegativeDollarAmountException(amount);
      if (amount > getBalance())
         throw new NegativeBalanceException(balance - amount);
      double bal = getBalance();
      return balance -= amount;
   }
   public double deposit(double amount) throws NegativeDollarAmountException{
      if (amount <= 0)
         throw new NegativeDollarAmountException(amount);
      return balance += amount;
   }

      // Getters for balance and account num
   public double getBalance(){
      return balance;
   }
   public int getAcctNum(){
      return acctNum;
   }
   public Person getOwner(){
      return owner;
   }

      // toString for testing
   public String toString(){
      return "Balance: "          + balance +
             "\nAccount Number: " + acctNum +
             "\nOwner: "          + owner.getName();
   }
}
