# Array Problems
Explanations/Tricks of each problem to come.

## Max Sub-Array Problems
- BuyAndSellStock1.java

__Kadane's Algorithm!__

Max subarray will either be a subset, M, of previous contiguous values AND current value OR current value.

Keep track of the highest subarray you encounter with `globalMax`

```java
public int maxSubArray(int[] arr) {
  int currMax = arr[0];
  int globalMax = arr[0];
  for (int i = 1; i < arr.length; i++) {
    currMax = Math.max(arr[i], currMax + arr[i]);
    globalMax = Math.max(currMax, globalMax);
  }
  return globalMax;
}
```
