/**
 * Pass.java
 *
 * Version: 1.0
 *
 * @author      Rupa Karumanchi
 *
 */

/***
 * A simple example depicting Java's pass by value in action
 */
class Pass {
    public static void swap(int a, int b)
    {
        System.out.println("a = " + a + ", b = " + b);

        int temp;
        temp = b;
        b = a;
        a = temp;

        // got swapped but won't reflect in main method

        System.out.println("a = " + a + ", b = " + b); // swapped output
    }
    public static void main(String[] args)
    {

        int i = 10;
        int j = 20;

        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);

    }
}

