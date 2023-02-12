```cpp
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool search(int n, int m, int x, vector<vector<int>> mat){
// write your code here
    int smallest = mat[0][0], largest = mat[n - 1][m - 1];
    if (x < smallest || x > largest)
        return 0;
 
    // set indexes for top right element
    int i = 0, j = m - 1;
    while (i < n && j >= 0) {
        if (mat[i][j] == x) {
            return 1;
        }
        if (mat[i][j] > x)
            j--;
        else
            i++;
    }
    return 0;
}

int main() {
    int n,m , target;
    cin>> n>>m>>target;
vector<vector<int>> vals(n, vector<int>(m,0));
for(int i=0;i<n;i+=1){
    for(int j=0; j<m;j+=1){ 
     cin>>vals[i][j];
     }
}
bool ans= search(n,m, target, vals);
if(ans==0)
cout<<"FALSE";
else
cout<<"TRUE";
return 0;
}

```

Harsh has an M x N array 'MAT' where 'M' denotes the number of rows and 'N' denotes the number of columns. The element of each row are sorted in non-decreasing order.

Also, the last element of each row is smaller than the first element of the next row.

You are given an integer 'TARGET' and you need to check if this exist in 'MAT'.

Input Format
The first line of input contains three space-separated integers M, N and TARGET where M and N denote the number of rows and columns of the MAT, respectively and TARGET is the integer to be found.

From the second line of input, the next N lines represent the rows of the MAT. Every row contains M single space-separated integers.

Output Format
Print TRUE if 'TARGET' is present in the 'MAT', else print FALSE.

Example 1
Input

3 4 9
2 3 4 5
6 7 8 9
10 11 12 13
Output

TRUE
Explanation

The 'TARGET' = 9 exists in the 'MAT' at index (1, 3).

Example 2
Input

3 3 79
2 3 5
7 8 9
10 11 35
Output

FALSE
Explanation

The 'TARGET' = 79 which does not exists in the 'MAT'.

Constraints
1 <= N <= 500

1 <= M <= 500

-10^5 <= MAT[i], TARGET <= 10^5