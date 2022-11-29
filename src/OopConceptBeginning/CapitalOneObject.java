package OopConceptBeginning;

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
    }

}
