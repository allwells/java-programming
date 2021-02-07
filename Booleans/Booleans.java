public class Booleans {
    public static void main(String[] args) {
        /**
         * BOOLEANS
         * Often in programming you'll need a data type that can have one of two values, like:
         * - YES/NO
         * - ON/OFF
         * - TRUE/FALSE
         * In this case, Java has a boolean data type which takes either 'true' or 'false' as its value
         * A boolean type is declared with thr 'boolean' keyword and can take the values "true" or 
         * Example
         */
        boolean youAreSmart = true;
        boolean youAreDumb = false;
        System.out.println("youAreSmart: " + youAreSmart + "\nyouAreDumb: " + youAreDumb);
        // Output: youAreSmart: true
        //         youAreDumb: false
        // Can you see what i did with the new line(\n) escape character


        // BOOLEAN EXPRESSION
        // A boolean expression is a Java expression that returns a Boolean value: true or false
        // You can use Comparison and Logical Operators to evalute an expression.
        // Example
        int x = 6;
        int y = 4;
        System.out.println((x > y) && (y < x)); // Outputs 'true'
        // The Boolean value of an expression is the basis for all Java comparisons and conditions.
        // You will learn more about conditions in the next chapter.
    }
}
