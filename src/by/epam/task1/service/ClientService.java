package by.epam.task1.service;

import by.epam.task1.exception.client.CarCorruptedException;
import by.epam.task1.exception.client.CustomerHasNoMoneyException;
import by.epam.task1.exception.client.CustomerOrderComplaintException;
import by.epam.task1.exception.client.FeedbackSystemFailedException;
import by.epam.task1.exception.client.OrderCorruptedException;
import by.epam.task1.model.dish.Dish;

public interface ClientService {

  void deliverOrderByCar(Dish dishToDeliver) throws CarCorruptedException;

  void deliverOrder() throws OrderCorruptedException;

  void takeOrder() throws CustomerOrderComplaintException;

  void calculateCustomer() throws CustomerHasNoMoneyException;

  void requestFeedback() throws FeedbackSystemFailedException;
}
