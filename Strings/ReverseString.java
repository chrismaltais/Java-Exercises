// Write a function that takes a string as input and returns the string reversed.
// StringBuilder creates a reziable array of all the strings (think of a sentence), 
// copying them back only when necessary.

public class ReverseString {
	public String reverseString(String s) {
    		if (s == null){
        	return null;
    		}
		// StringBuilder(s) turns the string into a resizable array of characters
   		return new StringBuilder(s).reverse().toString(); 
	}
}
