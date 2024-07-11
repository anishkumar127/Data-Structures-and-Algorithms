## me

```python
class Solution:

    def findMin(self, nums: List[int]) -> int:

        return min(nums)
```


## me

```python
class Solution:

    def findMin(self, nums: List[int]) -> int:

        if len(nums) == 0:

            return -1

        if len(nums) == 1:

           return nums[0]

  

        low = 0

        high = len(nums) - 1

        while low < high:

            mid = int(low + (high - low) / 2)

            if nums[mid] < nums[high]:

                high = mid

            elif nums[mid]>nums[high] :

                low = mid + 1

            elif nums[mid] == nums[high]:

                high = high -1

        return nums[high]
```

