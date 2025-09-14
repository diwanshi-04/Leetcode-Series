class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }
        int first_num = 0;
        int second_num= 1;
        int third_num = 1;
        for(int i=3; i<=n; i++){
            int fourth_num = first_num + second_num + third_num;
            first_num = second_num;
            second_num = third_num;
            third_num = fourth_num;
        }
           return third_num;
    }
}




/*

The Tribonacci sequence Tn is defined as follows: 
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.

Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

Example 2:
Input: n = 25
Output: 1389537
 

Constraints:
0 <= n <= 37

*/
