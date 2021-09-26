package by.epam.task3.main;

import java.util.Arrays;

public class DynamicArray<E> {

  private static final int DEFAULT_CAPACITY = 10;

  private Object[] data;
  private int size;

  public DynamicArray() {
    this.data = new Object[DEFAULT_CAPACITY];
  }

  public DynamicArray(int initialCapacity) {
    this.data = new Object[initialCapacity];
  }

  public void add(E e) {
    doubleCapacityIfOverflowed();
    data[size++] = e;
  }

  public E get(int index) {
    validateIndex(index);
    return (E) data[index];
  }

  private void validateIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(
          String.format(
              "Specified index %s out of bounds, current amount of elements %s", index, size));
    }
  }

  private void doubleCapacityIfOverflowed() {
    if (data.length == size) {
      Object[] newArr = new Object[data.length * 2];
      System.arraycopy(data, 0, newArr, 0, data.length);
      data = newArr;
    }
  }

  private void reduceCapacityIfSpare() {
    if (data.length / 2 > size) {
      Object[] newData = new Object[data.length / 2];
      System.arraycopy(data, 0, newData, 0, data.length / 2);
      this.data = newData;
    }
  }

  public E remove(int index) {
    validateIndex(index);
    Object removedElement = data[index];
    int amountToBeMoved = size - index - 1;
    if (amountToBeMoved > 0) System.arraycopy(data, index + 1, data, index, amountToBeMoved);
    data[--size] = null;
    reduceCapacityIfSpare();
    return (E) removedElement;
  }

  @Override
  public String toString() {
    return Arrays.toString(data);
  }
}
