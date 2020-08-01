// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/

/*

	Approach 2: Regex  Intuition  Hey, if we want to do pattern matching, why don't we use Regular Expression (Regex)?
	 Regex is a great way to match a given pattern to a string.  Algorithm  The pattern of case 1 in regex is  [ A − Z ] ∗ [A−Z]∗, 
	 where  [ A − Z ] [A−Z] matches one char from 'A' to 'Z',  ∗ ∗ represents repeat the pattern before it at least 0 times. Therefore, 
	 this pattern represents "All capital".  The pattern of case 2 in regex is  [ a − z ] ∗ [a−z]∗, where similarly,  
	 [ a − z ] [a−z] matches one char from 'a' to 'z'. Therefore, this pattern represents "All not capital".  
	 Similarly, the pattern of case 3 in regex is  [ A − Z ] [ a − z ] ∗ [A−Z][a−z]∗.  Take these three pattern together, 
	 we have  [ A − Z ] ∗ ∣ [ a − z ] ∗ ∣ [ A − Z ] [ a − z ] ∗ [A−Z]∗∣[a−z]∗∣[A−Z][a−z]∗, where "|" represents "or".  
	 Still, we can combine case 2 and case 3, and we get  . [ a − z ] ∗ .[a−z]∗, where "." can matches any char.  
	 Therefore, the final pattern is  [ A − Z ] ∗ ∣ . [ a − z ] ∗ [A−Z]∗∣.[a−z]∗.

*/

class Solution {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|.[a-z]*");
    }
}