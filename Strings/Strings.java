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
         * Let's take an example
         */

         String firstName = "YourFirstName";
         String lastName = "YourLastName";

         System.out.println("Concatenation using the plus operator: " + firstName + " " + lastName); // Outputs 'YourFirstName YourLastName'
         // Note that i have added an empty string to create a space between firstName and lastName.

         // You can also use the 'concat()' method to combine strings.
         System.out.println("Concatenation using the 'concat()' method: " + firstName.concat(lastName));

         /**
          * SPECIAL CHARACTERS
          */

          // ESCAPE CHARATERS
          // Because strings must be written in qoutes, java will misunderstand this string and generate and error.
          // System.out.prinln("PiggyVest was formerly called "PiggyBank" ");
          // The solution to this problem is the 'backslash escape character (\)'
          // The backslash escape character turns special characters into strings.
          //
        //   |________________________________________________________________|
          // |         |                     |            |                   |
          // |   S/N   |  Escape Charater    |   Result   |   Description     |
          // |_________|_____________________|____________|___________________|
          // |         |                     |            |                   |
          // |    1    |       \'            |      '     |   Single qoute    |
          // |_________|_____________________|____________|___________________|
          // |         |                     |            |                   |
          // |    2    |       \"            |      "     |   Double qoute    |
          // |_________|_____________________|____________|___________________|
          // |         |                     |            |                   |
          // |    3    |       \\            |      \     |   Backslash       |
          // |_________|_____________________|____________|___________________|
          // |         |                     |                                |
          // |    4    |       \n            |      New Line                  |
          // |_________|_____________________|________________________________|
          // |         |                     |                                |
          // |    5    |       \r            |      Carriage Return           |
          // |_________|_____________________|________________________________|
          // |         |                     |                                |
          // |    6    |       \t            |      Tab                       |
          // |_________|_____________________|________________________________|
          // |         |                     |                                |
          // |    7    |       \b            |      Backspace                 |
          // |_________|_____________________|________________________________|
          // |         |                     |                                |
          // |    8    |       \f            |      Form Feed                 |
          // |_________|_____________________|________________________________|


          // The sequence, \', inserts a single qoute in a string.
          System.out.println("This inserts \'Single Quotes\' in a string.");

          // The sequence, \", inserts a double qoute in a string.
          System.out.println("This inserts \"Double Quotes\" in a string.");

          // The sequence, \\, inserts a backslash in a string.
          System.out.println("This inserts \\Backslash in a string ");

          // The sequence, \n, creates a new line.
          System.out.println("This create a new\n line.");

          // The sequence, \r, just like the function of the 'Enter' button on our keyboards,
          // returns "line" string to a new line. Just like what this,\n, does.
          System.out.println("This returns a string to a new\rline");

          // The sequence, \t, functions same way as the 'tab' button on our keyboards.
          System.out.println("\tPiggyVest was formerly called PiggyBank");

          // The sequence, \b, this deletes the letters from a string just like the "<-backspace" button on our keyboards.
          System.out.println("This will delete\b the 'e' from the word 'delete'");

          // The sequence, \f, 
          System.out.println("This will form feed\f the string");
    }
    
}
