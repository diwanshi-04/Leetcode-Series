/*JAVA CODE*/
class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen = new boolean[26];
        int distinct = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!seen[ch - 'a']){
                seen[ch - 'a'] = true;
                distinct++;
            }

            int len = i + 1;
            if(distinct == len % 3){
                count++;
            }
        }
        return count;
    }

/*
You are given a string s consisting only of lowercase English letters.

A prefix of s is called a residue if the number of distinct characters in the prefix is equal to len(prefix) % 3.

Return the count of residue prefixes in s.

A prefix of a string is a non-empty substring that starts from the beginning of the string and extends to any point within it.
 

Example 1:

Input: s = "abc"

Output: 2

Explanation:​​​​​​​

Prefix "a" has 1 distinct character and length modulo 3 is 1, so it is a residue.
Prefix "ab" has 2 distinct characters and length modulo 3 is 2, so it is a residue.
Prefix "abc" does not satisfy the condition. Thus, the answer is 2.
Example 2:

Input: s = "dd"

Output: 1

Explanation:

Prefix "d" has 1 distinct character and length modulo 3 is 1, so it is a residue.
Prefix "dd" has 1 distinct character but length modulo 3 is 2, so it is not a residue. Thus, the answer is 1.
*/
