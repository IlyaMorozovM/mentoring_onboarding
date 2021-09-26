package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarriageFunctionService {

  public ThreeFunction<Void, Person, Person, Person> getRegisterMarriageFunction() {
    return (person, person2, child) -> {
      System.out.println(String.format("Registered: %s, %s, child: %s", person, person2, child));
      return null;
    };
  }

  public ThreeFunction<List<String>, Person, Person, Person> getFormPersonInfoFunction() {
    return (person, person2, person3) ->
        Stream.of(person, person2, person3)
            .map(p -> p.getName() + p.getAge())
            .collect(Collectors.toList());
  }
}
