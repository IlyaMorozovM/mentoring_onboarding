package by.epam.task1.exception;

public class CommonRuntimeException extends RuntimeException {
  private final ErrorCode code;

  public CommonRuntimeException(String message, ErrorCode code) {
    super(message);
    this.code = code;
  }

  public ErrorCode getCode() {
    return code;
  }
}
