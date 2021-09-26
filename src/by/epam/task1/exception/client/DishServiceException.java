package by.epam.task1.exception.client;

import by.epam.task1.exception.CommonRuntimeException;
import by.epam.task1.exception.ErrorCode;

public final class DishServiceException extends CommonRuntimeException {

  public DishServiceException(String message, ErrorCode code) {
    super(message, code);
  }
}
