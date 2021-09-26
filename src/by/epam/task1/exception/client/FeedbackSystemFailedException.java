package by.epam.task1.exception.client;

import by.epam.task1.exception.CommonException;
import by.epam.task1.exception.ErrorCode;

public final class FeedbackSystemFailedException extends CommonException {

  public FeedbackSystemFailedException(String message, ErrorCode code) {
    super(message, code);
  }
}
