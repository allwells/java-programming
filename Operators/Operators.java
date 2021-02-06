/**
 * @author Allwell Onen
 * @since 2nd February, 2021
 */

public class Operators {
    public static void main(String[] args) {
        /**
         * Java divides the operators into the following groups:
         *  - Arithmetic Operators
         *  - Assignment Operators
         *  - Comparison Operators
         *  - Logical Operators
         *  - Bitwise Operators
         * 
         */

        /**
         * ARITHMETICAL OPERATORS
         * They are used to perform common mathematical operations.
         * There are 7 arithmetical operators in Java:
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
                    System.out.println("a - b = " + (a - b)); // Prints '3'

                    /**
                     * MULTIPLICATION(*)
                     * Multiplies two values e.g. x * y
                     */
                    int c = 5;
                    int d = 2;
                    System.out.println("c * d = " + (c * d)); // Prints '10'

                    /**
                     * DIVISION(/)
                     * Divides one value by another
                     */
                    double e = 5;
                    double f = 2;
                    System.out.println("e / f = " + (e / f)); // Prints '2.5'
                    
                    /**
                     * MODULUS(%)
                     * Modulus returns the remainder after division e.g. x % y
                     */
                    int g = 5;
                    int h = 2;
                    System.out.println("g % h = " + (g % h)); // Prints '1'

                    /**
                     * INCREMENT(++)
                     * Increases a value by 1 e.g. ++x
                     */
                    int i = 5;
                    System.out.println("++i = "+ ++i); // Prints '6'

                    /**
                     * DECREAMENT(--)
                     * Decreament a value by 1 e.g. --x
                     */
                    int j = 5;
                    System.out.println("--j = " + --j); //Prints '4'
                    

        /**
         * ASSIGNMENT OPERATORS
         * They are used to are used to assign values to variables.
         * There are 11 assignment operators in java:
         * =, +=, -=, *=, /=, %=, &=, |=, ^=, >>= and <<=
         */

                    /**
                     * The assignment operator(=) assigns values to variables.
                     * e.g. int x = 10;
                     */

                    /**
                     * The assignment operator(+=) adds value to a variable.
                     * e.g. x = 2; 
                     *     'x += 10;' is the same as 'x = x + 10'
                     * This will add the value of 10 to x; and 'x' now becomes '12'
                     */


                    /**
                     * The assignment operator(-=) subtracts value from a variable.
                     * e.g. x = 2; 
                     *     'x -= 1;' is the same as 'x = x - 1'
                     * This will subtracts the value of 1 from x; and 'x' now becomes '1'
                     */


                    /**
                     * The assignment operator(*=) multiplies the value of a variable.
                     * e.g. x = 2; 
                     *     This, 'x *= 10;' is the same as 'x = x * 10'
                     * This will multiply x by 10; and 'x' now becomes '20'
                     */
                    

                    /**
                     * The assignment operator(/=) divides value of a variable.
                     * e.g. x = 6; 
                     *     This, 'x /= 2;' is the same as 'x = x / 2'
                     * This will divides x by 2; and 'x' now becomes '3'
                     */
                    

                    /**
                     * The assignment operator(%=) returns the remainder of the value of a variable after division.
                     * e.g. x = 6;
                     *     This, 'x %= 2;' is the same as 'x = x / 2'
                     * This will return the vaule '0' (as you know, 6 divided by 2 is 3 without any remainder) and 'x' now becomes '0'
                     */


                    /**
                     * The assignment operator bitwise-AND(&=).
                     * e.g. x = 25; the binary format of 25 is 0001 1001 (google it!)
                     * y = 15; the binary format of 15 is 0000 1111 (google it!)
                     * What this does is this: It compares the binary form of the values as shown below.
                     * Just like Truth table. T&T=T, T&F=F and so on...(same as T AND T = T, T AND F = F, F AND F = F, F AND T = F)
                     * But in this case, 0 represents False(F) and 1 represents True(T)
                     * 0001 1001
                     * &&&& &&&&
                     * 0000 1111
                     * _________
                     * 0000 1001
                     * 
                     * x &= y; (same as x = x & y;)
                     * 'x' now becomes '9'
                     * System.out.println(x) This prints '9'
                     * The number for the binary '0000 1001' is 9
                     */


                    /**
                     * The assignment operator bitwise-OR(|=).
                     * e.g. x = 25; the binary format of 25 is 0001 1001 (google it!)
                     * y = 15; the binary format of 15 is 0000 1111 (google it!)
                     * What this does is this: It compares the binary form of the values as shown below.
                     * Just like Truth table. T|T=T, T|F=T and so on...(same as T OR T = T, T OR F = T, F OR F = F, F OR T = T)
                     * But in this case, 0 represents False(F) and 1 represents True(T)
                     * 0001 1001
                     * |||| ||||
                     * 0000 1111
                     * _________
                     * 0001 1111
                     *
                     * x |= y; (same as x = x | y;)
                     * 'x' now becomes '31'
                     * System.out.println(x) This prints '31'
                     * The number for the binary '0001 1111' is 31
                     */


                    /**
                     * The assignment operator bitwise-XOR(^=).
                     * e.g. x = 25; the binary format of 25 is 0001 1001 (google it!)
                     * y = 15; the binary format of 15 is 0000 1111 (google it!)
                     * What this does is this: It compares the binary form of the values as shown below.
                     * Just like Truth table. T^T=F, T^F=T and so on...(same as T XOR T = F, T XOR F = T, F XOR F = F, F XOR T = T)
                     * But in this case, 0 represents False(F) and 1 represents True(T)
                     * 0001 1001
                     * ^^^^ ^^^^
                     * 0000 1111
                     * _________
                     * 0001 0110
                     *
                     *  x ^= y; (same as x = ^ y;)
                     * 'x' now becomes '22'
                     * System.out.println(x) This prints '22'
                     * The number for the binary '0001 0110' is 22
                     */


                    /**
                     * The assignment operator left-shift(<<=)
                     * left shift --> add '0s' starting from right to left
                     * e.g. int x = 15; the binary format of 15 is 0000 1111
                     * If i do this 'x <<= 2' which is same as 'x = x << 2',
                     * what i am telling the computer to do is to left-shift the value of 'x' by 2 bits.
                     * we have '0000 1111', it will add '00' to our inital binary number and we'll have this: '0000 0011 1100'
                     * if you convert this, '0000 0011 1100' to integer you'll have '60'
                     */


                    /**
                     * The assignment operator right-shift(>>=)
                     * right shift --> remove binary starting from right to left
                     * e.g. int x = 15; the binary format of 15 is 0000 1111
                     * If i do this 'x >>= 2' which is same as 'x = x >> 2',
                     * what i am telling the computer to do is to remove 2 bits from the value of 'x'.
                     * we have this, '0000 1111', it will remove the last two 1s from our inital binary number and we'll have this: '0000 11'
                     * if you convert this, '0000 11' to integer you'll have '3'
                     */


        /**
         * COMPARISON OPERATORS
         * They are used to are used to assign values to variables.
         * There are 6 comparison operators in java:
         * ==, !=, >, <, >= and <=
         */
                    /**
                     * The 'Equal to' operator(==)
                     * This operator compares two values e.g.
                     * e.g1. x = 6;
                     * y = 4;
                     * x == y;
                     * System.out.println(x == y); This returns 'false' because 'x' is not equal to 'y'
                     * 
                     * w = 2;
                     * v = 2;
                     * System.out.println(w == v); This returns 'true' because 'w' is equal to 'v'
                     */


                    /**
                     * The 'Not Equal to' operator(!=)
                     * This operator compares two values e.g.
                     * e.g2. x = 6;
                     * y = 4;
                     * x == y;
                     * System.out.println(x != y); This returns 'true' because 'x' is not equal to 'y'
                     * 
                     * w = 2;
                     * v = 2;
                     * System.out.println(w != v); This returns 'false' because 'w' is equal to 'v'
                     */
    }
}
