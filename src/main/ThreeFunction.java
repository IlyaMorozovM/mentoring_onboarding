package main;

@FunctionalInterface
public interface ThreeFunction<R, T, U, A> {
  R apply(T t, U u, A a);
}
