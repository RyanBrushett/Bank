import java.util.ArrayList;

public class Person{

      // We set up the Person attributes.
   private String name;
   private String phone;
   private int    age;

      // This will be how we'll keep track of the person's accounts
   private ArrayList<Account> accounts;

      // This part handles the person's branch
   private Branch branch;

      // Parameterless constructor
      // Followed by constructor that accepts name, phone, age
   public Person(){
      name  = "";
      phone = "";
      age   =  0;
         // Initialize empty list
      accounts = new ArrayList<Account>();
   }
   public Person(String name, String phone, int age){
      this.name  = name;
      this.phone = phone;
      this.age   = age;
         // Initialize empty list
      accounts = new ArrayList<Account>();
   }
      // Another constructor for creating a person with an account
   public Person(String name, String phone, int age, Account account){
      this.name  = name;
      this.phone = phone;
      this.age   = age;
      accounts = new ArrayList<Account>();
      addAccount(account);
   }

      // Setters for each parameter
   public void setName(String name){
      this.name = name;
   }
   public void setPhone(String phone){
      this.phone = phone;
   }
   public void setAge(int age){
      this.age = age;
   }
   public void addAccount(Account account){
      accounts.add(account);
      account.attachOwner(this);
   }
   public void attachAccount(Account account){
      accounts.add(account);
   }
   public void addBranch(Branch branch){
      this.branch = branch;
      branch.attachPerson(this);
   }
   public void attachBranch(Branch branch){
      this.branch = branch;
   }

      // Getters for each parameter
   public String getName(){
      return name;
   }
   public String getPhone(){
      return phone;
   }
   public int getAge(){
      return age;
   }
   public ArrayList<Account> getAccount(){
      return accounts;
   }
   public Account getAccountById(int id) throws AccountNotFoundException{
      for (Account a : accounts){
         if (a.getAcctNum() == id)
            return a;
      }
      throw new AccountNotFoundException("No account with ID " + id + " found.");
   }

      // toString for testing
   public String toString(){
      String myAccounts = "";
      for (Account a : accounts){
         if (a instanceof SavingsAccount){
            myAccounts += "\n";
            myAccounts += ((SavingsAccount)a).toString();
         }
         if (a instanceof CheckingAccount){
            myAccounts += "\n";
            myAccounts += ((CheckingAccount)a).toString();
         }
      }
      return "Name: "    + name  +
             "\nPhone: " + phone +
             "\nAge: "   + age   +
             "\n--Account Summary--" +
             myAccounts;
   }
}
