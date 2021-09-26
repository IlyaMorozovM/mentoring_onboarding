package by.epam.task1.service;

import java.util.List;

import by.epam.task1.model.Product;
import by.epam.task1.model.dish.Dish;

@FunctionalInterface
public interface DishService {

  List<Product> findIngredientsByCalorie(Dish dish, int minInclusive, int maxInclusive);
}
