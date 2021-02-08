public class IfElseStatements {

    public static void main(String[] args) {
        /**
         * IF...ELSE STATEMENTS
         * if...else statements are conditional statements.
         * Java has the following conditional statements:
         * 'if' => to spto specify a block of code to be executed, if a specified condition is 'true'
         * 'else' => to specify a block of code to be executed, if the same condition is 'false'
         * 'else if' => to specify a new condition to test, if the first condition is 'false'
         * 'switch' => to specify many alternative blocks of code to be executed
         */

         // The if Statement
         // Syntax:
         // if (condition) {
         //    block of code to be executed if the condition is 'true'
         // }
         // Example

         int x = 30;
         int y = 5;
         if (x > y) {
             System.out.println("x is greater than y");
         }

         // The else Statement
         // Syntax:
         // if (condition) {
         //    block of code to be executed if the condition is 'true'
         // } else {
         //    block of code to be executed if the condition is 'false'
         // }
         // Example
         x = 12;
         y = 50;
         if (x > y) {
             System.out.println("x is greater than y");
         } else {
             System.out.println("y is greater than x");
         }

         // The else Statement
         // Syntax:
         // if(condition1) {
         //    block of code to be executed if the condition1 is 'true'
         // } else if(condition2) {
         //    block of code to be executed if the condition1 is 'false' and condition2 is 'true'
         // } else {
         //    block of code to be executed if the condition1 and condition2 are 'false'
         // }
         // Example
         int time = 24;

         if (time < 12) {
             System.out.println("Good morning!");
         } else if (time > 12 && time < 3){
             System.out.println("Good day!");
         } else {
             System.out.println("Good evening!");
         }

         // Short Hand if...else (Ternary Operator)
         // Another simple way to write if...else statement is shown in the syntax below.
         // Syntax:
         // variable = (condition) ? expressionTrue : expressionFalse;
         // Example
         int day = 8;
         String today = day == 8 ? "Today is Monday" : "Today is not Monday";
         System.out.println(today);
    }
}
