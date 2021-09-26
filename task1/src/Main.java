import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Person> list = new ArrayList<>();
    list.add(new Person("John", 15));
    list.add(new Person("Farrel", 23));
    list.add(new Person("Ben", 35));
    list.add(new Person("David", 42));
    list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
    list.forEach(obj -> System.out.print(obj + ", "));
    System.out.println("\n");
    list.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
    list.forEach(obj -> System.out.print(obj + ", "));
  }
}
