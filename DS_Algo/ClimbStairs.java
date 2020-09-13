/**
 * @type of n: integer
 * @return type: integer
 */
class Solution {
    public int climbStairs(int n) {
    	// write your awesome code here  
        if(n == 0 || n == 1 || n==2) {
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}