public class Operators {
    public static void main(String[] args) {
        int sum1  = 100 + 50; // 150 (100 + 50)
        int sum2 = sum1 + 250; // 400 (150 + 250)
        int sum3 = sum2 + sum2; // 800 (400 + 400)

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        /**
         * Java divides the operators into the following groups:
         *  - Arithmetic Operators
         *      [ '*' => Multiplication - Multiplies two values e.g. x * y ]
         *      [ '/' => Division - Divides one values by another e.g. x / y]
         *  - Assignment Operators
         *  - Comparison Operators
         *  - Logical Operators
         *  - Bitwise Operators
         * 
         */

        /**
         * ARITHMETICAL OPERATORS
         * They are used to perform mathematical operations.
         * They are grouped into 7:
         * Addition(+), Subtraction(-), Multiplication(*), Division(/), Modulus(%), Increment(++), Decrement(--)
         */

         /**
          * ADDITION(+)
          * Adds together two values e.g. x + y
          */
          int x = 5;
          int y = 2;
          System.out.println("x + y = " + (x + y)); // Prints '7'

          /**
           * SUBTRACTION(-)
           * Subtracts one values from another e.g. x - y
           */
          int a = 5;
          int b = 2;
          System.out.println("a - b = " + (a - b));


    }
}
