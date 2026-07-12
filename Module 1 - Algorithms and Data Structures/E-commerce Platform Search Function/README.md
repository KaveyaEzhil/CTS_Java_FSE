# E-commerce Platform Search Function

This folder contains the implementation and analysis of search algorithms for an e-commerce platform catalog, comparing **Linear Search** and **Binary Search**.

---

## 1. Asymptotic Notation & Search Scenarios

### Big O Notation
**Big O notation** is a mathematical notation used in computer science to describe the upper bound of an algorithm's running time or space requirements in terms of the input size ($n$). 
* It analyzes the execution efficiency by focusing on the growth rate of runtime as $n$ grows to infinity, ignoring constant factors and lower-order terms.
* It helps developers compare different algorithms under worst-case inputs without needing to run benchmark tests on specific hardware.

### Search Scenarios (Best, Average, Worst Case)
* **Best Case:** The target element is found immediately in the first step.
* **Average Case:** The target element is found somewhere in the middle of the search space.
* **Worst Case:** The target element is at the very end of the search space (or does not exist at all), requiring maximum steps.

---

## 2. Algorithm Comparison & Time Complexity

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity | Sorted Required? |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Linear Search** | $O(1)$ | $O(n)$ | $O(n)$ | $O(1)$ | No |
| **Binary Search** | $O(1)$ | $O(\log n)$ | $O(\log n)$ | $O(1)$ | Yes |

### Linear Search Details
* Works by iterating sequentially from the first index to the last.
* If the array has $n$ items, the worst case checks all $n$ items.

### Binary Search Details
* Works by dividing the sorted search interval in half recursively.
* Each comparison reduces the search space by half, resulting in logarithmic growth rate.

---

## 3. Platform Recommendation & Suitability

### Recommendation
For an e-commerce platform, **Binary Search** (or search-optimized indexed structures like Hash Tables/B-Trees) is significantly more suitable than Linear Search.

### Rationale
1. **Catalog Scale:** E-commerce catalogs often scale to thousands or millions of products. 
   - A linear search on 1,000,000 products requires up to 1,000,000 operations.
   - A binary search on 1,000,000 sorted products requires at most $\approx 20$ operations ($2^{20} \approx 1,048,576$).
2. **Performance SLA:** Search is one of the most heavily used features on an e-commerce storefront. Linear search latency scales linearly with catalog size, which degrades user experience. Binary search maintains sub-millisecond lookups even with massive growth in catalog size.
3. **Sorting Overhead:** While binary search requires the array to be sorted, product catalogs are updated (inserted/deleted) far less frequently than they are queried/searched. Thus, sorting or maintaining a sorted array (e.g., during database indexing or batch catalog updates) is a one-time/background cost that pays off significantly by enabling $O(\log n)$ search performance.
