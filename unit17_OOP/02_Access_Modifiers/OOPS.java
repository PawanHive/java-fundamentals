public class OOPS {

  public static void main(String[] args) {
    BankAccount myAcc = new BankAccount(); // object created
    
    myAcc.username = "Pawan";
    System.out.println(myAcc.username);

    // myAcc.password; // giving error: "The field BankAccount.password is not visible", because it is private
    // System.out.println(myAcc.password);  // we can't print because it is 'private'
    myAcc.setPassword("asdf@123");
  }
}

class BankAccount {
  public String username; // 'public' is access modifiers, .... it can access anywhere 
  private String password; // 'private' is access modifiers, .... this can't access by anywher or anyone else, but we can change it

  public void setPassword(String pass) {
    password = pass;
  }
}