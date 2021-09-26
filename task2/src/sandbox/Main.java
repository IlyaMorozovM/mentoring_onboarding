package sandbox;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    MarriageService service = new MarriageService();
    Person person1 = new Person("John", 21);
    Person person2 = new Person("Jane", 19);
    Person freeSpouse1 = new Person("Marry", 20);
    Person freeSpouse2 = new Person("Bob", 25);
    Person freeSpouse3 = new Person("Gary", 30);
    List<Person> freeSpouseList = Arrays.asList(freeSpouse1, freeSpouse2, freeSpouse3);

    // BiConsumer
    service.getMarriageFunction().accept(person1, person2);

    // Supplier
    Person foundSpouse1 = service.getFindSpouseFunction().get();
    System.out.println("Spouse found: " + foundSpouse1);

    // Function
    Person foundSpouse2 = service.getFindSpouseByPersonFunction().apply(freeSpouse1);
    System.out.println("Spouse found: " + foundSpouse2);

    // Predicate
    List<Person> filteredList =
        freeSpouseList.stream()
            .filter(service.geFilterCandidateFunction())
            .collect(Collectors.toList());
    System.out.println("Filtered Candidates: " + filteredList);

    // My Functional Interface
    DivorceService divorceService =
        new DivorceService() {
          @Override
          public int calcDivorcePrice(Person p1, Person p2) {
            System.out.println(String.format("Accept divorce between people: %s, %s", p1, p2));
            return p1.getAge() + person2.getAge() / 2;
          }
        };
    service.registerDivorcePayment(divorceService, person1, person2);
    int divorcePrice =
        service.getRegisterDivorcePaymentFunction().calcDivorcePrice(person1, person2);
    System.out.println(divorcePrice);
    divorceService.showDivorces();
    DivorceService.declineDivorce();
  }
}
