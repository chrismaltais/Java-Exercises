// Implement .indexOf()
// Return the index of the first occurrence of needle in haystack, 
// or -1 if needle is not part of haystack.
// Return 0 if needle is an empty string

class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        if (needleLength > haystackLength) {
            return -1;
        }
        if (needleLength == 0) {
            return 0;
        }
        int threshold = haystackLength - needleLength;
        for (int i = 0; i <= threshold; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            } else if (i + needleLength > haystackLength) {
                return -1;
            }
        }
        return -1;
    }
}
