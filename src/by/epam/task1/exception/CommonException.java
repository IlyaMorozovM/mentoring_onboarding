package by.epam.task1.exception;

public class CommonException extends Exception {
  private final ErrorCode code;

  public CommonException(String message, ErrorCode code) {
    super(message);
    this.code = code;
  }

  public ErrorCode getCode() {
    return code;
  }
}
