package by.epam.task1.service;

import by.epam.task1.exception.ErrorCode;
import by.epam.task1.exception.client.CarCorruptedException;
import by.epam.task1.exception.client.CustomerHasNoMoneyException;
import by.epam.task1.exception.client.CustomerOrderComplaintException;
import by.epam.task1.exception.client.FeedbackSystemFailedException;
import by.epam.task1.exception.client.OrderCorruptedException;
import by.epam.task1.model.dish.Dish;

public class ClientServiceImpl implements ClientService {

  public final void deliverOrderByCar(Dish dishToDeliver) throws CarCorruptedException {
    throw new CarCorruptedException("Delivery car is corrupted!", ErrorCode.DELIVERY_CAR_CORRUPTED);
  }

  /** @deprecated it is old approach, use {@link #deliverOrderByCar(Dish)} instead */
  @Deprecated
  public final void deliverOrderByCar(Dish dishToDeliver, String carType) {
    // magic
  }

  @Override
  public final void deliverOrder() throws OrderCorruptedException {
    throw new OrderCorruptedException(
        "Order was corrupted during delivery!", ErrorCode.ORDER_CORRUPTED);
  }

  public final void takeOrder() throws CustomerOrderComplaintException {
    throw new CustomerOrderComplaintException(
        "Customer has a complaint about order!", ErrorCode.ORDER_COMPLAINT);
  }

  public final void calculateCustomer() throws CustomerHasNoMoneyException {
    throw new CustomerHasNoMoneyException(
        "Customer has no money to pay the bill!", ErrorCode.CUSTOMER_HAS_NO_MONEY);
  }

  public void requestFeedback() throws FeedbackSystemFailedException {
    throw new FeedbackSystemFailedException(
        "Feedback System Failed!", ErrorCode.FEEDBACK_SYSTEM_FAILED);
  }
}
