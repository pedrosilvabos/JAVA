package org.academiadecodigo.javabank.UI;

import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.Account;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.managers.AccountManager;

public class OpenAccount implements QuestionStrategy {
    private AccountManager accountManager;
    @Override
    public void showQuestion() {
        //this comes from behind
        AccountManager accountManager = new AccountManager();

    }
    public void createCustomer(){
        Customer customer = new Customer();
        customer.setAccountManager(accountManager);
    }

    public Account creatCheckingsAccount (){
        return accountManager.openAccount(AccountType.CHECKING);
    }
    public Account creatSavingsAccount (){
        return accountManager.openAccount(AccountType.SAVINGS);
    }

}
