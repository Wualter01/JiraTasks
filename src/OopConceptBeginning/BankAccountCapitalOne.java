package OopConceptBeginning;

public class BankAccountCapitalOne {
    //create a custom class called BankAccountCapitalOne for capital one bank accounts:
    //names, account info, balance

    /*
    public variables: bankName, firstName, lastName
private variables: accountHolder, accountNumber, balance
encapsulate all the private data
create a constructor that can initialize firstName and fullName

action:
depositing
withdrawing
availableBalance
toString: returns the full name and balance
     */

    private String AccountHolder;
    private long AccountNumber;
    private double AccountBalance;

   // public variables: bankName, firstName, lastName
    public static String BankName="Capital One";//only static variable the rest are instance variables
    public String firstName;//instance public
    public String lastName;//instance public


//create a constructor that can initialize firstName and fullName this is done passing them in my parameters like shown
    //below
    //the following is how to create a constructor  : access modifier + class name + parameters if you wish to pass them
    //if not it is basically your default constructor
  public BankAccountCapitalOne(String firstName, String lastName){
      this.firstName=firstName;
      this.lastName=lastName;
      //first name + last name = account holder
      this.AccountHolder= firstName + " "+lastName;

  }
    //encapsulate all the private data

    //public void setAccountHolder(String AccountHolder){//setter method so i can assign value to my private variable
    //  this.AccountHolder=AccountHolder; dont need this because ive already set this in constructor above and assigned
    //first name and last name to account holder

    public String getAccountHolder(){//you still need getter method for account holder even though we didnt need
      //account setter because we did it with our constructor
      return AccountHolder;
    }

  public void setAccountNumber(long AccountNumber){//setter  method so that i can assign data to my private variable
      //outside my class
      this.AccountNumber=AccountNumber;
  }

  public long getAccountNumber(){//getter method so i can get and see my variable outside this class
      return AccountNumber;
  }

  public void setAccountBalance(double AccountBalance){//setter method
      this.AccountBalance=AccountBalance;
  }

  public double getAccountBalance(){//getter method
      return AccountBalance;
  }

    /* action: or functions in my class
    depositing
    withdrawing
    availableBalance*/

    //if i deposit money to my account my balance should increase

   public void DepositMoney(double moneyToBeDeposited){//balance + new money to be added
       setAccountBalance(AccountBalance+moneyToBeDeposited);//we used void so that we could see our account balance
       //after money was deposited we dont need to do anything else with it. by calling my setBalance method i can
       //use account balance private variable + the money ill deposit

   }

    public void withdraw(double desiredAmountToWithdraw){
       setAccountBalance(AccountBalance-desiredAmountToWithdraw);//we apply the same logic as our deposit method above
        //using our setAccountBalance for access to our private variable AccountBalance
    }

    public void AvailableBalance(){//this will get me the current balance of my account i dont really need this since
       //i already have getBalance method but for readability we can include it
        System.out.println("Available to spend " +getAccountBalance());//this time we used getAccount balance for
        //access to our private variable a method within our method.
        //since i have made this void i can just print method when i call it with the object i wont have to put in
        //println
    }

    //toString: returns the full name and balance */
    public String toString(){
       return BankName+ " account holder : " +getAccountHolder()+" : Account Balance : "+getAccountBalance();
       //i just need to use my get methods to get full name and accountBalance
    }

}
