# Coffee Ordering System - Decorator Pattern

## Introduction
This project implements a Coffee Ordering System using the Decorator Pattern in Java. The system allows dynamic customization of beverages by adding condiments (e.g., Mocha, Whip, Soy, Milk) without modifying the existing code, making it highly flexible and maintainable.

## Features
- Multiple base beverages: Espresso, Dark Roast, House Blend, Decaf.
- Condiments that can be dynamically added: Mocha, Whip, Soy, Milk.
- Uses the Decorator Pattern for extending functionality without subclass explosion.
- Follows Open-Closed Principle (OCP) for easier scalability.

## Technologies Used
- Java
- Object-Oriented Programming (OOP) Principles
- Design Patterns (Decorator Pattern)

## Installation and Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/bsse23-060/coffee-ordering-system
   ```
2. Navigate to the project directory:
   ```sh
   cd coffee-ordering-system
   ```
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the program:
   ```sh
   java StarbuzzCoffee
   ```

## Example Usage
### Sample Output
```
ESPRESSO £2.25
ROASTED DARK COFFEE, +MOCHA, +MOCHA, +WHIP £2.45
HOUSE-BLEND COFFEE, +SOY, +MOCHA, +WHIP £1.45
```

## Design Pattern Overview
### Decorator Pattern
The Decorator Pattern is used to dynamically add new functionalities to objects without modifying their structure. This is achieved by wrapping objects inside decorator classes.

### Class Structure
- `Beverage` (Abstract Base Class) - Represents different types of beverages.
- `CondimentDecorator` (Abstract Decorator) - Extends `Beverage` and wraps another `Beverage` instance.
- `Concrete Beverages` (Espresso, HouseBlend, DarkRoast, Decaf) - Specific coffee types.
- `Concrete Decorators` (Mocha, Whip, Soy, Milk) - Add condiments dynamically.

## Contribution
Contributions are welcome! If you find any issues or have feature requests, feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License. Feel free to modify and use it for educational or commercial purposes.
