public class BankAccountTester{
   public static void main (String[] args){
         // Start by creating a person
         // toString to test that person
      Person ryan = new Person("Ryan","6134067060",24);
      System.out.println(ryan.toString());
      System.out.println();

         // Next is a Savings account
         // Start by depositing 2000 dollars
      SavingsAccount savings = new SavingsAccount(0,1234,0.06);
      try{
         savings.deposit(2000);
      }  catch(NegativeDollarAmountException e){
         e.printStackTrace(System.out);
      }
         // toString to test the account
      System.out.println(savings.toString());
         // We withdraw 100 dollars
         // Expect 2000 - 100 = 1900 dollars
      System.out.println("We'll do a quick withdrawl of 100 dollars\n" +
                         "We expect 2000 - 100 = 1900 dollars");
      try{
         System.out.println("Balance: " + savings.withdrawl(100));
      }  catch(NegativeDollarAmountException e){
         e.printStackTrace(System.out);
      }  catch(NegativeBalanceException e){
         e.printStackTrace(System.out);
      }
         // Now we'll test the interest method
         // Expect 1900 * 0.06 = 2014
      System.out.println("Now we'll test the interest method\n" +
                         "We expect 1900 * 0.06 = 2014");
      try{
         System.out.println("Balance: " + savings.addInterest());
      }  catch(NegativeBalanceException e){
         e.printStackTrace(System.out);
      }
      System.out.println("Next we'll withdraw 3000 and see how it handles it");
      try{
         System.out.println("Balance: " + savings.withdrawl(3000));
      }  catch(NegativeBalanceException e){
         System.out.println("\nERROR: Your withdrawl would result in a balance of: " +
                            e.getBalance() + "\nPlease check values and try again.\n");
      }  catch(NegativeDollarAmountException e){
         e.printStackTrace(System.out);
      }
      System.out.println();

         // Next we'll do a checking account
         // Start by depositing 2500 dollars
      CheckingAccount checking = new CheckingAccount(0,4321,50);
      try{
         checking.deposit(2500);
      }  catch(NegativeDollarAmountException e){
         e.printStackTrace(System.out);
      }
         // toString to test the account
      System.out.println(checking.toString());
      System.out.println();

         // Next we'll create a branch
      Branch scotia = new Branch("Mount Pearl","7097450674",6354);
         // toString to test the branch
      System.out.println(scotia.toString());
      System.out.println();
   }
}
