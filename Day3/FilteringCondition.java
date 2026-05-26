// A functional interface is an interface that has only one abstract method, lambdas can be used only with functional interfaces
// The below is a functional interface
@FunctionalInterface
public interface FilteringCondition {
    boolean test(Hotels hotel);
}