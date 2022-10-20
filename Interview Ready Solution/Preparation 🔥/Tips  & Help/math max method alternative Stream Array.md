```java
      // find min, max, sum etc value into stream array. and return it.
        // if not find then its return if not then its assign max value.
        // in min found case we need to min() method and Integer.MIN_VALUE;
        int max = Arrays.stream(candies).max().orElse(Integer.MAX_VALUE);

```