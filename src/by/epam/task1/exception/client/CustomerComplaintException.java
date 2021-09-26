package by.epam.task1.exception.client;

import by.epam.task1.exception.CommonException;
import by.epam.task1.exception.ErrorCode;

public class CustomerComplaintException extends CommonException {

  public CustomerComplaintException(String message, ErrorCode code) {
    super(message, code);
  }
}
