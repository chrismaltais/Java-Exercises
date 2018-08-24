// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
// Solving with HashMaps is slow AF (indexing a HashMap is wack!)
// Solving with Arrays is second alternative to indexOf way

class Solution {
    public int firstUniqChar(String s) {
        int earliestIndexOfUniqueLetter = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
            int indexOfUniqueLetter = s.indexOf(c);
            if (indexOfUniqueLetter == -1) continue;
            if (indexOfUniqueLetter == s.lastIndexOf(c)) {
                earliestIndexOfUniqueLetter = Math.min(indexOfUniqueLetter, earliestIndexOfUniqueLetter);
            }
        }
        if (earliestIndexOfUniqueLetter == s.length()) {
            return -1;
        }
        return earliestIndexOfUniqueLetter;
    }
}
