package by.epam.task1.exception.client;

import by.epam.task1.exception.CommonException;
import by.epam.task1.exception.ErrorCode;

public final class CarCorruptedException extends CommonException {

  public CarCorruptedException(String message, ErrorCode code) {
    super(message, code);
  }
}
