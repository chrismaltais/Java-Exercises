// Related to question Excel Sheet Column Title
// Given a column title as appear in an Excel sheet, return its corresponding column number.
// For example:
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 


class Solution {
    public int titleToNumber(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            // s.charAt(i) - 'A' gives you the difference of ascii keys
            total = total * 26 + (s.charAt(i) - 'A' + 1);
        }
        return total;
    }
}