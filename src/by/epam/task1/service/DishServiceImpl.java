package by.epam.task1.service;

import static by.epam.task1.exception.ErrorCode.DISH_INGREDIENTS_ARE_EMPTY;

import java.util.List;
import java.util.stream.Collectors;

import by.epam.task1.exception.client.DishServiceException;
import by.epam.task1.model.Product;
import by.epam.task1.model.dish.Dish;
import by.epam.task1.util.CalorieUtil;

public class DishServiceImpl implements DishService {

  public final List<Product> findIngredientsByCalorie(
      Dish dish, int minInclusive, int maxInclusive) {
    if (dish.getIngredients().isEmpty()) {
      throw new DishServiceException("Dish Ingredients are empty!", DISH_INGREDIENTS_ARE_EMPTY);
    }
    return dish.getIngredients().stream()
        .filter(prod -> CalorieUtil.isCalorieInRange(prod.getCalorie(), minInclusive, maxInclusive))
        .collect(Collectors.toList());
  }
}
