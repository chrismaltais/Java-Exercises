// Write a program that outputs the string representation of numbers from 1 to n.
// But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
// For numbers which are multiples of both three and five output “FizzBuzz”.

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> sol = new ArrayList<String>();
        for (int i = 1; i <= n; i++){
            if (i % 15 == 0) {
                sol.add("FizzBuzz");
            } else if (i % 3 == 0) {
                sol.add("Fizz");
            } else if (i % 5 == 0) {
                sol.add("Buzz");
            } else
                sol.add(Integer.toString(i));
        }
        return sol;
    }
}