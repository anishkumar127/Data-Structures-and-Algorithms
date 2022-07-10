``Two pointers``
```
 public int removeDuplicates(int[] nums) {
     if (nums == null || nums.length == 0) return 0;
            int i = 1, j = 0;
            while (i < nums.length) {
                if (nums[i] > nums[j]) {
                    nums[++j] = nums[i];
                }
                i++;
            }
            return j+1;
        }
```

```
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
    for (int n : nums)
        if (i == 0 || n > nums[i-1])
            nums[i++] = n;
    return i;
    }
}
```
```
public class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int dupes = 0;
        
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
                dupes++;
            
            nums[i - dupes] = nums[i];
        }
        
        return nums.length - dupes;
    }
}
```

* Using 2 pointers.
 *
 * Time Complexity: O(N)
 *
 * Space Complexity: O(1)
 *
 * N = Length of input array.

```
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input is invalid");
        }

        int len = nums.length;
        if (len <= 1) {
            return len;
        }

        int insertPos = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[insertPos]) {
                nums[++insertPos] = nums[i];
            }
        }

        return insertPos + 1;
    }
}

```
