```java
private static int reverse(int n) {
        int add = 0;
        for (int i = n; i != 0; i /= 10) {
            add = add * 10 + (i % 10);
        }
        return add;
    }

```
