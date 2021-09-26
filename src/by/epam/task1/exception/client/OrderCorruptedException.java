package by.epam.task1.exception.client;

import by.epam.task1.exception.ErrorCode;

public final class OrderCorruptedException extends CustomerComplaintException {

  public OrderCorruptedException(String message, ErrorCode code) {
    super(message, code);
  }
}
