# Readme for Exercise: Phone Interface Example

## 📄 Description

### Exercise 1: Phone Interface Example

For this exercise, you need to create an interface called `Phone` and three classes: `Smartphone`, `Generic`, and `Main`.

- The `Phone` interface should have a method named `phonecall()`.
- The `Smartphone` class should implement the `Phone` interface, and in addition to implementing the `phonecall()` method, it should also have a method called `takePhoto()`.
- The `Generic` class should have two Generic methods:
  - The first method should accept an argument of a type restricted to the `Phone` interface.
  - The second method should accept an argument of a type restricted to the `Smartphone` class.
  
From these two methods in the `Generic` class, call the appropriate methods from `Phone` and `Smartphone`. In the `main()` method of the `Main` class, pass an object of the `Smartphone` class to both of the Generic methods of the `Generic` class.

**Question:** Can the method limited to the `Phone` interface call the `takePhoto()` method?

### Requirements
- Create the `Phone` interface with a method `phonecall()`.
- Create the `Smartphone` class that implements the `Phone` interface and adds a method `takePhoto()`.
- Create the `Generic` class with two Generic methods that handle arguments restricted to `Phone` and `Smartphone`.
- In the `main()` method of the `Main` class, create a `Smartphone` object and pass it to both methods of the `Generic` class.

### Answer to the question:
No, the method limited to the `Phone` interface cannot directly call the `takePhoto()` method because it is not part of the `Phone` interface. The method limited to the `Phone` type can only access the methods defined in the `Phone` interface, which in this case is just `phonecall()`.

## 💻 Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Interfaces
- Generics

## 📋 Requirements
- JDK 8 or higher
- A development environment such as IntelliJ IDEA, Eclipse, or VS Code with Java support
