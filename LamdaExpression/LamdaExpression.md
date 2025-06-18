# Lambda Expressions Notes

## Introduction
Lambda expressions were introduced in Java 8 and are a key feature that supports functional programming. They enable writing concise, functional-style code in Java.

## Key Characteristics
- **Anonymous**: Lambda expressions do not have a name.
- **Functional Interface Support**: Used with interfaces having a single abstract method (e.g., `Runnable`, `Callable`).
- **Concise**: Requires less boilerplate compared to traditional functions.

## Syntax
```java
(parameter_list) -> { expression_body }
```
Examples:
```java
// A simple lambda to add two numbers
(int a, int b) -> a + b;

// Lambda with multiple lines
(int a, int b) -> {
    int sum = a + b;
    return sum;
};
```
Without parameters:
```java
() -> System.out.println("Hello, World!");
```
Single parameter:
```java
name -> System.out.println("Hello, " + name);
```

## Functional Interfaces
Lambda expressions are compatible with functional interfaces, such as:
- **`java.util.function` Package**: Includes interfaces like `Predicate`, `Function`, `Consumer`, and `Supplier`.
- **Custom Functional Interfaces**: You can create your own using the `@FunctionalInterface` annotation.

Example:
```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Greeting greeting = name -> System.out.println("Hello, " + name);
        greeting.sayHello("Veer");
    }
}
```

## Use Cases
1. **Sorting Collections**:
```java
List<String> names = Arrays.asList("Veer", "Krishna", "Rajendra");
Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));
System.out.println(names);
```
2. **Iterating Over Collections**:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.forEach(n -> System.out.println(n));
```
3. **Filtering and Mapping**:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
numbers.stream().map(n -> n * 2).forEach(System.out::println);
```
4. **Event Handling**:
```java
button.setOnAction(e -> System.out.println("Button clicked!"));
```

## Advantages
- **Compact Syntax**: Reduces verbosity.
- **Improved Readability**: Expresses intent directly.
- **Enhanced API Support**: Works seamlessly with Java Streams and Collections.

## Limitations
- **Debugging Difficulty**: No name, harder to track in stack traces.
- **Readability Issues**: Overuse can make code complex.
- **Type Inference Constraints**: Requires clarity in context.

## Best Practices
- Use descriptive names for clarity.
- Combine with Streams for concise, functional code.
- Limit complexity to maintain readability.

## Comparisons
| Feature                     | Anonymous Class           | Lambda Expression         |
|-----------------------------|---------------------------|---------------------------|
| Requires Name               | Yes                       | No                        |
| Multi-line Support          | Yes                       | Limited (Concise body)    |
| Reusability                 | High                      | Low                       |
| Debugging                   | Easier                    | Harder                    |

## Conclusion
Lambda expressions in Java 8 have revolutionized the way developers write concise and expressive code. Their integration with Streams API and functional interfaces makes them indispensable for modern Java programming.
