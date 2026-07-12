# Exercise 7: Financial Forecasting

This folder implements and analyzes recursive forecasting algorithms for calculating future values based on past growth rates.

---

## 1. Understanding Recursive Algorithms

### Concept of Recursion
**Recursion** is a programming technique where a method calls itself to solve a smaller instance of the same problem. Every recursive method must contain two main parts:
1. **Base Case:** The condition under which the method stops calling itself, returning a direct value (prevents infinite recursion and stack overflow).
2. **Recursive Case:** The logic that breaks the main problem down into a smaller sub-problem and calls the method again.

### Why Recursion Simplifies Problems
Recursion is highly intuitive and simplifies code when a problem has a self-similar or tree-like structure. Examples include:
* Tree/Graph traversals (DOM trees, folder structures).
* Divide-and-conquer algorithms (Merge Sort, Quick Sort).
* Mathematical relations defined recursively (Factorial, Fibonacci, compound interest, Tower of Hanoi).
By using recursion, developers can avoid writing complex, nested loops and explicit stack management code, resulting in cleaner and more readable implementations.

---

## 2. Algorithm Complexity & Analysis

### Time Complexity
* **Standard Linear Recursion:** The method `calculateFutureValue` calls itself exactly $n$ times where $n$ is the number of periods/years. This results in a time complexity of **$O(n)$**.
* **Optimized Logarithmic Recursion (Fast Exponentiation):** The method `calculateFutureValueOptimized` halves the exponent (periods) at each step. This divide-and-conquer approach results in a time complexity of **$O(\log n)$**.
* **Iterative Approach:** Uses a single loop running $n$ times. This results in a time complexity of **$O(n)$**.

### Space Complexity & Stack Overhead
* **Standard Linear Recursion:** Each recursive call adds a stack frame to the JVM call stack. For $n$ periods, it uses **$O(n)$** stack space. If $n$ is extremely large (e.g., $n = 10000$), it can trigger a `StackOverflowError`.
* **Optimized Logarithmic Recursion:** Halving the search space reduces the call stack depth to **$O(\log n)$**, which easily handles large forecasting periods without risking stack overflow.
* **Iterative Approach:** Uses a single loop with constant variables, resulting in **$O(1)$** auxiliary space complexity and zero stack overhead.

---

## 3. How to Optimize Recursive Solutions

To avoid excessive computations and stack overflow errors in Java:
1. **Use Iteration:** For linear recursion problems (like compound interest calculation), transforming the recursive method into an iterative loop eliminates stack overhead entirely ($O(1)$ space).
2. **Fast Exponentiation (Squaring Method):** Reduces the number of recursive calls from $n$ to $\log_2 n$, bringing the complexity down to $O(\log n)$.
3. **Memoization / Dynamic Programming:** For recursive problems with overlapping sub-problems (like Fibonacci or grid pathfinding), caching the results of expensive function calls in a map/array avoids redundant calculations, reducing time complexity from exponential $O(2^n)$ to linear $O(n)$.
