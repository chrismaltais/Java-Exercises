// Decoding a Huffman String (Google Huffman Tree for more info)
// You are given pointer to the root of the Huffman tree and a binary coded string to decode. 
// You need to print the decoded string.
// EX) S = "1001011"
// -> ABACA


void decode(String S ,Node root) {
    StringBuilder sb = new StringBuilder();
    Node head = root;
    for (int i = 0; i < S.length(); i++) {
        head = S.charAt(i) == '1' ? head.right : head.left;
        if (head.right == null && head.left == null) {
            sb.append(head.data);
            head = root;
        }
    }
    System.out.print(sb);
}