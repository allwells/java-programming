public class Variables {
    public static void main(String[] args) {
        String name = "yourname";
        int age = 12;
        double weight = 19.99;
        char letterA = 'A';
        boolean choice = true;

        System.out.println("String: " + name);
        System.out.println("int: " + age);
        System.out.println("double: " + weight);
        System.out.println("char: " + letterA);
        System.out.println("boolean: " + choice);

        System.out.println("\n======================================================");
        name = "Allwell"; 
        /** name is now 'Allwell' and NOT 'yourname'
         * This also applies for all other data types
        */
        System.out.println(name);
        
    }
}
