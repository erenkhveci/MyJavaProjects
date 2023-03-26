package insuranceCompany;

import java.util.Iterator;
import java.util.TreeSet;

public class AccountManager {
    public static TreeSet<Account>accountTreeSet=new TreeSet<>();
    public static Account login(String email,String password){
        Iterator<Account> iterator=accountTreeSet.iterator();
        while(iterator.hasNext()){
            try {
                Account account =iterator.next();
                account.loginTransactions(email,password);
                if(account.authenticationStatus.equals(AuthenticationStatus.SUCCESS)){
                    return account;
                }

            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());;
            }
        }

        return null ;

    }
}

