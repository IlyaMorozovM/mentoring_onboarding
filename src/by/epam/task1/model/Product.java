package by.epam.task1.model;

public abstract class Product {

  private final int calorie;

  protected Product(int calorie) {
    this.calorie = calorie;
  }

  public int getCalorie() {
    return this.calorie;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{" + "calorie=" + this.getCalorie() + '}';
  }
}
