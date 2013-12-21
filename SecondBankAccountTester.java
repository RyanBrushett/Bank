public class SecondBankAccountTester{
   public static void main (String[] args){
         // Create me!
      Person ryan = new Person("Ryan Brushett","6131111111",24,new SavingsAccount(0,1234,0.06));
      Account checking = new CheckingAccount(0,4321,55);
      checking.setOwner(ryan);
      try{
         ryan.getAccountById(1234).deposit(3000);
      }  catch (NegativeDollarAmountException e){
         e.printStackTrace(System.out);
      }  catch (AccountNotFoundException e){
         System.out.println(e.getMessage());
      }
      try{
         ryan.getAccountById(4321).deposit(2500);
      }  catch (NegativeDollarAmountException e){
         e.printStackTrace(System.out);
      }  catch (AccountNotFoundException e){
         System.out.println(e.getMessage());
      }
      Branch branch = new Branch("Mount Pearl","7091111111",9876);
      branch.addPerson(ryan);
      try{
            // Gross, just trying to see how it all plays together.
         branch.getCustomerByName("Ryan Brushett").getAccountById(1234).withdrawl(200);
      }  catch (PersonNotFoundException e){
         System.out.println(e.getMessage());
      }  catch (NegativeDollarAmountException e){
         System.out.println(e.getMessage());
      }  catch (AccountNotFoundException e){
         System.out.println(e.getMessage());
      }  catch (NegativeBalanceException e){
         System.out.println(e.getMessage());
      }
      System.out.println(branch.toString());
   }
}
