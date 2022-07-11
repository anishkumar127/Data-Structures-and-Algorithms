https://www.hackerrank.com/challenges/three-month-preparation-kit-array-left-rotation/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-four

```
    public static List<Integer> rotateLeft(int k, List<Integer> arr) {
    // Write your code here
    int n = arr.size();
     k = k%n;
        reverse(arr, 0, k - 1); // 2 1 3 4 5
        reverse(arr, k, n-1); // 2 1 5 4 3
        reverse(arr, 0, n - 1); // 3 4 5 1 2
        return arr;
    }
static List<Integer> reverse(List<Integer> arr, Integer s, Integer e) {
        while (s<e){
          Integer temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
        return arr;
    }
}
```