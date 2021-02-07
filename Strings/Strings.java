public class Strings {
    public static void main(String[] args) {
        /**
         * STRINGS IN Java
         * A String is used to store text.
         * A String variable contains a collection of characters surrounded by double quotes.
         */

         String greeting = "Hello World";
         // Here, I created a variable of type 'String' and assign it a value, 'Hello' using the 'equal to(=)' sign

         /**
          * STRING LENGTH => 'length()'
          * String length is a method in java that is used to get the length of strings.
          */

          String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          System.out.println("The length of the 'txt' string is " + txt.length());
          System.out.println("The length of the 'greeting' string is " + greeting.length());

          /**
           * MORE STRING METHODS
           * toUpperCase(), toLowerCase()
           * From the names I am pretty sure you can already tell what those methods do.
           */
          System.out.println("Hello World to Upper Case: " + greeting.toUpperCase());
          System.out.println("Hello World to Lower Case: " + greeting.toLowerCase());
          // You should try this on your own and play around with it so it sticks ;)

        /**
         * FINDING A CHARACTER IN A STRING
         * The indexOf() returns the index (i.e.the position) of the first occurence of a specified text in a string including whitespaces.
         */
        System.out.println("The index of or position of Z in 'txt' is " + txt.indexOf("Z")); // Outputs 25
        // I'm you were expecting 26 to be printed. You're not wrong tho.
        // Here's what Java does; Java counts from 0 and not 1.
        // The first index is '0' which is 'A', the second index is '1' which is 'B' and so on...


        /**
         * STRING CONCATENATION
         * How you ever wondered why we've been using the plus operator(+) in strings instead of in mathematical operations only?
         * Just take a chill pill...
         * The plus operator(+) can be used between strings to combine them. This is called 'CONCATENATION'
         */
    }
    
}
