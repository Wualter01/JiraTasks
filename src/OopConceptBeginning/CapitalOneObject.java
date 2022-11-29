package OopConceptBeginning;

import MyUtils.GenericUtils;

public class CapitalOneObject {
    public static void main(String[] args) {
        BankAccountCapitalOne account1 = new BankAccountCapitalOne("Wualter", "Vasquez");
        //i cannot leave parameters blank or it'll give
        //me an error that is because we have specified that our constructor takes two strings first name and last name

        System.out.println("account1.getAccountHolder() = " + account1.getAccountHolder());
        System.out.println("account1.firstName = " + account1.firstName);
        //System.out.println(account1.AccountHolder()); cannot directly call private instance variable for that
        //we use getter method

        System.out.println("account1.getAccountBalance() = " + account1.getAccountBalance());
        account1.setAccountBalance(10000.00);//setter allows me to assign value to my private variable
        System.out.println(account1.getAccountBalance());//getter allows me to get it and see it

        account1.DepositMoney(5000);
        System.out.println(account1.getAccountBalance());

        account1.withdraw(3000);
        System.out.println(account1.getAccountBalance());

        account1.AvailableBalance();
        System.out.println(account1);

        account1.setAccountNumber(0037363535334334l);//you go above integer default range you'll have to add l for long
        System.out.println(account1.getAccountNumber());

        GenericUtils.StarSeparation();

        BankAccountCapitalOne account2 = new BankAccountCapitalOne("Jennifer","Ayala");
        account2.setAccountNumber(934792749274948l);
        account2.setAccountBalance(5500.0);
        account2.AvailableBalance();//since it is an instance variable it gives me new information each time. also since
        //i have made void my return type i dont have one and therefor dont need to pass it in println

        System.out.println(account2);

        account2.withdraw(2000);
        System.out.println(account2);
        account2.AvailableBalance();

    }

}
