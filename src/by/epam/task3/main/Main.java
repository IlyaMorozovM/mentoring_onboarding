package by.epam.task3.main;

public class Main {

  public static void main(String[] args) {
    DynamicArray<String> dynamicArray = new DynamicArray<>();
    dynamicArray.add("1");
    dynamicArray.add("2");
    dynamicArray.add("3");
    dynamicArray.add("4");
    dynamicArray.add("5");
    dynamicArray.add("6");
    dynamicArray.add("7");
    dynamicArray.add("8");
    dynamicArray.add("9");
    dynamicArray.add("10");

    dynamicArray.remove(3);
    dynamicArray.remove(3);
    dynamicArray.remove(3);
    dynamicArray.remove(3);
    dynamicArray.remove(3);
    dynamicArray.remove(3);
    dynamicArray.remove(3);
    dynamicArray.remove(2);
    dynamicArray.remove(0);
    dynamicArray.remove(0);
    dynamicArray.remove(0);
  }
}
