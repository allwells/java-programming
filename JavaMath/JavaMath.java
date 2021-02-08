public class JavaMath {

    public static void main(String[] args) {
        
        /**
         * JAVA MATH
         * The Java Math class has many methods that allows you to perform mathematical task on numbers.
         */

         // Math.max(x, y)
         // The method 'Math.max()' is used to find the highest value between two numbers.
         // Example
         int x = 5;
         int y = 2;
         int z = Math.max(x, y);
         System.out.println(z); // Outputs 5


         // Math.min(x, y)
         // The method 'Math.min()' is used to find the smallest value between two numbers.
         // Example
         int w = Math.min(x, y);
         System.out.println(w); // Outputs 2


         // Math.sqrt(x)
         // The method 'Math.sqrt()' is used to find the square root of a number.
         // Example
         System.out.println(Math.sqrt(64)); // Outputs 8.0


         // Math.abs(x)
         // The method 'Math.abs()' is used to find the absolute positive value of a number.
         // Example
         System.out.println(Math.abs(-4.7)); //Outputs 4.7


         // Math.random()
         // The method 'Math.random()' returns a random number between 0.0(inclusive) and 1.0(exclusive).
         // Example
         System.out.println(Math.random());
         // To get more control over the random number you can use the following method:
         // Example: you only want numbers between 0 and 100
         int randomNumber = (int) (Math.random() * 101); // 0 to 100
         // this, (int), means typecasting, like we did in TypeCast.
         System.out.println(randomNumber);


         // Exercise 1.0
         // Research other Mathematical methods in java

    }
    
}
