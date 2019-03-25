package org.academiadecodigo.javabank.UI;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.domain.Customer;

public interface QuestionStrategy {

  void showQuestion(Prompt prompt, Customer customer);
}
