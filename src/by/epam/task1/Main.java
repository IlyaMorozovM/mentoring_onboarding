package by.epam.task1;

import by.epam.task1.model.dish.Soup;
import by.epam.task1.model.ingredient.Water;
import by.epam.task1.service.ClientServiceImpl;

public class Main {

  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    new ClientServiceImpl().deliverOrderByCar(new Soup(new Water()), "coupe");
  }
}
