package by.epam.task1.model.dish;

import by.epam.task1.model.Product;
import by.epam.task1.model.ingredient.Water;

public class Soup extends Dish {

  public Soup(Water water, Product... products) {
    super(water, products);
  }
}
