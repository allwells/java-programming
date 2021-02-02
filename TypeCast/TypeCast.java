/**
 * @author Allwell Onen
 * @since 2nd February, 2021
 */

public class TypeCast {
    public static void main(String[] args) {
    /**
     * There are two types of casting
     * - Widening Casting
     * - Narrowing Casting
     */
        
        byte byteNumb = 100;
        System.out.println(byteNumb);

        short shortNumb = (short) byteNumb;
        System.out.println(shortNumb);

        int intNumb = (int) shortNumb;
        System.out.println(intNumb);

        long longNumb = (long) intNumb;
        System.out.println(longNumb);

        float floatNumb = (float) longNumb;
        System.out.println(floatNumb);

        double doubleNumb = (double) floatNumb;
        System.out.println(doubleNumb);
    }
}
