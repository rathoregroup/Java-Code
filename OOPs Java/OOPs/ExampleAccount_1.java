import static java.lang.System.out;
public class ExampleAccount_1 {
    public static void main(String[] args) {
        Account myAccount;        
        Account yourAccount;
        
        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Barry Burd";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 55.96;
        
        yourAccount.name = "Jane Q. Public";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

        System.out.print(myAccount.name);
        System.out.print(" (");
        System.out.print(myAccount.address);
        System.out.print(") has $");
        System.out.print(myAccount.balance);
        System.out.println();
        System.out.print(yourAccount.name);
        System.out.print(" (");
        System.out.print(yourAccount.address);
        System.out.print(") has $");
        System.out.print(yourAccount.balance);

        
    }
}
class Account{
    String name;
    String address;
    double balance;
}

//