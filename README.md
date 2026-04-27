# Sorting and Searching Algorithm Analysis System

## 1. Project Overview
This project focuses on the implementation and performance analysis of fundamental sorting and searching algorithms. The objective is to demonstrate the practical application of Big-O notation by measuring execution time across various dataset sizes (10, 100, 1000 elements) using Java.

## 2. Algorithm Selection
To provide a comprehensive analysis, the following algorithms were selected from the required categories:

* **Basic Sorting (Category A):** Insertion Sort
* **Advanced Sorting (Category B):** Merge Sort
* **Searching (Category C):** Binary Search

## 3. Algorithm Descriptions and Complexity

### Insertion Sort
* **Mechanism:** Builds a sorted array one element at a time by comparing and inserting each new element into its proper position.
* **Worst-case Complexity:** $O(n^2)$.
* **Characteristics:** Simple to implement but inefficient for large datasets.

### Merge Sort
* **Mechanism:** A Divide and Conquer algorithm that recursively splits the array into halves, sorts them, and merges them back together.
* **Complexity:** $O(n \log n)$ for all cases.
* **Efficiency:** Highly performant for large-scale data.

### Binary Search
* **Mechanism:** Efficiently locates a target value within a sorted array by repeatedly halving the search interval.
* **Complexity:** $O(\log n)$.
* **Requirement:** The input array must be sorted beforehand.

## 4. Experimental Results
The experiments were conducted using `System.nanoTime()` to measure execution efficiency.

| Dataset Size | Insertion Sort (ns) | Merge Sort (ns) | Binary Search (ns) |
| :--- | :--- | :--- | :--- |
| **Small (10)** | 5,300 ns | 20,300 ns | 1,800 ns |
| **Medium (100)** | 114,900 ns | 89,300 ns | 1,200 ns |
| **Large (1000)** | 3,033,100 ns | 528,500 ns | 1,700 ns |

## 5. Performance Analysis
* **Algorithm Efficiency:** In the small dataset (Size 10), Insertion Sort actually performed faster than Merge Sort due to the lower
