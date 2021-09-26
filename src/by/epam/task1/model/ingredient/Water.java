package by.epam.task1.model.ingredient;

import by.epam.task1.model.Product;

public class Water extends Product {

  public Water() {
    this(0);
  }

  private Water(int calorie) {
    super(calorie);
  }
}
