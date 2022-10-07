
class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        
                // two pointer method to reverse every row.
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
         }
               // transpose matrix.
        
        for(int i=0; i<matrix.length;  i++){
            for(int j=i; j<matrix[0].length; j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}




// theory 


Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

Example 1:

Input:
N = 3 
matrix[][] = {{1, 2, 3},
              {4, 5, 6}
              {7, 8, 9}}
Output: 
Rotated Matrix:
3 6 9
2 5 8
1 4 7
Example 2:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output: 
Rotated Matrix:
2 4
1 3

Your Task:
You dont need to read input or print anything. Complete the function rotateby90() which takes the matrix as input parameter and rotates it by 90 degrees in anti-clockwise direction without using any extra space. You have to modify the input matrix in-place. 

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 100
1 <= matrix[][] <= 1000

