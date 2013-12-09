import java.util.ArrayList;
public class Branch{

      // Attributes for the branch
   private String location;
   private String phoneNum;
   private int    branchId;

      // List for customers
   private ArrayList<Person> customers;

      // Parameterless constructor
   public Branch(){
      location = "";
      phoneNum = "";
      branchId =  0;
      customers = new ArrayList<Person>();
   }
      // Constructor that accepts location, phone number, branch ID
   public Branch(String location, String phoneNum, int branchId){
      this.location = location;
      this.phoneNum = phoneNum;
      this.branchId = branchId;
      customers = new ArrayList<Person>();
   }

      // Setters for branch info
   public void setLocation(String location){
      this.location = location;
   }
   public void setPhoneNum(String phoneNum){
      this.phoneNum = phoneNum;
   }
   public void setBranchId(int branchId){
      this.branchId = branchId;
   }
   public void addPerson(Person person){
      customers.add(person);
      person.attachBranch(this);
   }
   public void attachPerson(Person person){
      customers.add(person);
   }

      // Getters for branch info
   public String getLocation(){
      return location;
   }
   public String getPhoneNum(){
      return phoneNum;
   }
   public int getBranchId(){
      return branchId;
   }
   public Person getCustomerByName(String name) throws PersonNotFoundException{
      for (Person p : customers){
         if (p.getName().equalsIgnoreCase(name))
            return p;
      }
      throw new PersonNotFoundException("No customer was found by the name of " + name);
   }

      // toString for testing
   public String toString(){
      String myCustomers = "";
      for (Person p : customers){
         myCustomers += "\n";
         myCustomers += p.toString();
      }
      return "Location: "       + location +
             "\nPhone Number: " + phoneNum +
             "\nBranch ID: "    + branchId +
             "\n-*-Customer Summary-*-" + myCustomers;
   }
}
