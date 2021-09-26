package by.epam.task1.exception.client;

import by.epam.task1.exception.CommonException;
import by.epam.task1.exception.ErrorCode;

public final class CustomerHasNoMoneyException extends CommonException {

  public CustomerHasNoMoneyException(String message, ErrorCode code) {
    super(message, code);
  }
}
