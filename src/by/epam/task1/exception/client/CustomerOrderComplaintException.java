package by.epam.task1.exception.client;

import by.epam.task1.exception.ErrorCode;

public final class CustomerOrderComplaintException extends CustomerComplaintException {

  public CustomerOrderComplaintException(String message, ErrorCode code) {
    super(message, code);
  }
}
