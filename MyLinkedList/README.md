# Linked List Interfaces for Singly and Doubly Linked Lists

This Java code provides interfaces for singly linked lists (`ILinkedList`) and doubly linked lists (`IDLinkedList`). These interfaces define the methods and operations supported by these two types of linked lists.

## Table of Contents

- [Introduction](#introduction)
- [Interfaces](#interfaces)
- [Supported Operations](#supported-operations)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This code defines two interfaces, one for singly linked lists (`ILinkedList`) and the other for doubly linked lists (`IDLinkedList`). These interfaces act as a blueprint for implementing linked list data structures. By implementing these interfaces, you can create your own custom singly or doubly linked list classes with the specified methods.

## Interfaces

### ILinkedList Interface

- `add(int index, DataType element)`: Insert a specified element at the specified position in the list.
- `add(DataType element)`: Insert the specified element at the end of the list.
- `get(int index)`: Retrieve the element at the specified position in this list.
- `set(int index, DataType element)`: Replace the element at the specified position in this list with the specified element.
- `clear()`: Remove all of the elements from this list.
- `isEmpty()`: Check if this list contains no elements.
- `remove(int index)`: Remove the element at the specified position in this list.
- `size()`: Return the number of elements in this list.
- `sublist(int fromIndex, int toIndex)`: Return a view of the portion of this list between the specified `fromIndex` and `toIndex`, inclusively.
- `contains(DataType o)`: Check if this list contains an element with the same value as the specified element.

### IDLinkedList Interface

This interface extends the `ILinkedList` interface and adds no additional methods. It inherits all the methods from the `ILinkedList` interface and is meant for use with doubly linked lists.

## Supported Operations

Both interfaces define a common set of operations for linked lists, including adding, removing, and accessing elements, checking for emptiness, and creating sublists. These methods can be implemented in custom linked list classes based on the specific requirements.

## Getting Started

To use these interfaces, you can create your own custom linked list classes by implementing either the `ILinkedList` or `IDLinkedList` interface, depending on whether you need a singly or doubly linked list.

1. Create a new Java class for your linked list.
2. Implement the corresponding interface (`ILinkedList` for singly linked lists or `IDLinkedList` for doubly linked lists).
3. Implement the required methods based on your specific linked list type.
4. Use your custom linked list class to perform various linked list operations.

## Contributing

If you find any issues or would like to contribute to the development of these interfaces, please feel free to fork the repository, make improvements, and submit a pull request. Your contributions are welcome!

## License

This code is open-source and available under the [MIT License](LICENSE). You are free to use, modify, and distribute it as needed.

---

Feel free to customize the README with additional information or explanations about the purpose and usage of these interfaces.
