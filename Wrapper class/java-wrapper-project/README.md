# Java Wrapper Project

This project demonstrates various functionalities related to Java wrapper classes, including conversions between primitive and wrapper types, auto-boxing and auto-unboxing, and utility methods for data processing and validation.

## Project Structure

```
java-wrapper-project
├── pom.xml
├── .gitignore
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── wrapper
│   │   │               ├── Main.java
│   │   │               ├── converters
│   │   │               │   ├── PrimitiveConverter.java
│   │   │               │   └── WrapperConverter.java
│   │   │               ├── autoboxing
│   │   │               │   └── AutoBoxingDemo.java
│   │   │               ├── utils
│   │   │               │   └── WrapperUtils.java
│   │   │               └── validation
│   │   │                   └── Validator.java
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── wrapper
│                       ├── PrimitiveConverterTest.java
│                       ├── WrapperUtilsTest.java
│                       └── ValidatorTest.java
```

## Features

- **Primitive and Wrapper Conversions**: Convert between primitive types (e.g., `int`, `double`) and their corresponding wrapper classes (e.g., `Integer`, `Double`).
- **Auto-boxing and Auto-unboxing**: Demonstrate automatic conversion between primitive types and their wrapper classes using collections.
- **Utility Methods**: Provide utility methods for parsing and calculating values using wrapper classes.
- **Input Validation**: Validate user input to ensure it meets specified criteria.

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd java-wrapper-project
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="com.example.wrapper.Main"
   ```

## Usage Examples

- **Convert `int` to `Integer`**:
  ```java
  Integer wrappedInt = PrimitiveConverter.convertIntToInteger(5);
  ```

- **Auto-boxing Example**:
  ```java
  List<Integer> numbers = new ArrayList<>();
  numbers.add(10); // auto-boxing
  int sum = 0;
  for (Integer number : numbers) {
      sum += number; // auto-unboxing
  }
  ```

## Testing

Unit tests are provided for the conversion, utility, and validation classes. To run the tests, use:
```
mvn test
```

## License

This project is licensed under the MIT License.