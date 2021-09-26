package sandbox;

@FunctionalInterface
public interface DivorceService {

  int calcDivorcePrice(Person p1, Person p2);

  static void declineDivorce() {
    System.out.println("Divorce declined");
  }

  default void showDivorces() {
    System.out.println("Divorce types");
  }
}
