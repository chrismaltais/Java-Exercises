// Given two lists Aand B, and B is an anagram of A. 
// B is an anagram of A means B is made by randomizing the order of the elements in A.
// Find an index mapping P, from A to B. 
// A mapping P[i] = j means the ith element in A appears in B at index j.
// Lists A and B may contain duplicates. 
// If there are multiple answers, output any of them.


class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] P = new int[A.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }
        
        int i = 0;
        for (int num : A) {
            P[i++] = map.get(num);
        }
        
        return P;
    }
}