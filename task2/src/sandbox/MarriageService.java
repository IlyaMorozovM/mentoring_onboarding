package sandbox;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MarriageService {

  public Supplier<Person> getFindSpouseFunction() {
    return () -> new Person("name", 100);
  }

  public BiConsumer<Person, Person> getMarriageFunction() {
    return (person, person2) ->
        System.out.println(
            String.format(
                "Your Persons: %s and %s got married!", person.getName(), person2.getName()));
  }

  public Function<Person, Person> getFindSpouseByPersonFunction() {
    return customer -> {
      System.out.println(
          String.format("We have chosen the best, according to %s nature", customer));
      return new Person("name", 100);
    };
  }

  public Predicate<Person> geFilterCandidateFunction() {
    return person -> person.getAge() > 20;
  }

  public void registerDivorcePayment(DivorceService divorceService, Person p1, Person p2) {
    divorceService.calcDivorcePrice(p1, p2);
  }

  public DivorceService getRegisterDivorcePaymentFunction() {
    return (p1, p2) -> p1.getAge() + p2.getAge();
  }
}
