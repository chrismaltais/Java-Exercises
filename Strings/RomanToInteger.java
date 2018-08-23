// https://leetcode.com/problems/roman-to-integer/description/

class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0 || s == null) return 0;
        int total = 0;
        int lastSeen = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int current = map.get(c);
            if (current < lastSeen) {
                 total -= current;
            } else {
                total += current;
            }
            lastSeen = current;
        }
        return total;
    }
}
