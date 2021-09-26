package by.epam.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.task1.exception.client.CarCorruptedException;
import by.epam.task1.exception.client.CustomerHasNoMoneyException;
import by.epam.task1.exception.client.CustomerOrderComplaintException;
import by.epam.task1.exception.client.FeedbackSystemFailedException;
import by.epam.task1.exception.client.OrderCorruptedException;
import by.epam.task1.model.Product;
import by.epam.task1.model.dish.Dish;
import by.epam.task1.model.dish.Soup;
import by.epam.task1.model.ingredient.Chicken;
import by.epam.task1.model.ingredient.Vegetable;
import by.epam.task1.model.ingredient.Water;
import by.epam.task1.model.ingredient.vegetable.Cabbage;
import by.epam.task1.model.ingredient.vegetable.Carrot;
import by.epam.task1.model.ingredient.vegetable.Potato;
import by.epam.task1.service.ClientServiceImpl;
import by.epam.task1.service.DishServiceImpl;
import by.epam.task1.util.CalorieUtil;

public class Main {

  public static void main(String[] args) {
    Water water = new Water();
    Carrot carrot = new Carrot(12);
    Potato potato = new Potato(15);
    Chicken chicken = new Chicken(100);
    Cabbage cabbage = new Cabbage(8);
    Dish chickenSoup = new Soup(water, carrot, cabbage, chicken, potato);
    System.out.println("Посчитать калорийность.");
    System.out.println(chickenSoup.getCalorie());

    List<Vegetable> vegetablesForSalad = new ArrayList<>();
    vegetablesForSalad.add(carrot);
    vegetablesForSalad.add(potato);
    vegetablesForSalad.add(cabbage);
    System.out.println("Провести сортировку овощей для салата на основе одного из параметров");
    System.out.println(vegetablesForSalad);
    vegetablesForSalad.sort(Comparator.comparingInt(Product::getCalorie));
    System.out.println(vegetablesForSalad);

    System.out.println("Найти продукты в борще, соответствующие заданному диапазону параметров.");
    System.out.println(chickenSoup);
    System.out.println(new DishServiceImpl().findIngredientsByCalorie(chickenSoup, 2, 11));

    // Exceptions

    // 1. Dish Ingredients are empty
    Soup emptySoup = new Soup(new Water());
    emptySoup.setIngredients(new ArrayList<>());
    new DishServiceImpl().findIngredientsByCalorie(emptySoup, 2, 11);

    // 2. OrderCorruptedException, CustomerOrderComplaintException
    ClientServiceImpl clientService = new ClientServiceImpl();
    try {
      clientService.deliverOrder();
      clientService.takeOrder();
    } catch (OrderCorruptedException | CustomerOrderComplaintException e) {
      System.out.println(e);
      // Create new order and deliver
    }

    // 3. CustomerHasNoMoneyException
    try {
      clientService.calculateCustomer();
    } catch (CustomerHasNoMoneyException e) {
      System.out.println(e);
      // suggest credit
    }

    // 4. CarCorruptedException
    try {
      clientService.deliverOrderByCar(emptySoup);
    } catch (CarCorruptedException e) {
      System.out.println(e);
      // make excuses to customer
    } finally {
      // deliver order
    }

    // 5. FeedbackSystemFailedException
    try {
      clientService.requestFeedback();
    } catch (FeedbackSystemFailedException e) {
      System.out.println(e);
      // make feedback using phone call
    }

    // Point 7 in HomeTask. Usage of static method
    System.out.println(CalorieUtil.isCalorieInRange(chickenSoup.getCalorie(), 20, 100));
  }
}
