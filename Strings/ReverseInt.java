// Given a 32-bit signed integer, reverse digits of an integer.

class Solution {
    public int reverse(int x) {
        int result = 0;
        int newResult = 0;
        while (x != 0) {
            int tail = x % 10;
            newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return newResult;
    }
}
