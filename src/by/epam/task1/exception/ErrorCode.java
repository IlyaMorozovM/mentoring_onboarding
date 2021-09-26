package by.epam.task1.exception;

public enum ErrorCode {
  DISH_INGREDIENTS_ARE_EMPTY(1001),
  DELIVERY_CAR_CORRUPTED(1100),
  ORDER_CORRUPTED(1101),
  ORDER_COMPLAINT(1102),
  CUSTOMER_HAS_NO_MONEY(1103),
  FEEDBACK_SYSTEM_FAILED(1104);

  private final int code;

  ErrorCode(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
