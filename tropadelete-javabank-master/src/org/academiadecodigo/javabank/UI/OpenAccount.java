package org.academiadecodigo.javabank.UI;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.Account;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.managers.AccountManager;

public class OpenAccount implements QuestionStrategy {
    private AccountManager accountManager;

    @Override
    public void showQuestion(Prompt prompt, Customer customer) {
        // create a question, and set the message to be displayed
        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("What is your name?");
        String name = prompt.getUserInput(question1);

        customer.getAccountManager().openAccount(AccountType.CHECKING);
    customer.getAccountManager().openAccount(AccountType.SAVINGS);
    }
}
