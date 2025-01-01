# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java programming error: the `ArrayIndexOutOfBoundsException`.  The `bug.java` file contains code that attempts to access an array element beyond its valid index range. The `bugSolution.java` file provides a corrected version.

## Bug Description
The bug arises from an attempt to access an array element using an index that is out of bounds for the array. Java arrays are zero-indexed, meaning the first element is at index 0, the second at index 1, and so on. Attempting to access an element with an index greater than or equal to the array's length throws this exception.

## How to Reproduce
1. Compile and run `bug.java`. Observe the `ArrayIndexOutOfBoundsException`. 
2. Compile and run `bugSolution.java` to see the corrected code. 

## Solution
The solution involves carefully checking array indices to ensure they remain within the bounds of 0 to array.length - 1.  Proper input validation and bounds checking are crucial for preventing this exception.