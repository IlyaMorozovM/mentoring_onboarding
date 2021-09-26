package by.epam.task1.model.dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.epam.task1.model.Product;

public abstract class Dish {
  private List<Product> ingredients;

  Dish(Product product, Product... products) {
    ingredients = new ArrayList<>(products.length + 1);
    ingredients.addAll(Arrays.asList(products));
    ingredients.add(product);
  }

  public int getCalorie() {
    return this.ingredients.stream().mapToInt(Product::getCalorie).sum();
  }

  public List<Product> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Product> ingredients) {
    this.ingredients = ingredients;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ingredients.toString();
  }
}
