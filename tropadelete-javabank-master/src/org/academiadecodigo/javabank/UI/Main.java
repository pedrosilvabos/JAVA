package org.academiadecodigo.javabank.UI;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

public class Main {
    public static void main(String[] args) {
        //new bank and its account manager
        AccountManager accountManager = new AccountManager();
        Bank bank = new Bank(accountManager);
        //new costumers for the bank
        Customer customer = new Customer();
        bank.addCustomer(customer);

        Customer customer2 = new Customer();
        bank.addCustomer(customer2);

        //identify the costumers
        Prompt prompt = new Prompt(System.in, System.out);
        IntegerInputScanner customerNumber = new IntegerInputScanner();
        customerNumber.setMessage("Customer number?");

        int customerN = prompt.getUserInput(customerNumber);

        bank.checkCostumer(customerN, customer2);

        MainMenu mainMenu = new MainMenu();
        mainMenu.showQuestion();
    }
}
