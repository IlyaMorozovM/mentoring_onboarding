package main;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    MarriageFunctionService service = new MarriageFunctionService();
    Person freeChild = new Person("John", 21);
    Person freeSpouse1 = new Person("Marry", 20);
    Person freeSpouse2 = new Person("Bob", 25);

    // ThreeFunction
    service.getRegisterMarriageFunction().apply(freeSpouse1, freeSpouse2, freeChild);

    List<String> personsInfoList =
        service.getFormPersonInfoFunction().apply(freeSpouse1, freeSpouse2, freeChild);
    System.out.println(personsInfoList);
  }
}
