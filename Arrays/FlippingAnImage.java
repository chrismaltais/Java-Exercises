// Given a binary matrix A, we want to flip the image horizontally,
// then invert it, and return the resulting image.
// To flip an image horizontally means that each row of the image is reversed.
// For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
// For example, inverting [0, 1, 1] results in [1, 0, 0].

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int min = 0;
            int max = A[i].length - 1;
            while (min <= max) {
                if (A[i][min] == A[i][max]) {
                    int temp = A[i][min] ^ 1;
                    A[i][min] = A[i][max] ^ 1;
                    A[i][max] = temp;
                }
                min++;
                max--;
            }
        }
        return A;
    }
}
