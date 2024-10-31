# Explain and explore Encapsulation, Abstraction, Inheritance and Polymorphism

## Group
- Jose (Encapsulation)
- Mustan (Abstraction)
- Serghei (Inheritance)
- Lucas (Polymorphism)

## Encapsulation

Encapsulation in software development is a principle that bundles data (variables) and methods (functions) that operate on that data into a single unit, usually called an object. This approach hides the internal workings of an object from the outside, only allowing access to the data through specified methods. By controlling access like this, encapsulation helps prevent unintended interference, promotes modularity, and makes code easier to maintain and debug. Essentially, it creates a protective layer around data and functions to ensure they’re used correctly.

## Abstraction

Abstraction is about simplifying complex systems by focusing on the essential features while hiding unnecessary details. In software, it means creating a clear interface that allows users to interact with a system without needing to understand its inner workings. For example, when using a function to send a message, you don't need to know the underlying code handling network connections – just the inputs and outputs. Abstraction helps in managing complexity, making code more readable and reducing the chances of errors by minimizing what developers need to keep in mind.

## Inheritance

Inheritance is a concept in object-oriented programming that allows a class (known as a *child* or *subclass*) to inherit properties and behaviors (methods) from another class (known as a *parent* or *superclass*). This lets you create a new class based on an existing one, reusing code without rewriting it. For example, if you have a general `Vehicle` class, you can create a `Car` subclass that inherits features from `Vehicle` but also adds unique characteristics. Inheritance promotes code reuse, hierarchy organization, and can make complex systems easier to manage by grouping shared functionality.

## Polymorphism

Polymorphism is the ability of different classes to be treated as instances of the same class through a shared interface, often allowing methods to have different behaviors based on the object calling them. In simpler terms, polymorphism lets you use the same function or method in different contexts with different types of objects. For example, if you have a method `makeSound()` in an `Animal` class, each subclass (`Dog`, `Cat`, `Bird`) can implement `makeSound()` differently to produce sounds specific to that animal. Polymorphism makes code more flexible and extensible, allowing you to build systems that can work with different types of objects seamlessly.