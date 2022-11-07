```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      int search = 4;
      int secondSearch = 45;
      System.out.println(Arrays.binarySearch(arr,search)); // 3 index.
      
      // define self stating and ending index;
      int startIndex = 1;
      int endIndex = 5;
      
      System.out.println(Arrays.binarySearch(arr,startIndex,endIndex,search)); // 3rd index.
      
      
      // System.out.print(Arrays.binarySearch(arr,secondSearch)); // -7 index.
      
      
      
      // more example.
      /*
      But if not found, the output will be equal to the value of (-(insertion point) - 1). Here, based on the search key, the insertion point can have different values.

Assume we have an array [5, 6, 7, 8, 9, 10] and a search key 0 which is clearly not in the array. In this case, the search key is smaller than all the elements of the array. But the first element that is larger than the search key is 5. So in this case the insertion point will be:

(-(the index of the first element larger than the search key) - 1) = (0 - 1) = -1
      */
      int numbers[] = {5, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.binarySearch(numbers, 0)); // -1
		
		
		// more example
		/*
		Again assume we have an array [5, 6, 7, 8, 9, 10] and a search key 12 which is clearly not in the array. In this case, the search key is larger than all the elements of the array. So in this case the insertion point will be:

(-(the ending index (-(6) - 1) = (-6 - 1) = -7
Remember, when you don't define an ending index manually, the method uses the length of the array as the ending index which in this case is 6.
		*/
		
		
		int numbers1[] = {5, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.binarySearch(numbers1, 12)); // -7
		
		
		
		// more example
		// However, the results will change if you define the starting and ending indices manually as follows:


		int numbers[] = {5, 6, 7, 8, 9, 10};
		
		int startIndex = 1;
		int endIndex = 3;
		
		System.out.println(Arrays.binarySearch(numbers, startIndex, endIndex, 5)); // -2
		System.out.println(Arrays.binarySearch(numbers, startIndex, endIndex, 10)); // -4


// Try calculating the values by yourself. You can also use the Arrays.binarySearch() method with characters like this:


		char vowels[] = {'a', 'e', 'i', 'o', 'u'};
		
		char key = 'i';
		int startIndex = 2;
		int endIndex = 4;
		
		System.out.println(Arrays.binarySearch(vowels, startIndex, endIndex, key));

// The same principles apply in this case when the given search key is not found. But when comparing between a character in the array and a given search key, the ASCII code of the corresponding character will be used. So A (65) will be smaller than a (97). Keep this in mind when cross checking outputs from your program.
		
		
	
		
  }
}

```