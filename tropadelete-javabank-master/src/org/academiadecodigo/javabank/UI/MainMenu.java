package org.academiadecodigo.javabank.UI;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.domain.Bank;

public class MainMenu  {


    public void showQuestion(Bank bank) {

        Prompt prompt = new Prompt(System.in, System.out);
        //show all the questions in this menu
        String[] options = getQuestions();

        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Welcome to javaBank");

        Validation validation = new Validation();
        validation.check(bank);


        //Questions.values()[answerIndex-1].decision.showQuestion();

       //all the classes implement the QuestionStrategy so they
        //all have the same methods, hence their datatype is the class
    }

    //these are the questions that will be available on this menu
    enum Questions {
        CREATE_ACCOUNT("Create an Account", new OpenAccount()),
        DEPOSIT("Make a deposit", new Deposit()),
        WITHDRAWAL("Make a withdrawal", new Withdrawal()),
        CHECK_BALANCE("Check Account Balance", new CheckBalance());

        //this is the enum constructor so you can get the values from them
        public String question;
        public QuestionStrategy decision;

        Questions(String questionText, QuestionStrategy decisionObject) {
            question = questionText;
            this.decision = decisionObject;
        }
    }

    //we transverse the enum into an array string so we can push them into the question list
    public static String[] getQuestions() {
        Questions[] questions = Questions.values();
        String[] question = new String[questions.length];

        for (int i = 0; i < questions.length; i++) {
            question[i] = questions[i].question;
        }

        return question;
    }


}
