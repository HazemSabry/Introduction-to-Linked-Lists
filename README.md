# Polynomial Calculator with Linked Lists

This is a Java assignment that implements a polynomial calculator using linked lists. The assignment requires two implementations, one using a singly linked list (SingleLinkedList) and another using a doubly linked list (DoubleLinkedList). The assignment also introduces the concept of Abstract Data Types (ADTs) and demonstrates an application for linked lists.

## Problem Statement

The assignment defines an interface called `ILinkedList`, which specifies the following methods for a linked list:

- `add(int index, Object element)`: Inserts an element at a specified position in the list.
- `add(Object element)`: Inserts an element at the end of the list.
- `get(int index)`: Returns the element at a specified position in the list.
- `set(int index, Object element)`: Replaces the element at a specified position in the list.
- `clear()`: Removes all elements from the list.
- `isEmpty()`: Returns true if the list contains no elements.
- `remove(int index)`: Removes the element at the specified position in the list.
- `size()`: Returns the number of elements in the list.
- `sublist(int fromIndex, int toIndex)`: Returns a view of the portion of the list between the specified `fromIndex` and `toIndex`, inclusively.
- `contains(Object o)`: Returns true if the list contains an element with the same value as the specified element.

## Application

The main part of the assignment is to design a linked allocation system for representing and manipulating polynomials using the linked list implementations. Each term of the polynomial is represented as a node with a coefficient and an exponent. The polynomial terms are ordered in descending order by exponent.

The application provides a user-friendly, menu-driven system that allows the following operations:

- Read in a polynomial and store it in variables A, B, or C.
- Output a polynomial using a clear and human-readable format.
- Add two polynomials and store the result in R.
- Subtract two polynomials and store the result in R.
- Multiply two polynomials and store the result in R.
- Evaluate a polynomial at a specific value and display the result.
- Clear a polynomial, making it unavailable for further operations.

The core of the application implements the `IPolynomialSolver` interface, which defines the following methods:

- `setPolynomial(char poly, int[][] terms)`: Set polynomial terms (coefficients and exponents).
- `print(char poly)`: Print the polynomial in a human-readable format.
- `clearPolynomial(char poly)`: Clear a polynomial.
- `evaluatePolynomial(char poly, float value)`: Evaluate the polynomial for a given constant value.
- `add(char poly1, char poly2)`: Add two polynomials and return the result.
- `subtract(char poly1, char poly2)`: Subtract two polynomials and return the result.
- `multiply(char poly1, char poly2)`: Multiply two polynomials and return the result.

## Deliverables

- The assignment should be implemented in Java.
- Group work is required with two team members.
- Ensure that you follow the provided interfaces and complete implementations in both `SingleLinkedList` and `DoubleLinkedList`.
- Document your code well for readability and reusability.
- Check your code against Java coding style standards using tools like Checkstyle.
- Push your code to the repository.
- Late submissions are accepted within one week.
- Avoid delivering copied or plagiarized code.

**Note:** Ensure that you follow your institution's guidelines regarding academic integrity and proper code attribution.

This README serves as a brief overview of the assignment requirements. Please follow any additional guidelines or specifications provided by your instructor or institution for the assignment.
